cmake_minimum_required(VERSION 3.8)
project(playAlgorithm)

set(CMAKE_CXX_STANDARD 11)
#set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -std=c++0x")
set(SOURCE_FILES main.cpp)
add_executable(playAlgorithm ${SOURCE_FILES})

add_subdirectory(1_01_selection_sort)
add_subdirectory(1_02_selection_sort_using_template)
add_subdirectory(1_03_selection_sort_generate_test_cases)
add_subdirectory(1_04_selection_sort_detect_performace)
add_subdirectory(1_05_insertion_sort)
add_subdirectory(1_06_insertion_sort_advance)
add_subdirectory(1_07_optimized_selection_sort)
add_subdirectory(1_08_bubble_sort)
add_subdirectory(1_09_shell_sort)
add_subdirectory(2_01_merge_sort)
add_subdirectory(2_02_merge_sort_advanced)
add_subdirectory(1_summarize)
add_subdirectory(2_03_merge_bottom_up)
add_subdirectory(2_04_quick_sort)
