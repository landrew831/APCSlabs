/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
Card card1= new Card("10","Hearts",10);
Card card2= new Card("9","Hearts",9);
Card card3= new Card("8","Hearts",8);

System.out.println(card1);
System.out.println(card1.rank());
System.out.println(card1.suit());
System.out.println(card1.pointValue());
System.out.println(card1.matches(card2)+"\n");

System.out.println(card2);
System.out.println(card2.rank());
System.out.println(card2.suit());
System.out.println(card2.pointValue());
System.out.println(card2.matches(card2)+"\n");

System.out.println(card3);
System.out.println(card3.rank());
System.out.println(card3.suit());
System.out.println(card3.pointValue());
System.out.println(card3.matches(card1)+"\n");
 }
}
