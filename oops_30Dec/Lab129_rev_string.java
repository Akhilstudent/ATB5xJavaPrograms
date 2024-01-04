package oops_30Dec;

public class Lab129_rev_string {
    public static void main(String[] args) {
        String name = "Akhil";
        String y = " ";

        for (int i= name.length()-1; i>=0; i--){
            y = y + name.charAt(i);
        }
        System.out.println(y);
    }
}
