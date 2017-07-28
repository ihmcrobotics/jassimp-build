cmake_minimum_required( VERSION 2.8 )

IF(CMAKE_INSTALL_PREFIX_INITIALIZED_TO_DEFAULT)
  SET(CMAKE_INSTALL_PREFIX
    ${CMAKE_BINARY_DIR}/install CACHE PATH "JAssimp install prefix" FORCE
    )
ENDIF(CMAKE_INSTALL_PREFIX_INITIALIZED_TO_DEFAULT)


SET(CMAKE_BUILD_TYPE MinSizeRel)

set(ASSIMP_NO_EXPORT ON CACHE BOOL "")
set(ASSIMP_BUILD_ZLIB ON CACHE BOOL "")
set(ASSIMP_BUILD_ASSIMP_TOOLS OFF CACHE BOOL "")
set(ASSIMP_BUILD_TESTS OFF CACHE BOOL "")
set(BUILD_SHARED_LIBS OFF CACHE BOOL "")
IF(NOT APPLE)
	set (CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -s")
	set (CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -s")
ENDIF()


find_package(JNI REQUIRED)
include_directories(${JNI_INCLUDE_DIRS})

add_subdirectory(assimp)


include_directories("${CMAKE_SOURCE_DIR}/assimp/include")
include_directories("${CMAKE_BINARY_DIR}/assimp/include")

add_library(jassimp SHARED assimp/port/jassimp/jassimp-native/src/jassimp.cpp)
target_link_libraries(jassimp assimp IrrXML zlibstatic)

install(TARGETS jassimp LIBRARY DESTINATION ${CMAKE_SOURCE_DIR}/resources/jassimp)
