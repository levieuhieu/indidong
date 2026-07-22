-keep class kotlin.Metadata { *; }
-keep class kotlin.** { *; }
-dontwarn kotlin.**

-keep class androidx.** { *; }
-dontwarn androidx.**

-keep class com.google.android.material.** { *; }
-dontwarn com.google.android.material.**

-keep class kotlinx.serialization.** { *; }
-dontwarn kotlinx.serialization.**

-keep class retrofit2.** { *; }
-dontwarn retrofit2.**

-keep class okhttp3.** { *; }
-dontwarn okhttp3.**

-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
}

-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile
