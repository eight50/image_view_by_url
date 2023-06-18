buildscript {
    val composeVersion: String by extra("1.4.1")
    val ktorVersion: String by extra("2.3.1")

    repositories {
        mavenCentral()
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.4.1" apply false
    id ("com.android.library") version "7.4.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.8.0" apply false
}