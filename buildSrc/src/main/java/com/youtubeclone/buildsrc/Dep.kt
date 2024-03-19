package com.youtubeclone.buildsrc

object Dep{

    const val androidGradlePlugin = "com.android.tools.build:gradle:8.1.0"
    const val androidGradleApiPlugin = "com.android.tools.build:gradle-api:8.1.0"

    object Andriod{
        const val core = "androidx.core:core-ktx:1.10.1"
        const val appcompat = "androidx.appcompat:appcompat:1.6.1"
        const val activitiy = "androidx.activity:activity-ktx:1.7.2"
        const val fragment = "androidx.fragment:fragment-ktx:1.6.1"
    }

    val androidList = listOf(
        "androidx.core:core-ktx:1.10.1",
        "androidx.appcompat:appcompat:1.6.1",
        "androidx.activity:activity-ktx:1.7.2",
        "androidx.fragment:fragment-ktx:1.6.1"
    )

    object LifeCycle{
        private const val lifecycleVersion = "2.6.1"

        val LifeCycleList = listOf(
            "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion",
            "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion",
            "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
        )
    }

    object Kotlin{
        private const val kotlinVersion = "1.9.0"
        private const val coroutineVersion = "1.7.3"

        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
        const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0"
        const val serializationPlugin = "org.jetbrains.kotlin:kotlin-serialization:1.6.0"

        val CoroutineList = listOf(
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion",
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion"
        )
    }

    object Glide{

    }

    object Retrofit{
        private const val retrofitVersion = "2.9.0"

        val RetrofitList = listOf(
            "com.squareup.retrofit2:retrofit:$retrofitVersion",
            "com.squareup.retrofit2:converter-gson:$retrofitVersion",
            "com.squareup.retrofit2:converter-scalars:$retrofitVersion",
            "com.squareup.okhttp3:logging-interceptor:3.9.1"
        )

    }

    object Compose{

        val ComposeList = listOf(
            "androidx.compose.ui:ui:1.5.0",
            "androidx.compose.ui:ui-tooling:1.5.0",
            "androidx.navigation:navigation-compose:2.7.0",
            "androidx.hilt:hilt-navigation-compose:1.0.0",
            "androidx.compose.material3:material3-android:1.2.0-alpha05",
            "androidx.activity:activity-compose:1.7.2",
            "androidx.lifecycle:lifecycle-runtime-compose:2.6.1",
            "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1",
            "androidx.compose.runtime:runtime-livedata:1.5.0",
        )

    }

    object Google{
        const val gson = "com.google.code.gson:gson:2.8.6"
    }
    object Hilt{
        private const val hiltVersion = "2.50"

        const val hilt = "com.google.dagger:hilt-android:$hiltVersion"
        const val compiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
        const val plugin = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
    }

    object Flipper{
        const val core = "com.facebook.flipper:flipper:0.249.0"
        const val soloader = "com.facebook.soloader:soloader:0.10.5"
        const val networkplugin = "com.facebook.flipper:flipper-network-plugin:0.249.0"
        const val noop = "com.facebook.flipper:flipper-noop:0.249.0"
    }

    const val timber = "com.jakewharton.timber:timber:5.0.1"
}