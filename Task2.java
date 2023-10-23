import java.util.Scanner;

interface Bank {
    void WithDraw();
    void Deposit();
    void CheckBalance();
}


class Function implements Bank {
    int Balance;

    void DefaultBalance(){
        System.out.print("Enter default bankbalance : ");
        Scanner scan = new Scanner(System.in);
        Balance = scan.nextInt();
    }

    @Override
    public void CheckBalance() {
        System.out.println("Your bank account balnce is : " + Balance);
    }

    @Override
    public void WithDraw() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw : ");
        int withdraw = scan.nextInt();
        if (withdraw > Balance){
            System.out.println("Unsufficient Balance Please check your balance");
            System.exit(0);
        }
        Balance = Balance - withdraw;
        System.out.println("Successfully withdrwal " + withdraw);
    }

    @Override
    public void Deposit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw : ");
        int deposit= scan.nextInt();
        Balance = Balance + deposit;
        System.out.println("Successfully deposited " + deposit);
    } 
}

public class Task2{
    public static void main(String[] args) throws InterruptedException {
        Function get = new Function();
        get.DefaultBalance();
        do{
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the choice sir : \n 1 for checkBalance \n 2 for Deposit \n 3 for withdraw \n 4 for exit ");
        int choice = scan.nextInt();
        
            switch (choice){
            case 1:
                get.CheckBalance();
                break;
            case 2: 
                get.Deposit();
                break;
            case 3:
                get.WithDraw();
                break;
            case 4:
                System.exit(0);
                break;
            
                default:
                    break;
        }
        Thread.sleep(2000);
        }while (true);
    }
}