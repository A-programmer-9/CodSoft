import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        AtmClass userAtm = new AtmClass();
        UserAccount user = new UserAccount();
        System.out.println("Welcome to \"ATM Interface\"");

        Scanner scanner = new Scanner(System.in);

        loop1: {
        while (true) {
            System.out.println("Select one of the four option: ");
            System.out.println("1: Check Balance \n2: Withdraw \n3: Deposit \n4: Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    userAtm.checkBalance(user);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    int amount = scanner.nextInt();
                    userAtm.withdraw(amount, user);
                    break;
                
                case 3:
                    System.out.println("Enter the amount to deposit: ");
                    int dAmount = scanner.nextInt();
                    userAtm.deposit(dAmount, user);
                    break;
            
                default:
                break loop1;
            }
        }
    }
    scanner.close();
    System.out.println("Please wait we are going....");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Thanks for using \"ATM Interface\".");
    }
}
