plugins {
    kotlin("jvm") version "1.9.23"
}

group = "xyz.cssxsh.leetcode"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    target.compilations {
        all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    test {
        useJUnitPlatform()
    }
}