package src.basics_02;

public class Lab033 {
    public static void main(String[] args) {

        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        String name2 = new String("The Testing academy");

        System.out.println(name == name1);      //True
        System.out.println(name == name2);     //False    It is in Object Area

        System.out.println(name.equals(name1));
        System.out.println("--------------");
        System.out.println(name.equalsIgnoreCase(name2));
    }
}
