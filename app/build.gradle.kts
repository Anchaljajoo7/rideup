plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.rideup"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.rideup"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("io.github.chaosleung:pinview:1.4.4")
//    implementation ("com.google.android.gms:play-services:11.6.0")
//    implementation ("com.google.android.gms:play-services-maps:15.0.1")
    implementation("com.google.maps.android:android-maps-utils:3.8.0")
//    implementation ("com.google.android.gms:play-services:12.0.1")
    implementation("com.android.support:multidex:1.0.3")
    implementation("com.google.android.gms:play-services:8.4.0")
    implementation("com.google.android.gms:play-services-measurement:17.6.0")
    implementation("com.intuit.ssp:ssp-android:1.1.0")
    implementation ("com.intuit.sdp:sdp-android:1.1.0")
}