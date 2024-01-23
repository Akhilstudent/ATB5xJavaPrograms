package oops_13th_Jan.AccessModifiers;

class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setPassword("abcd");
        System.out.println(ac.getPassword());


    }
}
