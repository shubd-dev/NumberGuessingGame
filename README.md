
# 🎉 Number Guessing Game 🎲

Welcome to the Number Guessing Game! This is a fun and interactive game where the computer selects a random number between 1 and 100, and you have to guess it within a limited number of attempts based on the chosen difficulty level.

## 🚀 How to Play

1. **Start the Game**: Run the `Main` class to begin the game.
2. **Select Difficulty**: Choose one of the following difficulty levels:
   - Easy: 10 chances
   - Medium: 5 chances
   - Hard: 3 chances
3. **Guess the Number**: Enter your guesses to find the correct number. The game will guide you by indicating if your guess is higher or lower than the chosen number.
4. **Win or Lose**: If you guess the correct number within the allowed attempts, you win! Otherwise, you lose and can try again.

## 💻 Code Structure

- **Main.java**: Contains the main logic for the game, including setting the difficulty level and processing the user's guesses.
- **NumberGuessingGame.java**: The class that handles the game logic and user interaction.

## 🧪 Tests

We have created test cases using JUnit to ensure the correctness of the game logic. The test file is located in the `src/test/java` directory.

## 📚 Project Roadmap

For more details on the project and future enhancements, visit the project roadmap: [Number Guessing Game Roadmap](https://roadmap.sh/projects/number-guessing-game).

## 📋 Example Output

```
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 5 chances to guess the correct number.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)
4. Exit
   Enter your choice: 2
   Great, you have selected Medium difficulty level
   Let's start the game!

Enter your choice: 50
Incorrect! The number is less than 50
Enter your choice: 25
Incorrect! The number is greater than 25
...
```

## 🌟 Features

- Multiple difficulty levels to cater to different skill levels.
- User-friendly prompts and feedback.
- Random number generation for a unique experience each time.

## 🔧 Requirements

- Java 8 or higher
- JUnit 5 for running tests

## 📈 Future Enhancements

- Add more difficulty levels.
- Implement a scoring system based on the number of attempts.
- Provide hints to the player.

## 📞 Contact

For any questions or suggestions, feel free to reach out to the project maintainers.

Happy guessing! 🎉

