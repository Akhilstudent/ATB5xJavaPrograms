package oops_Collection_3rd_Feb;

public class Lab201 {
    public static void main(String[] args) {

        temp(25);
        temp("Akhil");
        temp(true);
    }

    public static <T> void temp(T x){
        System.out.println(x);
    }
}
