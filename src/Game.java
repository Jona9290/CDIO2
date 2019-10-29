import java.util.Scanner;

public class Game {
    int dieside = 0;
    int players = 0;

    Die die1 = new Die();
    Die die2 = new Die();


}

public void test() {
    int count = 0;
    while (count < 1000){
        int value1 = die1.roll();
        int value2 = die2.roll();
        System.out.println(Color.ANSI_GREEN + value1 + Color.ANSI_RESET);
        System.out.println(Color.ANSI_YELLOW + value2 + Color.ANSI_RESET);
        count++;
        }

public void start(){
    Scanner scan = new Scanner();

       System.out.println("Write number of players");
        int players = scan.nextInt();
       System.out.println("indtast hvor mange sider terningen skal have");
        int dieside = scan.nextInt();
        }

