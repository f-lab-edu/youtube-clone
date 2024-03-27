package com.example.common

import android.app.Notification
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart


sealed interface Result<out T> {
    data class Success<T>(val data: T) : Result<T>
    data class Error(val exception: Throwable) : Result<Nothing>
    data object Loading : Result<Nothing>
}

fun <T> Flow<T>.asResult(): Flow<Result<T>> = map<T, Result<T>> { Result.Success(it) }
    .onStart { emit(Result.Loading) }
    .catch { emit(Result.Error(it)) }

val Result<*>.Success
    get() = this is Result.Success && data != null

val <T> Result<T>.response: T?
    get() = (this as? Result.Success)?.data

val <T> Result<T>.Error: Throwable?
    get() = (this as? Result.Error)?.exception

fun <T> Result<T>.executeResult(
    onSuccess: (T) -> Unit,
    onError: ((Throwable?) -> Unit)? = null
) {
    when {
        this.Success -> response?.let { onSuccess(it) }
        else -> onError?.let { onError(Error) }
    }
}