plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
}

apply(from = "${rootDir}/gradle/common.gradle")

android {
    namespace = "org.ton.wallet.data.settings.api"
}

dependencies {
    implementation(libs.coroutines)
    implementation(project(":data:core"))
}