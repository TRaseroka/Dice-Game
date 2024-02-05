class Main {
    public static void main(String[] args) {
        // Create players
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        PlayTurn turn = new PlayTurn();

// Game loop
        int currentPlayer = 0; // 0 for player1, 1 for player2
        do {
            Player current = (currentPlayer == 0) ? player1 : player2;

            System.out.println("\n--- It's " + current.getName() + "'s turn! ---");

            turn.play(current); // Pass the current Player object

            if (current.getScore() >= 50) { // Check for winner using Player's score
                System.out.println("Congratulations, " + current.getName() + " is the winner!");
                break;
            }

            currentPlayer = 1 - currentPlayer; // Switch players
        } while (true); // Continue until a winner emerges


    }
}