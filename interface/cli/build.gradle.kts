plugins {
    id("application") 
}

application {
    mainClass.set("com.emincankarasoy.Main") 
}

dependencies {
    implementation(project(":core:application"))
    implementation(project(":infrastructure:infrastructure"))
    implementation(project(":infrastructure:persistance"))
}
