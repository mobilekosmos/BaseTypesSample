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

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    val githubPackagesUsername: String by settings
    val githubPackagesPassword: String by settings
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Hagleitner-HsM/hsm-basetypes-kmm-distribution")
            credentials {
                username = githubPackagesUsername
                password = githubPackagesPassword
            }
        }
    }
}

rootProject.name = "BaseTypesSample"
include(":app")
 