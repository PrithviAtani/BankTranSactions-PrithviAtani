
import java.util.*;

public class BankTransactions {
    public int FinalBalance;
    public int AccountNumber;
    public String AccountName;
    public String email;
    public int phone_no;

    //public int GetBalance();
    //public int WithDraw(int nVal);
    //public int Deposit(int nVal);

    public void GetBalance()
    {
        System.out.println("Balance = " + FinalBalance);
    }

    public void Deposit(int nValue)
    {
        FinalBalance = FinalBalance + nValue;
        System.out.println("Balance = " + FinalBalance);
    }

    public void WithDraw(int nValue)
    {
       if (FinalBalance > 50) {
           FinalBalance = FinalBalance - nValue;
           System.out.println("Balance = " + FinalBalance);
       }else if (FinalBalance == 0){
           System.out.println("Sorry you have insufficient funds");
       }
    }

    public void GetAccountDetails()
    {
        System.out.println("AccountNumber = " + AccountNumber);
        System.out.println("Name = " + AccountName);
        System.out.println("Balance = " + FinalBalance);
        System.out.println("Email = " + email);
        System.out.println("Balance = " + phone_no);
    }

}
class Banking
{
    public static void main(String[] args)
    {
        int nAmt;
        BankTransactions BT = new BankTransactions();

        BT.FinalBalance = 1000;
        BT.AccountNumber = 123456789;
        BT.AccountName = "ABC";
        BT.phone_no =408999699;
        BT.email="randomemail@gmailcom";

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Account Details");
        System.out.println("");

        System.out.print("Enter the number: ");
        int nOperation = sc.nextInt();

        if (nOperation == 1)
            BT.GetBalance();
        else if (nOperation == 2)
        {
            System.out.print("Enter Amount: ");
            nAmt = sc.nextInt();
            BT.WithDraw(nAmt);
        }
        else if (nOperation == 3)
        {
            System.out.print("Enter Amount: ");
            nAmt = sc.nextInt();
            BT.Deposit(nAmt);
        }
        else if (nOperation == 4)
            BT.GetAccountDetails();
        else
            System.out.println("Error");

        //String str= sc.nextLine();              //reads string
        //System.out.print("You have entered: "+str);
    }

}

