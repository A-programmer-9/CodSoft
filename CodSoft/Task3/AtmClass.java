
public class AtmClass {

    public void withdraw(int amount, UserAccount user){

        int balance = user.getBalance();
        if (balance < amount) {
            System.out.println("Sorry Your account balance is low");
        }
        else{
            System.out.println("Withdrawal Successfull.");
        }


    }
    public void deposit(int amount, UserAccount user){

        int newBalance = amount + user.getBalance();
        user.setBalance(amount);
        System.out.println( amount + " has been added to your account and your new balance is " + newBalance + ".");
    }
    public void checkBalance(UserAccount user){
        System.out.println("Your current balance is " + user.getBalance() + ".");

    }


}
