pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "WhatsPackt"
include(":app")

//COMMON...
include(":common:domain")
include(":common:data")
include(":common:framework")

//FEATURE...
include(":feature:create_chat")
include(":feature:conversations")
include(":feature:chat")
