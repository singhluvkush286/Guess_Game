package Guesser_Game;

public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        System.out.println("Hello Players,");
        System.out.println("Welcome to the Game of Guessing .......");
        System.out.println();
        System.out.println();
        System.out.println("Before I wanted to clear the rules of the Game");
        System.out.println("*  Only Three player can Participate ");
        System.out.println("*  Decision will be made by Umpire-bot  ");
        System.out.println("*  Each player have to guess number between 1 to 10 ");
        System.out.println();
        umpire.getNumFromGuesser();
        umpire.collectFromPlayer();
        umpire.result();
    }
}
