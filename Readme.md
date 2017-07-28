# Assimp Build

This project provides packaging for the assimp project and jassimp port.

## Building

### Updating submodules
```
git submodule update --init --recursive
```

### C/C++ code 
The ihmc build CMakeLists.txt is setup with the correct options by default, just need to run it.

```
mkdir build
cd build
cmake ..
make -j12
make install
```

### Java code
The gradle build system is used to built the java code. When changing the C code, build that first.

To deploy the code locally
```
gradle publishToMavenLocal

```

To deploy to bintray
```
gradle bintrayUpload
```