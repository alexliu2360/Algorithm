# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.8

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /home/alexliu/software/clion-2017.2.3/bin/cmake/bin/cmake

# The command to remove a file.
RM = /home/alexliu/software/clion-2017.2.3/bin/cmake/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug

# Include any dependencies generated for this target.
include 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/depend.make

# Include the progress variables for this target.
include 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/progress.make

# Include the compile flags for this target's objects.
include 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/flags.make

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o: 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/flags.make
2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o: ../2_01_merge_sort/main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o"
	cd /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_01_merge_sort && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/2_01_merge_sort.dir/main.cpp.o -c /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/2_01_merge_sort/main.cpp

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/2_01_merge_sort.dir/main.cpp.i"
	cd /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_01_merge_sort && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/2_01_merge_sort/main.cpp > CMakeFiles/2_01_merge_sort.dir/main.cpp.i

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/2_01_merge_sort.dir/main.cpp.s"
	cd /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_01_merge_sort && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/2_01_merge_sort/main.cpp -o CMakeFiles/2_01_merge_sort.dir/main.cpp.s

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o.requires:

.PHONY : 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o.requires

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o.provides: 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o.requires
	$(MAKE) -f 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/build.make 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o.provides.build
.PHONY : 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o.provides

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o.provides.build: 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o


# Object files for target 2_01_merge_sort
2_01_merge_sort_OBJECTS = \
"CMakeFiles/2_01_merge_sort.dir/main.cpp.o"

# External object files for target 2_01_merge_sort
2_01_merge_sort_EXTERNAL_OBJECTS =

2_01_merge_sort/2_01_merge_sort: 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o
2_01_merge_sort/2_01_merge_sort: 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/build.make
2_01_merge_sort/2_01_merge_sort: 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable 2_01_merge_sort"
	cd /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_01_merge_sort && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/2_01_merge_sort.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/build: 2_01_merge_sort/2_01_merge_sort

.PHONY : 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/build

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/requires: 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/main.cpp.o.requires

.PHONY : 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/requires

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/clean:
	cd /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_01_merge_sort && $(CMAKE_COMMAND) -P CMakeFiles/2_01_merge_sort.dir/cmake_clean.cmake
.PHONY : 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/clean

2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/depend:
	cd /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/2_01_merge_sort /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_01_merge_sort /home/alexliu/Documents/code/ex/imooc/liuyubobobo/playAlgorithm/cmake-build-debug/2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : 2_01_merge_sort/CMakeFiles/2_01_merge_sort.dir/depend
