plugins {
  kotlin("jvm")
  kotlin("kapt")
}

dependencies {
  implementation("com.google.dagger:dagger:2.56.2")
  kapt("com.google.dagger:dagger-compiler:2.56.2")

  implementation("com.google.auto.value:auto-value-annotations:1.11.0")
  kapt("com.google.auto.value:auto-value:1.11.0")
}
