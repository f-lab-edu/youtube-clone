import com.youtubeclone.buildsrc.Dep
import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.youtubeclone.data"
    defaultConfig {
        buildConfigField(
            "String",
            "YOUTUBE_API_KEY",
            gradleLocalProperties(rootDir).getProperty("YOUTUBE_API_KEY")
        )
    }
    buildFeatures {
        buildConfig = true
    }
}

dependencies {

    implementation(Dep.Kotlin.serializationJson)
    Dep.Retrofit.RetrofitList.forEach(::implementation)
}