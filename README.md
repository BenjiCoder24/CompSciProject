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

## Running the Game

1. Compile all Java files:
   ```bash
   cd MainCode
   javac *.java Movement/*.java
   ```

2. Run the game:
   ```bash
   java ChessBoard
   ```

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