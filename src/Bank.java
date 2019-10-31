import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank(ArrayList<Player> players) {
        accounts = new ArrayList<>();
        for(Player p:players){
            accounts.add(new Account(p,1000));
        }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public class Account{
        private Player owner;
        private int balance;

        public Account(Player owner, int balance) {
            this.owner = owner;
            this.balance = balance;

        }

        public Player getOwner() {
            return owner;
        }

        public void setOwner(Player owner) {
            this.owner = owner;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public void updateBalance(int gold){
            this.balance += gold;
        }
    }

}
