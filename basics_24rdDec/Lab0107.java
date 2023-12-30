package basics_24rdDec;

public class Lab0107 {
    public static void main(String[] args) {

        // Write a program that print number i to 100. For multiple of 3, print Fizz,
        // and For multiple of 5, print Buzz
        // For nummber which multiple both 3 & 5,print FizzBuzz

        for (int i =1; i <=100; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
