val kotlinVersion: String by project
val spekVersion: String by project
val camundaVersion: String by project

plugins {
    id("com.github.johnrengelman.shadow")
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.plugin.allopen")
    id("org.jetbrains.kotlin.plugin.spring")
}


dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
//    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")

    compileOnly(platform("org.camunda.bpm:camunda-bom:$camundaVersion"))
    compileOnly("org.camunda.bpm:camunda-engine")

//    compileOnly("org.camunda.bpm:camunda-engine-plugin-spin")
//    compileOnly("org.camunda.spin:camunda-spin-dataformat-json-jackson")


    implementation("org.codehaus.groovy:groovy-all:3.0.7")
//    runtimeOnly("org.apache.ivy:ivy:2.5.0")

    compileOnly("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter")
    compileOnly("org.springframework.boot:spring-boot-starter-web")

}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}