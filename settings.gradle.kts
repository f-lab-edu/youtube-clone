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
    ":core:designsystem",

    ":feature:main",
    ":feature:home",
    ":feature:shorts",
    ":feature:subscriptions",
    ":feature:library"
)
