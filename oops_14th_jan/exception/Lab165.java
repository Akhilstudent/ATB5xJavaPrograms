package oops_14th_jan.exception;

public class Lab165 {
    public static void main(String[] args) {

        try{
            String sh = args[0];
            int x = Integer.parseInt(sh);
            int a = 10/x;

            System.out.println(x);
            System.out.println(a);
        }catch (Exception e){
            System.out.println("Error");
        }

    }
}
