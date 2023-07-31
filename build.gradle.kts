plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    implementation("org.springframework.boot:spring-boot-autoconfigure:3.1.0")
    implementation("org.yaml:snakeyaml:2.0")
    implementation("mysql:mysql-connector-java:8.0.28")
    implementation ("org.springframework.boot:spring-boot-starter-jdbc:3.0.4")
    testImplementation ("org.springframework.boot:spring-boot-starter-test:3.1.0")
}

tasks.test {
    useJUnitPlatform()
}