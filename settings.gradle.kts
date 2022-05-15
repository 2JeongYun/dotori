pluginManagement {
    val kotlinPluginVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinPluginVersion
        kotlin("plugin.jpa") version kotlinPluginVersion
        kotlin("plugin.spring") version kotlinPluginVersion
    }
}

rootProject.name = "dotori"
include("dotori-core", "dotori-provider")