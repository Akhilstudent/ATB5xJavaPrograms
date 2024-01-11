package oops_7th_Dec.Inheritance;

public class Programming {
    int version;

    String author;

    Programming(){
        System.out.println("Programming DC");
    }

    Programming(int version, String author){
        this.version = version;
        this.author = author;
    }

    void bhk(){
        System.out.println("Parent 3BHK");
    }

    void details(){
        System.out.println("Programming Info --> " + "version " + this.version + " & " + "Author " + this.author);
    }
}
