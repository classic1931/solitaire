// Christopher De Jong
// Class (CECS 275-05)
// Project Name (Prog 2 - Solitaire_Prime)
// Due Date (February 28, 2019)
import java.util.Scanner;
public class Solitaire_Prime {
  static Scanner in = new Scanner(System.in);
// Function prompts the user with five options
  public static int menu() {
    System.out.println("Welcome to Solitaire Prime!");
    System.out.println("1) New Deck");
    System.out.println("2) Display Deck");
    System.out.println("3) Shuffle Deck");
    System.out.println("4) Play Solitaire Prime");
    System.out.println("5) Exit");
    System.out.println("Please enter your option: ");
    int option = in.nextInt();
    return option;
  }
  public static void main(String[] args){
    Deck myDeck = new Deck();
    int option = menu();
    Card C;
    while (option !=5) {
      if (option == 1) {
        System.out.println("New Deck is created!");
        myDeck = new Deck();
      } else if (option == 2) {
        myDeck.display();
      }else if (option == 3) {
        myDeck.shuffle();
        System.out.println("Your Deck is shuffled!");
      }else if (option == 4){
        System.out.println("\nPlay Solitaire\n");
        int sum = 0;
        int a = 0;
        for (int x = 0 ; x < 52; x++){
          C = myDeck.deal();
          C.display();
          System.out.print(", ");
          sum += C.getValue();
          if (isPrime(sum)) {
            System.out.println("PRIME:" + sum);
            sum = 0;
            a++;
            myDeck = new Deck();
            myDeck.shuffle();
          }
        }
        if (sum == 0) {
          System.out.println("You have won in " + a + " piles!");
        }else {
          System.out.println("Loser");
        }
      }else {
          System.out.println("Invailid input! Please try again.");
      }
      System.out.println();
      option = menu();
    }
  }
// Function adds the value of a hand and sees if the number is prime
  public static boolean isPrime(int x){
    boolean prime = true;
    int remainder;
    if (x==1){
      prime = false;
      return prime;
    }
    for(int i = 2; i <= x/2; i++){
      remainder = x%i;
      if(remainder == 0){
        prime = false;
        break;
      } else {
        prime = true;
      }
    }
    return prime;
  }
}
