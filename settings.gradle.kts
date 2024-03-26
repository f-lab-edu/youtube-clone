pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "YoutubeClone"
include(
    ":app",
    ":core:model",
    ":core:domain",
    ":core:data",
    ":core:navigation",
    ":feature:main"
)
include(":feature:shorts")
include(":feature:subscriptions")
include(":feature:library")
include(":core:common")
