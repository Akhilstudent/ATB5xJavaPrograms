package oops_7th_Dec;

public class Lab144 {
    public static void main(String[] args) {

        BankAccount sbi =  new BankAccount();
        sbi.printDetails();

        BankAccount hdfc = new BankAccount("HDFC", "HDFC0002");
        hdfc.printDetails();

        BankAccount icici = new BankAccount("ICICI", "ICICI0003");
        icici.printDetails();


    }
}
