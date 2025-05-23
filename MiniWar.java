public class MiniWar {
    public static void main(String[] args) {
        // Create two cards for each player
        Card p1Card = new Card("Hearts", "King", 13, "");
        Card p2Card = new Card("Spades", "Queen", 12, "");
        Card p1Card2 = new Card("Diamonds", "7", 7, "");
        Card p2Card2 = new Card("Clubs", "9", 9, "");

        // Each player's hand as a LinkList
        LinkList player1 = new LinkList();
        LinkList player2 = new LinkList();
        // Add in reverse order so first drawn is p1Card, p2Card
        player1.add(p1Card2);
        player1.add(p1Card);
        player2.add(p2Card2);
        player2.add(p2Card);

        int p1Score = 0, p2Score = 0;
        for (int round = 1; round <= 2; round++) {
            Card c1 = player1.getFirst();
            Card c2 = player2.getFirst();
            System.out.println("Round " + round + ": P1 plays " + c1 + ", P2 plays " + c2);
            if (c1.getCardValue() > c2.getCardValue()) p1Score++;
            else if (c2.getCardValue() > c1.getCardValue()) p2Score++;
        }
        System.out.println("P1 score: " + p1Score + ", P2 score: " + p2Score);
        if (p1Score > p2Score) System.out.println("Player 1 wins!");
        else if (p2Score > p1Score) System.out.println("Player 2 wins!");
        else System.out.println("It's a tie!");
    }
}