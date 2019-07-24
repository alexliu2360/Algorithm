# Install script for directory: /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm

# Set the install prefix
if(NOT DEFINED CMAKE_INSTALL_PREFIX)
  set(CMAKE_INSTALL_PREFIX "/usr/local")
endif()
string(REGEX REPLACE "/$" "" CMAKE_INSTALL_PREFIX "${CMAKE_INSTALL_PREFIX}")

# Set the install configuration name.
if(NOT DEFINED CMAKE_INSTALL_CONFIG_NAME)
  if(BUILD_TYPE)
    string(REGEX REPLACE "^[^A-Za-z0-9_]+" ""
           CMAKE_INSTALL_CONFIG_NAME "${BUILD_TYPE}")
  else()
    set(CMAKE_INSTALL_CONFIG_NAME "Debug")
  endif()
  message(STATUS "Install configuration: \"${CMAKE_INSTALL_CONFIG_NAME}\"")
endif()

# Set the component getting installed.
if(NOT CMAKE_INSTALL_COMPONENT)
  if(COMPONENT)
    message(STATUS "Install component: \"${COMPONENT}\"")
    set(CMAKE_INSTALL_COMPONENT "${COMPONENT}")
  else()
    set(CMAKE_INSTALL_COMPONENT)
  endif()
endif()

# Install shared libraries without execute permission?
if(NOT DEFINED CMAKE_INSTALL_SO_NO_EXE)
  set(CMAKE_INSTALL_SO_NO_EXE "1")
endif()

if(NOT CMAKE_INSTALL_LOCAL_ONLY)
  # Include the install script for each subdirectory.
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_01_selection_sort/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_02_selection_sort_using_template/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_03_selection_sort_generate_test_cases/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_04_selection_sort_detect_performace/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_05_insertion_sort/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_06_insertion_sort_advance/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_07_optimized_selection_sort/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_08_bubble_sort/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_09_shell_sort/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_01_merge_sort/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_02_merge_sort_advanced/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/1_summarize/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_03_merge_bottom_up/cmake_install.cmake")
  include("/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_04_quick_sort/cmake_install.cmake")

endif()

if(CMAKE_INSTALL_COMPONENT)
  set(CMAKE_INSTALL_MANIFEST "install_manifest_${CMAKE_INSTALL_COMPONENT}.txt")
else()
  set(CMAKE_INSTALL_MANIFEST "install_manifest.txt")
endif()

string(REPLACE ";" "\n" CMAKE_INSTALL_MANIFEST_CONTENT
       "${CMAKE_INSTALL_MANIFEST_FILES}")
file(WRITE "/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/${CMAKE_INSTALL_MANIFEST}"
     "${CMAKE_INSTALL_MANIFEST_CONTENT}")
