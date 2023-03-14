//Name - Rushikesh Dasharath Bhanavse
// Task 2: Atm interface

import java.util.*;
class AtmMachine{
    float Balance;
    int PIN = 7856;

    public void checkPin() {
        System.out.println("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);
        int EnteredPin = sc.nextInt();
        if (EnteredPin == PIN) {
            menu();
        }
        else {
            System.out.println("Enter a valid PIN");
        }
        menu();
    }
    public void menu() {
        System.out.println("Enter Your Choice :");
        System.out.println("1. Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4.EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            WithdrawMoney();
        } else if (opt == 3) {
            DepositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a Valid choice");
        }
    }

    public void checkBalance() {

            System.out.println(("Balance : " + Balance));
            menu();
        }


        public void WithdrawMoney(){
                System.out.println("Enter Amount to Withdraw: ");

                Scanner sc = new Scanner(System.in);
                int  amount = sc.nextInt();
                if(amount > Balance){
                    System.out.println("Insufficient Balance");
                }
                else{
                    System.out.println("Your Amount Withdrawal Successfully");
                }
                menu();
            }

        public void  DepositMoney(){
                System.out.println("Enter Amount to Deposit :");
                Scanner sc = new Scanner(System.in);
                float amount = sc.nextFloat();
                Balance = Balance + amount;
                System.out.println("Money Deposited Successfully");
                menu();
            }

            }



public class Atm {
    public static void main(String[] args) {

        AtmMachine  obj = new AtmMachine();
        obj.checkPin();
    }
}
