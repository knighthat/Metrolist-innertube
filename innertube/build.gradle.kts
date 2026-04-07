plugins {
    alias( libs.plugins.android.library )
    alias( libs.plugins.serialization )
}

android {
    namespace = "com.metrolist.innertube"
    compileSdk = libs.versions.compileSdk.get().toInt()
    androidResources.enable = false     // Disable to speedup build

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    api( libs.bundles.newpipe )
    implementation( libs.bundles.networking )
    implementation( libs.timber )
    implementation( libs.kotlinx.serialization.json )
    implementation( libs.bundles.basic )
}
