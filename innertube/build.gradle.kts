plugins {
    alias( libs.plugins.android.library )
    alias( libs.plugins.serialization )
}

android {
    namespace = "com.metrolist.innertube"
    compileSdk = libs.versions.compileSdk.get().toInt()
    androidResources {      // Disable to speedup build
        enable = false
    }

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
    implementation( libs.koin.core )
    implementation( libs.kermit )
    implementation( libs.timber )
    implementation( libs.kotlinx.serialization.json )
}
