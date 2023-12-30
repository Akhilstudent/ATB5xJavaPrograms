package basics_24rdDec;

public class Lab099 {
    public static void main(String[] args) {

        //Array

        int [] a = {89, 85, 56, 47, 38};
        System.out.println(a.length);
        System.out.println(a[2]);

        final int b[] = new int[4];
        // b =[0,0,0,0];          default value is null. This means length is final not value
        b[0] = 75;
        System.out.println(b[0]);
    }
}
