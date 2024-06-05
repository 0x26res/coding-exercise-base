import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "org.ox26res"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:5.5.0")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("org.ox26res.CodingExerciseJava")
}


tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}