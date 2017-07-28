# Assimp Build

This project provides packaging for the assimp project and jassimp port.

## Building

### Updating submodules
```
git submodule update --init --recursive
```

### C/C++ code. 
The ihmc build CMakeLists.txt is setup with the correct options by default, just need to run it.

```
mkdir build
cd build
cmake ..
make -j12
make install
```