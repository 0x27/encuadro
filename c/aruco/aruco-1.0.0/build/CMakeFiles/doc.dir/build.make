# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 2.8

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canoncical targets will work.
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
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/roho/workspace/encuadro/aruco/aruco-1.0.0

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/roho/workspace/encuadro/aruco/aruco-1.0.0/build

# Utility rule file for doc.

CMakeFiles/doc:
	/usr/bin/doxygen /home/roho/workspace/encuadro/aruco/aruco-1.0.0/build/doxy.config

doc: CMakeFiles/doc
doc: CMakeFiles/doc.dir/build.make
.PHONY : doc

# Rule to build all files generated by this target.
CMakeFiles/doc.dir/build: doc
.PHONY : CMakeFiles/doc.dir/build

CMakeFiles/doc.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/doc.dir/cmake_clean.cmake
.PHONY : CMakeFiles/doc.dir/clean

CMakeFiles/doc.dir/depend:
	cd /home/roho/workspace/encuadro/aruco/aruco-1.0.0/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/roho/workspace/encuadro/aruco/aruco-1.0.0 /home/roho/workspace/encuadro/aruco/aruco-1.0.0 /home/roho/workspace/encuadro/aruco/aruco-1.0.0/build /home/roho/workspace/encuadro/aruco/aruco-1.0.0/build /home/roho/workspace/encuadro/aruco/aruco-1.0.0/build/CMakeFiles/doc.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/doc.dir/depend
