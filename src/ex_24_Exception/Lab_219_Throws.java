package ex_24_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_219_Throws {
    public static void main(String[] args) throws FileNotFoundException, Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
