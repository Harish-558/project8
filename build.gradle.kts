plugins {
    // Keep your AGP version
    id("com.android.application") version "8.2.0" apply false

    // Stable Kotlin version for AGP 8.2.0
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

    // DOWNGRADED: Version 2.7.7 is the last version that works perfectly with SDK 34
    // Using 2.8.0 or higher is what triggers the "Requires SDK 36" error
    id("androidx.navigation.safeargs.kotlin") version "2.7.7" apply false

}