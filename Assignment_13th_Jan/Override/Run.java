package Assignment_13th_Jan.Override;

public class Run {
    public static void main(String[] args) {

        Override task = new Override();
        task.something();

        Student student = new Student();
        student.something();

        Override overriding = new Student();
        overriding.something();

    }

}
