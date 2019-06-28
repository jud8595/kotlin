import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

allprojects {
    repositories {
        jcenter()
    }
}

plugins {
	idea
	kotlin("jvm") version "1.2.71" apply false
}

subprojects {
    version = "1.0"
	apply(plugin = "kotlin")
	
	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "1.8"
		}
	}
	
	tasks.named<Test>("test") {
		useJUnitPlatform()
	}
	
	dependencies {
		"testImplementation"("org.junit.jupiter:junit-jupiter-api:5.1.0")
		"testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.1.0")
		"testImplementation"("io.mockk:mockk:1.9.3")
	}
}

project(":application") {
    dependencies {
        "implementation"(project(":domain"))
		"implementation"(project(":infrastructure"))
    }
}

project(":infrastructure") {
    dependencies {
        "implementation"(project(":domain"))
    }
}



