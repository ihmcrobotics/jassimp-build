plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.log-tools-plugin") version "0.6.3"
   id("us.ihmc.ihmc-cd") version "1.23"
}

ihmc {
   group = "us.ihmc"
   version = "4.0.0-ihmc6"
   vcsUrl = "https://github.com/ihmcrobotics/jassimp-build"
   openSource = true
   maintainer = "Duncan Calvert"

   configureDependencyResolution()
   configurePublications()
}

ihmc.sourceSet("main").java.srcDirs("assimp/port/jassimp/jassimp/src/")

mainDependencies {
   api("us.ihmc:ihmc-native-library-loader:1.3.1")
}
