plugins {
    id("java")
    id("idea")
    id("fr.snowtyy.releasr") version "1.0.0"
    id("com.gradleup.shadow") version "9.3.2"
}

group = "fr.snowtyy"

repositories {
    mavenCentral()
    maven {
        name = "maven-public"
        url = uri("https://repo.lylaw.fr/repository/maven-public/")
    }
}

dependencies {
    implementation("org.jetbrains:annotations:24.0.1")
    implementation("org.slf4j:slf4j-simple:1.6.1")

    compileOnly("fr.snowtyy:papermc:1.8.8")

    implementation("fr.snowtyy:reflex:0.1.0-1776280232-main-1c5defa")

}

releasr {
    url = "https://repo.lylaw.fr/repository/maven-releases/"
    username = findProperty("REPO_USER") as String? ?: System.getenv("repoUser")
    password = findProperty("REPO_PASSWORD") as String? ?: System.getenv("repoPassword")
}

tasks.shadowJar {
    archiveClassifier.set("")
}

tasks.build {
    dependsOn(tasks.shadowJar)
}