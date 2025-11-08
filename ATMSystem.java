import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User("Arshiya123", "0007"); // sample user
        BankAccount account = new BankAccount();

        System.out.println("Welcome to ATM Interface!");
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (user.validateLogin(userId, pin)) {
            System.out.println("✅ Login Successful!");
            ATM atm = new ATM(account);
            atm.showMenu();
        } else {
            System.out.println("❌ Invalid credentials. Try again!");
        }

        sc.close();
    }
}
