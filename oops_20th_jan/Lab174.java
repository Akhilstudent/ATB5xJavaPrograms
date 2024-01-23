package oops_20th_jan;

public class Lab174 {
    public static void main(String[] args) throws CustomException {

        Bank jp = new Bank(100, "USD");
        Bank hdfc = new Bank(50, "INR");

        System.out.println(hdfc.add(jp));
    }
}
