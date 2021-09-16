package xd.geo.exceptions;

import java.io.FileNotFoundException;

public class OpenFileTwo {
    public static void main(String[] args) throws FileNotFoundException {
        new java.io.FileInputStream("file.txt");
    }
}
