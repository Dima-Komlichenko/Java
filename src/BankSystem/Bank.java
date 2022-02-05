package BankSystem;

import java.util.Vector;

public class Bank {

    private static int accountNum = 1;

    /*public class Account {

        private double balance;
        private String number;
        private Client client;

        public Account(Client client,double startBalance) {
            this(client);
            balance = startBalance;

        }

        public Account(Client client) {
            this.client = client;
            balance = 0;
            number = "Acc " + accountNum++;
        }

        public double getBalance() {return balance;}

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Счет #" + number + " Владелец: " + client.toString()
                    + " Баланс: " + balance;
        }

        private Vector<Client> clients = new Vector<Client>();
        private Vector<Account> accounts = new Vector<Account>();
        private Vector<Operation> operation = new Vector<Operation>();

        //public void addOperation(Operation operation) { operation.add(operation);}

        public void runOperation() {
            for (int i = 0; i < operation.size(); i++) {
                try {
                    operations.get(i).doWork();
                } catch (OperationException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            operations.clear();
        }


        public Bank.Account createAccount (String clientName, String passport,
                                           double initialBalance) {
            Client cl = null;

            for (int i = 0; i < client.size(); i++) {
                if(clients.get(i).getPassport() == passport) {
                    cl = clients.get(i);
                    break;
                }
            }
            if(cl == null) {
                cl = new Client(clientName, passport);
                clients.add(cl);
            }
            Account acc = new Account(cl, initialBalance);
            accounts.add(acc);
            return acc;
        }

        public Bank.Account createAccount(String clientName, String passport){
            return createAccount(clientName, passport,0);
        }
    }*/

}
