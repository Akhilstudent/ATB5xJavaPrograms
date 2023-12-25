package basics_23rdDec;

public class Lab087 {
    public static void main(String[] args) {
        for (int i=0; i<=10;i++){
            if (i%2 == 0){
                System.out.println("Value of Even " + i);
                continue;
            }
            System.out.println("Value of ODD "+ i);
        }
    }
}
