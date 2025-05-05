#!/bin/bash

# Navigate to the MainCode directory
cd MainCode

# Compile all Java files
echo "Compiling Java files..."
javac *.java Movement/*.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo "Starting the game..."
    java ChessBoard
else
    echo "Compilation failed. Please check for errors."
    exit 1
fi 