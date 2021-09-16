package xd.geo.exceptions;

public class OpenFile {
    public static void main(String[] args) {
        try {
            new java.io.FileInputStream("file.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Impossible open file");
        }
    }
}
