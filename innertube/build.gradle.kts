plugins {
    // Other
    alias( libs.plugins.kotlin.jvm )
    alias( libs.plugins.serialization )
}

dependencies {
    // Networking
    implementation( libs.bundles.ktor )
    implementation( libs.brotli )
    // Dependency injection
    implementation( platform(libs.koin.bom) )
    implementation( libs.koin.core )
    // Others
    implementation( libs.newpipe.extractor )
    implementation( libs.kermit )
}