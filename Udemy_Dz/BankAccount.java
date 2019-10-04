public class BankAccount {
    int id;
    String name;
    double ballans;

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Nick";
        MyAccount.ballans = 10.15;
        System.out.println(
                "Balance account for name " + MyAccount.name + " = " + MyAccount.ballans
        );

        YourAccount.id = 2;
        YourAccount.name = "Jone";
        YourAccount.ballans = 14.33;
        System.out.println(
                "Balance account for name " + YourAccount.name + " = " + YourAccount.ballans
        );

        HisAccount.id = 2;
        HisAccount.name = "Mary";
        HisAccount.ballans = 19.45;
        System.out.println(
                "Balance account for name " + HisAccount.name + " = " + HisAccount.ballans
        );
    }
}

class BankAccountTest {

}