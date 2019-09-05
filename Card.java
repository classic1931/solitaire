// Christopher De Jong
// Class (CECS 275-05)
// Project Name (Prog 2 - Solitaire_Prime)
// Due Date (February 28, 2019)case
public class Card {
  private char suit;
  private char rank;

  public Card(char r, char s){
    rank = r;
    suit = s;
  }
// Function to display one Card
  public void display(){
    if (rank == 'T'){
      System.out.print("10" + "" + suit);
    }else {
      System.out.print(rank + "" + suit);
    }
  }
  // Function to return a number value of each card
  public int getValue() {
  int value = 0;
  switch (rank) {
    case 'A':
      value = 1;
      break;
    case '2':
        value = 2;
        break;
    case '3':
        value = 3;
        break;
    case '4':
        value = 4;
        break;
    case '5':
        value = 5;
        break;
    case '6':
        value = 6;
        break;
    case '7':
        value = 7;
        break;
    case '8':
        value = 8;
        break;
    case '9':
        value = 9;
        break;
    case 'T':
        value = 10;
        break;
    case 'J':
        value = 10;
        break;
    case 'Q':
        value = 10;
        break;
    case 'K':
        value = 10;
        break;
  }
    return value;
}
  public char getSuit() {
    return suit;
  }
  public char getRank() {
    return rank;
  }
}
