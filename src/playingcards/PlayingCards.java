// Sajid Ahmed
// Lab 4 Enumerated Types: Playing cards to print a blackjack hand,
// a two card hand, and a hand value
package playingcards;

// enum type Rank with values
enum Rank {ace, two, three, four, five, six, seven, eight, nine,
            ten, jack, queen, king}
/**
 *
 * @author Sajid Ahmed
 */
public class PlayingCards {

    public static void main(String[] args) {
        // Declare variables highCard, faceCard, card1, and card2 of type Rank
        Rank highCard, faceCard, card1, card2;
        // Assign highCard to be an ace, faceCard to be a jack, queen or king (your choice), and
        // card1 and card2 to be two different numbered cards (two through ten - your choice)
        highCard = Rank.ace;
        faceCard = Rank.king;
        card1 = Rank.two;
        card2 = Rank.seven;
        // Print a line, using the highCard and faceCard objects
        System.out.println("A blackjack hand: " + highCard.name() + " and " + faceCard.name());
        // Declare two variables card1Val and card2Val of type int and assign them the face value
        // of your card1 and card2 objects.
        int card1Val, card2Val;
        card1Val = card1.ordinal() + 1;
        card2Val = card2.ordinal() + 1;
        // Print two lines, using the card1 and card2 objects and the name method
        System.out.println("A two card hand: " + card1.name() + " and " + card2.name());
        System.out.println("Hand value: " + (card1Val + card2Val));
    }
    
}
