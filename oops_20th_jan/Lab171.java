package oops_20th_jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab171 {
    public static void main(String[] args) throws Exception {

        readFile("C://Pramod.txt");

    }
    public static void readFile(String file) throws Exception {
        File f = new File(file);
        FileReader fileReader = new FileReader(file);
        if (file.isEmpty()){
            throw new FileNotFoundException();
        }
        System.out.println("Not vul code");     // prone to error

        int a = 10/0;
    }
}

