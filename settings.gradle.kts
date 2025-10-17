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
        maven ("https://jitpack.io")
        maven("https://oss.sonatype.org/content/repositories/public")
        maven("https://artifactory.appodeal.com/appodeal-public/")

        gradlePluginPortal()
    }
}

rootProject.name = "c001apk"
include(":app", ":mojito", ":SketchImageViewLoader", ":GlideImageLoader")
 
