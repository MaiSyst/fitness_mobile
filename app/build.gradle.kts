plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
     kotlin("kapt")
  id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.maisyst.maifitness"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.maisyst.maifitness"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildToolsVersion = "33.0.2"
    ndkVersion = "25.2.9519653"
}

dependencies {
    val daggerHilt= "2.48.1"
    val lifecycleVersion="2.6.2"
    val media3Version="1.1.1"
    val ktorVersion="2.3.5"
    val composeUI="1.5.3"
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation(platform("androidx.compose:compose-bom:2023.10.00"))
    implementation("androidx.compose.ui:ui:$composeUI")
    implementation("androidx.compose.ui:ui-graphics:$composeUI")
    implementation("androidx.compose.ui:ui-tooling-preview:$composeUI")
    implementation("androidx.compose.material3:material3:1.1.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.10.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling:$composeUI")
    debugImplementation("androidx.compose.ui:ui-test-manifest:$composeUI")
    // Dagger hilt injection dependance
    implementation("com.google.dagger:hilt-android:$daggerHilt")
    kapt("com.google.dagger:hilt-compiler:$daggerHilt")
    kapt ("com.google.dagger:hilt-android-compiler:$daggerHilt")
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    // lifecycle
        implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")
    // Exoplayer
        implementation("androidx.media3:media3-exoplayer:$media3Version")
    // For building media playback UIs
    implementation("androidx.media3:media3-ui:$media3Version")
    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation ("androidx.navigation:navigation-compose:2.7.3")
    // Image fetching
     implementation("io.coil-kt:coil-compose:2.4.0")
    //Ktor Client
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
}
kapt {
  correctErrorTypes = true
}