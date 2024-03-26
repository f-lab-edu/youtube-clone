plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.youtubeclone.domain"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:model"))

    implementation(com.youtubeclone.buildsrc.Dep.Hilt.hilt)
    kapt(com.youtubeclone.buildsrc.Dep.Hilt.compiler)
    testImplementation("junit:junit:4.13.2")
}