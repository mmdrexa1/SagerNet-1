plugins {
    id("com.android.library")
}

setupCommon()

dependencies {
    implementation("androidx.annotation:annotation:1.3.0")
}
android {
    namespace = "com.android.stub"
}
