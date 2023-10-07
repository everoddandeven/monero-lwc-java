plugins {
    id("java-library")
}

group = "monero.lwc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.json/json
    implementation("org.json:json:20230618")

}

tasks.test {
    useJUnitPlatform()
}