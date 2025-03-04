plugins {
    kotlin("jvm") version "1.8.10"
    `java-gradle-plugin`
    `kotlin-dsl`
}

apply(from = "../repositories.gradle.kts")

dependencies {
    val androidPluginVersion = rootProject.extra["androidPluginVersion"].toString()
    val kotlinVersion = rootProject.extra["kotlinVersion"].toString()
    val hutoolVersion = rootProject.extra["hutoolVersion"].toString()
    implementation("com.android.tools.build:gradle:$androidPluginVersion")
    implementation("com.android.tools.build:gradle-api:$androidPluginVersion")
    implementation(kotlin("gradle-plugin", kotlinVersion))
    implementation(kotlin("stdlib", kotlinVersion))
    implementation("cn.hutool:hutool-http:$hutoolVersion")
    implementation("cn.hutool:hutool-crypto:$hutoolVersion")
    implementation("org.tukaani:xz:1.9")
    implementation("com.github.triplet.gradle:play-publisher:3.6.0")
    implementation("org.kohsuke:github-api:1.131")
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.3")
    implementation("com.mikepenz.aboutlibraries.plugin:aboutlibraries-plugin:8.9.1")
    implementation("com.google.protobuf:protobuf-gradle-plugin:0.8.17")
    implementation("com.github.ben-manes:gradle-versions-plugin:0.39.0")
}