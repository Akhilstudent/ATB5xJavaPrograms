package oops_7th_Dec;

public class BankAccount {
    String bankName;
    int balance;

    String bankCode;


    BankAccount(){
        bankName = "SBI";
        bankCode = "SBI0001";
        System.out.println("Default Constructor");
    }

    BankAccount(String bName, String bCode){
        this.bankName = bName;
        this.bankCode = bCode;
        System.out.println("Parametrized Constructor");

    }
    void printDetails(){
        System.out.println("BankName -- > " + bankName);
        System.out.println("BankCode -- > " + bankCode);
        System.out.println(balance);
    }


}
