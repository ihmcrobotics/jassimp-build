# Assimp Build

This project provides packaging for the assimp project and jassimp port.

## Building

### Updating submodules
```
git submodule update --init --recursive
```

### C/C++ code 
The ihmc build CMakeLists.txt is setup with the correct options by default, just need to run it.

#### Linux/Mac
```
mkdir build
cd build
cmake ..
make -j12
make install
```

#### Windows
- Install cmake 
- Install Visual Studio 2017 community edition.
- Start the x64 Native Tools Command Prompt for VS 2017
- mkdir [source directory]\build
- cd [source directory]\build
- Run "C:\Program Files\CMake\bin\cmake.exe" -G "Visual Studio 15 2017 Win64" ..
- Run "C:\Program Files\CMake\bin\cmake.exe" --build . --config Release --target install

### Java code
The gradle build system is used to built the java code. When changing the C code, build that first.

To deploy the code locally
```
gradle publish
```

To deploy to bintray
```
gradle publish -PpublishUrl=ihmcRelease
```