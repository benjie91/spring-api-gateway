plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.kotlin.plugin.spring") version "1.5.31"

    // Kotlin Linter
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
    id("org.jlleitschuh.gradle.ktlint-idea") version "10.2.0"

    // Spring dependencies
    id("org.springframework.boot") version "2.6.1"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")

    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.1")
    implementation("org.springdoc:springdoc-openapi-webflux-ui:1.6.1")

    testImplementation(kotlin("test"))
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2021.0.0")
    }
}

tasks {
    test {
        useTestNG()
    }
}
