plugins {
   id("us.ihmc.ihmc-build") version "0.19.5"
   id("us.ihmc.log-tools") version "0.3.1"
}

ihmc {
   group = "us.ihmc"
   version = "4.0.0-ihmc3"
   vcsUrl = "https://github.com/ihmcrobotics/jassimp-build"
   openSource = true
   maintainer = "Duncan Calvert"

   configureDependencyResolution()
   configurePublications()
}

ihmc.sourceSet("main").java.srcDirs("assimp/port/jassimp/jassimp/src/")

mainDependencies {
   compile("us.ihmc:ihmc-native-library-loader:1.1")
}
