package Guesser_Game;
import java.util.*;

public class Player {
    public int getNumber()
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Hey , Player Enter your Number");
      int num = input.nextInt();
      return num;
    }
}
