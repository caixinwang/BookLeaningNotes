package c3_decorator.v4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path="D:\\message\\JavaProject\\HeadFirstDesignPatterns\\src\\c3_decorator\\v4\\a.txt";
        LowercaseInputStream in=new LowercaseInputStream(new BufferedInputStream(new FileInputStream(new File(path))));
        int c=0;
        while((c=in.read())>=0){
            System.out.print((char) c);
        }
        in.close();
    }
}
