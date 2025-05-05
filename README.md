# Java Chess Game

A complete chess game implementation in Java with a graphical user interface, sound effects, and standard chess rules.

## Project Structure

```
MainCode/
├── ChessBoard.java      # Main game interface and GUI
├── ChessGame.java       # Game logic and rules
├── SoundManager.java    # Sound effects management
├── Movement/           # Movement rules for each piece
└── resources/          # Game assets (images, sounds)
```

## Installation and Setup

### Prerequisites

1. **Java Development Kit (JDK)**
   - Download and install JDK 8 or higher from [Oracle's website](https://www.oracle.com/java/technologies/downloads/) or use OpenJDK
   - Verify installation by running:
     ```bash
     java -version
     javac -version
     ```

2. **Git (Optional, for version control)**
   - Download and install Git from [git-scm.com](https://git-scm.com/downloads)
   - Verify installation:
     ```bash
     git --version
     ```

### Setting Up the Project

1. **Clone the Repository (if using Git)**
   ```bash
   git clone https://github.com/BenjiCoder24/CompSciProject.git
   cd CompSciProject
   ```

2. **Make the start script executable**
   ```bash
   chmod +x start.sh
   ```

3. **Run the game**
   ```bash
   ./start.sh
   ```

   This will automatically:
   - Compile all necessary Java files
   - Start the chess game
   - Handle any compilation errors

### Compiling the Application

1. **Navigate to MainCode Directory**
   ```bash
   cd MainCode
   ```

2. **Compile All Java Files**
   ```bash
   # On Windows
   javac *.java Movement/*.java

   # On macOS/Linux
   javac *.java Movement/*.java
   ```

3. **Verify Compilation**
   - Check that `.class` files have been generated for:
     - ChessBoard.java
     - ChessGame.java
     - SoundManager.java
     - All files in the Movement directory

### Running the Application

You can run the game in two ways:

1. **Using the start script (Recommended)**
   ```bash
   ./start.sh
   ```

2. **Manual compilation and execution**
   ```bash
   cd MainCode
   javac *.java Movement/*.java
   java ChessBoard
   ```

2. **Troubleshooting Common Issues**

   a. **Class Not Found Error**
   - Ensure you're in the MainCode directory
   - Verify all files compiled successfully
   - Check for any compilation errors

   b. **Missing Resource Files**
   - Verify the resources directory structure
   - Check file permissions
   - Ensure all required images and sounds are present

   c. **Sound Issues**
   - Check system sound settings
   - Verify Java sound system is working
   - Test with a simple sound program if needed

3. **Development Environment Setup (Optional)**
   - Recommended IDEs:
     - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
     - [Eclipse](https://www.eclipse.org/downloads/)
     - [VS Code](https://code.visualstudio.com/) with Java extensions

   - IDE Setup Steps:
     1. Import the project
     2. Set JDK version
     3. Configure build path
     4. Set up run configuration for ChessBoard

## Features

1. **Graphical User Interface**
   - 8x8 chess board with alternating light and dark squares
   - Visual representation of chess pieces
   - Status display showing current player's turn
   - Captured pieces display

2. **Game Mechanics**
   - Standard chess rules implementation
   - Move validation for all piece types
   - Special moves (castling, en passant)
   - Check and checkmate detection
   - Turn-based gameplay

3. **User Interaction**
   - Click to select and move pieces
   - "Suggest Move" button for move suggestions
   - "Suggest Capture" button for capture suggestions
   - "Clear Suggestions" button to reset highlights

4. **Sound Effects**
   - Move sound effects
   - Capture sound effects

## Screenshots and Visual Aids

### Game Interface and Features
1. **Main Game Interface**
   - The main game window showing the 8x8 chess board, captured pieces panels, and control buttons
   
<img width="649" alt="Chess Game Main Interface" src="https://github.com/user-attachments/assets/8b7a3edf-dcf9-4b70-a0d4-15b1815d1913" />

2. **Piece Movement**
   - Demonstrating piece selection (highlighted) and valid move options
   
<img width="649" alt="Piece Selection and Movement" src="https://github.com/user-attachments/assets/7317ab69-41db-4a36-b372-7aa6fc433fd4" />

3. **Capture Move**
   - Showing a piece capturing another piece and the captured piece being added to the panel
   
<img width="649" alt="Capture Move Execution" src="https://github.com/user-attachments/assets/9728d926-299e-4b94-991d-5507eac24a41" />

### Technical Documentation
1. **Code Structure**
   - The organization of Java files in the project
   
<img width="626" alt="Project Code Structure" src="https://github.com/user-attachments/assets/d6301c47-18b9-4bd3-9c88-9a6098c19c11" />

2. **Class Diagram**
   - The relationship between main classes (ChessBoard, ChessGame, SoundManager)
   
<img width="955" alt="Main Class Relationships" src="https://github.com/user-attachments/assets/6a2d212e-08bb-42d2-8a08-36fa79ef4881" />

## How to Play

1. **Starting the Game**
   - Run `ChessBoard.java` to start the game
   - White pieces move first

2. **Making Moves**
   - Click on a piece to select it (it will be highlighted)
   - Click on a valid destination square to move
   - Invalid moves will be rejected

3. **Special Features**
   - Use "Suggest Move" to get a valid move suggestion
   - Use "Suggest Capture" to get a capture suggestion
   - Use "Clear Suggestions" to remove highlights

## Technical Details

### ChessBoard.java
- Main class extending JFrame
- Handles GUI setup and user interaction
- Manages piece movement and game state
- Implements event listeners for user actions

### ChessGame.java
- Core game logic implementation
- Validates moves according to chess rules
- Tracks game state and piece positions
- Handles special moves and game conditions

### SoundManager.java
- Manages sound effects for moves and captures
- Uses Java's javax.sound.sampled package
- Generates sound effects programmatically

### Movement Package
- Contains movement rules for each piece type
- Implements piece-specific movement patterns
- Validates legal moves for each piece

## Requirements

- Java 8 or higher
- Java Swing for GUI
- Java Sound API for sound effects

## Code Explanation for Teachers

This chess implementation demonstrates several important programming concepts:

1. **Object-Oriented Design**
   - Clear separation of concerns between GUI, game logic, and sound management
   - Use of inheritance and interfaces
   - Encapsulation of game state and rules

2. **GUI Programming**
   - Swing components and layout managers
   - Event-driven programming
   - Custom painting and graphics

3. **Game Logic**
   - State management
   - Rule validation
   - Algorithm implementation for move generation

4. **Sound Programming**
   - Audio format handling
   - Sound generation and playback
   - Resource management

5. **Error Handling**
   - Input validation
   - Exception handling
   - User feedback

The code is structured to be maintainable and extensible, with clear separation between different aspects of the game (GUI, logic, sound).