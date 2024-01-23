package oops_14th_jan.exception;

public class Lab167 {
    public static void main(String[] args) {

        try {
            int a = 0;
            int x = 10/a;
        }catch (Exception e){
            System.out.println("It will not run");
            System.exit(0);
        }finally {
            System.out.println("I will call always");
        }
    }
}
