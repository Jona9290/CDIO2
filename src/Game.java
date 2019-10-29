import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    int sides = 0;
    int players = 0;
    Bank bank;
    ArrayList<Player> playerlist;

    Die die1;
    Die die2;

    public Game() {

    }

    public void test() {
        int count = 0;
        while (count < 1000) {
            int value1 = die1.roll();
            int value2 = die2.roll();
            System.out.println(Color.ANSI_GREEN + value1 + Color.ANSI_RESET);
            System.out.println(Color.ANSI_YELLOW + value2 + Color.ANSI_RESET);
            count++;
        }

    }

    public void start() {
        Scanner scan = new Scanner();

        System.out.println("Write number of players");
        players = scan.nextInt();
        playerlist = new ArrayList<>();
        for (int i=0;i<players;i++){
            System.out.println("Type player " + (i+1) + "'s name");
            String name = scan.nextLine();
            playerlist.add(new Player(name));
        }
        bank = new Bank(playerlist);

        System.out.println("indtast hvor mange sider terningen skal have");
        sides = scan.nextInt();
        die1 = new Die(sides);
        die2 = new Die(sides);

    }

    public int



}