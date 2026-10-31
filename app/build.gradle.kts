plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "id.sch.smkn4tanjungpinang.pintary"
    compileSdk = 35

    defaultConfig {
        applicationId = "id.sch.smkn4tanjungpinang.pintary"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation("androidx.activity:activity-ktx:1.9.3")
}
