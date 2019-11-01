import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    int sides = 0;
    int players = 0;
    Bank bank;
    ArrayList<Player> playerlist;
    ArrayList<Gamefield> fields;
    Die die1;
    Die die2;

    Scanner scan;

    public Game() {
        fields = new ArrayList<>();
        fields.add(new Gamefield(250,"Tower", "You have found an abandoned tower and a chest filled with krugerrands - " + Color.ANSI_YELLOW +  "receive 250 gold" + Color.ANSI_RESET));
        fields.add(new Gamefield(-100,"Crater", "you have just heard the sirens go off followed by a loud bang!, to your surprise, a nazi bomb have left a crater 50 meters away from you -" + Color.ANSI_RED +  "you lose 100 gold in your confusion" + Color.ANSI_RESET));
        fields.add(new Gamefield(100,"Palace gates", "You wake up to royal guards throwing you at the gate. Last night you drank a little to much and went home with the princess -" + Color.ANSI_YELLOW + "receive 100 gold" + Color.ANSI_RESET));
        fields.add(new Gamefield(-20,"Cold Desert", "You booked the wrong flight and ended up near the south pole, you forgot all your winter clothing -" + Color.ANSI_RED + "lose 20 gold" + Color.ANSI_RESET));
        fields.add(new Gamefield(180,"Walled city", "Uncle Sam has been calling you, so you come visit. Your friend Mike Pence is happy to see you -" + Color.ANSI_YELLOW + "receive 180 gold Mike Pence received from a pharmaceutical company" + Color.ANSI_RESET));
        fields.add(new Gamefield(0,"Monastery", "You have read a little to much buddhism and has decided to visit Dalai Lama, it was disappointing -" + Color.ANSI_YELLOW + "you neither lose nor gain any gold" + Color.ANSI_RESET));
        fields.add(new Gamefield(-70,"Black cave","You went to Harlem and got robbed -" + Color.ANSI_RED + "you lose 70 gold" + Color.ANSI_RESET));
        fields.add(new Gamefield(60,"Huts in the mountains", "You won a trip to a budget mountain spa -" + Color.ANSI_YELLOW + "receive 60 gold" + Color.ANSI_RESET));
        fields.add(new Gamefield(-80,"The Werewall (Werewolf wall)", "Your best friend convinced you to drop acid -" + Color.ANSI_RED + "you lose 80 gold but you get an extra throw" + Color.ANSI_RESET));
        fields.add(new Gamefield(-50,"The pit", "You have had trouble concentrating and went to camp about it, it was a mistake. luckily you brought a gas mask -" + Color.ANSI_RED + "you lose 50 gold" + Color.ANSI_RESET));
        fields.add(new Gamefield(650,"Goldmine", "WOW! you have found a traincart filled with swastika stamped gold bars -" + Color.ANSI_YELLOW + "you receive 650 gold" + Color.ANSI_RESET));
    }

    public void test() {
        int count = 0;
        scan = new Scanner(System.in);

        System.out.println("Write how many sides the dice should contain");
        sides = scan.nextInt();
        die1 = new Die(sides);
        die2 = new Die(sides);
        while (count < 1000) {
            int value1 = die1.roll();
            int value2 = die2.roll();
            int value3 = value1 + value2;
            value3 = value3 % fields.size();
            System.out.println(Color.ANSI_GREEN + value1 + Color.ANSI_RESET);
            System.out.println(Color.ANSI_YELLOW + value2 + Color.ANSI_RESET);
            System.out.println("You landed on field" + value3 + "");
            count++;
        }

    }

    public void start() {
        scan = new Scanner(System.in);
        /*
         * we scan the number of players they wish to play. a player list is then created in the form of an arraylist
         * when we ask them to type the names of the players.
         * Furthermore a list of accounts chained to the playerlist.
         */
        System.out.println("Write number of players");
        players = scan.nextInt();
        scan.nextLine();
        playerlist = new ArrayList<>();
        for (int i=0;i<players;i++){
            System.out.println("Type player " + (i+1) + "'s name");
            String name = scan.nextLine();
            playerlist.add(new Player(name));
        }
        bank = new Bank(playerlist);

        /*
         * The program then asks how many dice sides the players want to play with.
         */
        System.out.println("Write how many sides you want the dice to have");
        sides = scan.nextInt();
        die1 = new Die(sides);
        die2 = new Die(sides);
        scan.nextLine();
        /*
         * the program then has a loop thats bound to the winningcondition.
         * a for loop is created to make the players take turn until the while loop´s condition is fulfilled.
         */
        while (!winningCondition()){
            for (Bank.Account a:bank.getAccounts()){
                System.out.println(" ");
                System.out.println(Color.ANSI_RED + a.getOwner().getName() + ", it is your turn" + Color.ANSI_RESET);
                scan.nextLine();
                int gold = rollDie(die1, die2);
                a.updateBalance(gold);
                System.out.println("your new balance is " + a.getBalance());

            }

        }

    }
    /**
     * This function rolls the dice from input and finds the corresponding field.
     *
     */
    public int rollDie(Die d1, Die d2){
        int value = d1.roll() + d2.roll();
        System.out.println("You rolled: " + d1.getFaceValue() + " and " + d2.getFaceValue());
        value -= 2;
        value = value % fields.size();
        int returnvalue = fields.get(value).getFieldvalue();
        System.out.println(fields.get(value).getFieldname() + " - " + fields.get(value).getAdventureText());
        /*
         * We have a recursive statement which gives the player an extra turn if the condition is fulfilled(in this case, landing on field 8)
         */
        if(value == 8){
            returnvalue += rollDie(d1,d2);

        }
        return returnvalue;
    }

    /*
     * The winning condition is defined.
     */
    public boolean winningCondition(){
        for(Bank.Account a:bank.getAccounts()){
            if(a.getBalance() >= 3000){
                System.out.println(Color.ANSI_PURPLE_BACKGROUND + "");
                System.out.println(a.getOwner().getName() + " has won!");
                System.out.println(Color.ANSI_PURPLE_BACKGROUND + "");
                return true;
            }

        }
        return false;

    }




}