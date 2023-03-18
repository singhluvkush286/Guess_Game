package Guesser_Game;

public class Umpire {
    int numGuess;
    int numP1;
    int numP2;
    int numP3;
    Guesser guesser ;
    Player p1,p2,p3;
    public void getNumFromGuesser()
    {
        guesser = new Guesser();
        numGuess = guesser.guessNumber();
    }
    public void collectFromPlayer()
    {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        numP1=p1.getNumber();
        numP2=p2.getNumber();
        numP3=p3.getNumber();

    }
    public void result()
    {
        if ((numP1 == numGuess) && (numP2 == numGuess) && (numP3 == numGuess))
        {
            System.out.println("All player are win :)");
        }
        else if (numP1==numGuess)
        {
           if(numP2==numGuess)
           {
               System.out.println("Player 1 & 2 are winner :)");
           }
            else if(numP3==numGuess)
            {
                System.out.println("Player 1 & 3 are winner :)");
            }
            else
           {
               System.out.println("Player 1 is winner :)");
           }

        }
        else if (numP2==numGuess)
        {

            if(numP3==numGuess)
            {
                System.out.println("Player 2 & 3 are winner :)");
            }
            else
            {
                System.out.println("Player 2 is winner :)");
            }

        }
        else if (numP3==numGuess)
        {

                System.out.println("Player 3 is winner :)");
        }


        else
        {
            System.out.println("Try Again , You LOST......");
            System.out.println("The number is "+ numGuess);
        }
    }

}
