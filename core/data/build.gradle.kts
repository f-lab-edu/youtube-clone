import com.youtubeclone.buildsrc.Dep

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.youtubeclone.data"
}

dependencies {

    implementation(Dep.Kotlin.serializationJson)
    Dep.Retrofit.RetrofitList.forEach(::implementation)
}