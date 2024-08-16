package testpackage;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        File fi = new File("Test.txt");
        File dir = new File("Test");
        dir.mkdir();

        File f2 = new File(dir, "Test2.txt");
        File f3 = new File(dir, "Test3.txt");
        File f4 = new File(dir, "Test4.txt");


        try{
            fi.createNewFile();
            f2.createNewFile();
            f3.createNewFile();
            f4.createNewFile();
        } catch(IOException e){
        }
        int count = 0;
        String str[] = dir.list();

        for(String s:str){
            System.out.println(s);
            count++;
        }

        System.out.println("number of files in directrory :" + count);
    }
}
