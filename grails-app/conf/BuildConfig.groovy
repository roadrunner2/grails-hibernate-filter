grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'

grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
    }

    plugins {
        build (":release:3.0.1") {
            export = false
        }
        build (":rest-client-builder:1.0.2") {
            export = false
        }
        compile (":hibernate4:4.3.5.5") {
            export = false
        }
    }
}