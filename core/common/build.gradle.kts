import com.youtubeclone.buildsrc.*

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.youtubeclone.common"
}

dependencies {

    Dep.Kotlin.CoroutineList.forEach(::implementation)

    testImplementation("junit:junit:4.13.2")
}