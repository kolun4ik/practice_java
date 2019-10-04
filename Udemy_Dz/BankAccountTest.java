class BankAccount {
    int id;
    String name;
    double balance;

    void popolnenieScheta(double cash){
        balance += cash;
    }

    void snyatieSoScheta(double cash) {
        balance -= cash;
    }
}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Nick";
        MyAccount.balance = 10.15;
        System.out.println(
                "Balance account for name " + MyAccount.name + " = " + MyAccount.balance
        );

        YourAccount.id = 2;
        YourAccount.name = "Jone";
        YourAccount.balance = 14.33;
        System.out.println(
                "Balance account for name " + YourAccount.name + " = " + YourAccount.balance
        );

        HisAccount.id = 2;
        HisAccount.name = "Mary";
        HisAccount.balance = 19.45;
        System.out.println(
                "Balance account for name " + HisAccount.name + " = " + HisAccount.balance
        );

        System.out.println("Add amount 45 $ for accounts " + HisAccount.name);
        HisAccount.popolnenieScheta(45);
        System.out.println("Now the amount in her account is - " + HisAccount.balance);
    }
}