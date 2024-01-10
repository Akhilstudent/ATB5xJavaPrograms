package oops_7th_Dec;

public class ATBPerson {
    String name;

    long phone;

    String email;

    boolean isMarried;

    void talk(){
        System.out.println("Talk");
    }

    ATBPerson(){
        name = "Pramod";                 // Default Constructor
        System.out.println("I'm called");
    }


    ATBPerson(String valueOfName){
        this.name = valueOfName;
    }

    void printDetails(){
       // System.out.println(name);
        System.out.println(this.name);
//        System.out.println(phone);
//        System.out.println(email);
//        System.out.println(isMarried);
    }
}
