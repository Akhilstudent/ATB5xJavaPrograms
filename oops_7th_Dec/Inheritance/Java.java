package oops_7th_Dec.Inheritance;

public class Java extends Programming{

    String newFeature;

    Java(){
        System.out.println("Java DC");
    }

    Java(String feature){
        this.newFeature = feature;
    }

    void printInfo(){
        System.out.println("Java Info --> " + newFeature);
    }
}
