import com.youtubeclone.buildsrc.*

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.youtubeclone.designsystem"

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
}

dependencies {

    Dep.androidList.forEach(::implementation)
    Dep.Compose.ComposeList.forEach(::implementation)

    testImplementation("junit:junit:4.13.2")
}