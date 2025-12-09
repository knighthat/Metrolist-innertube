plugins {
    alias(libs.plugins.kotlin.serialization)
    kotlin("jvm")
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation( libs.bundles.ktor )
    implementation( libs.brotli )
    implementation( libs.extractor )
    testImplementation( libs.bundles.junit5 )
}
