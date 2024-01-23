package Assignment_13th_Jan.ATB;

public class ATBArrayStudent {
    public static void main(String[] args) {

        Student[] arr = new Student[5];

        arr[0] = new Student(15, "Akhil", 156, "akhil@gmail");
        arr[1] = new Student(11, "Deepa", 1565, "akhil@gmail");
        arr[2] = new Student(12, "Pramod", 1256, "akhil@gmail");
        arr[3] = new Student(13, "Avi", 2156, "akhil@gmail");
        arr[4] = new Student(16, "Aman", 6156, "akhil@gmail");

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Array Value " + arr[i].roll_no + "  "+ arr[i].name + "  "+ arr[i].address + "  " +arr[i].address);
        }




    }


}
