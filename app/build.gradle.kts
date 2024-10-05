plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.personalprofilepage"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.personalprofilepage"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0") // Update to the latest version
    implementation("androidx.appcompat:appcompat:1.6.1") // Update to the latest version
    implementation("com.google.android.material:material:1.10.0") // Update to the latest version
    implementation("androidx.activity:activity-ktx:1.7.2") // Update to the latest version
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Update to the latest version
    testImplementation("junit:junit:4.13.2") // Update to the latest version
    androidTestImplementation("androidx.test.ext:junit:1.1.5") // Update to the latest version
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") // Update to the latest version
}
