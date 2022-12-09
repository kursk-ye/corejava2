package io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static com.kursk.Util.println;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        println(System.getProperty("user.dir"));
        FileInputStream fin = new FileInputStream("C:\\Users\\kursk\\Desktop\\caogao.txt");

    }
}
