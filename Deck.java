// Christopher De Jong
// Class (CECS 275-05)
// Project Name (Prog 2 - Solitaire_Prime)
// Due Date (February 28, 2019)
import java.util.Random;
public class Deck {
  private Card[] data;
  private int Top;
  private String suits = "SHDC";
  private String ranks = "A23456789TJQK";
// Function
  public void shuffle() {
    Random myRandom = new Random();
    for(int i = 0; i < data.length; i++){
      int newNumber = myRandom.nextInt(52);
      Card newCard = data[i];
      data[i] = data[newNumber];
      data[newNumber] = newCard;
    }
  }
  //Function used to display the deck
  public void display(){
    int index = 0;
    for (int i=0; i< suits.length(); i++){
      for (int y=0; y< ranks.length(); y++){
        data[index++].display();
        System.out.print(" ");
      }
      System.out.println();
    }
  }
// Function fills data array with 52 unique cards
  public Deck() {
    data = new Card[52];
    Top = 0;
    int count = 0;
    Card C1;
    for (int s=0; s < suits.length(); s++){
      for (int r=0; r < ranks.length(); r++){
        C1 = new Card(ranks.charAt(r), suits.charAt(s));
        data[count++] = C1;
      }
    }
  }
// Function deals the current top card of the deck
  public Card deal() {
    return data[Top++];
  }
}
