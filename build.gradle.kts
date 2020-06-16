plugins {
   id("us.ihmc.ihmc-build") version "0.20.1"
   id("us.ihmc.log-tools-plugin") version "0.5.0"
   id("us.ihmc.ihmc-cd") version "1.8"
}

ihmc {
   group = "us.ihmc"
   version = "4.0.0-ihmc5"
   vcsUrl = "https://github.com/ihmcrobotics/jassimp-build"
   openSource = true
   maintainer = "Duncan Calvert"

   configureDependencyResolution()
   configurePublications()
}

ihmc.sourceSet("main").java.srcDirs("assimp/port/jassimp/jassimp/src/")

mainDependencies {
   api("us.ihmc:ihmc-native-library-loader:1.2.1")
}
