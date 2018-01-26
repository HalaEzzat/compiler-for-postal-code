package project;
import java.io.IOException;
import java.lang.Object;
import java.io.InputStream;
import java.io.FilterInputStream;
import java.io.DataInputStream;
import java.io.IOException;
public class Project {
    public static void main(String[] args) throws IOException
    {
        System.out.println("please enter postal code");
        DataInputStream in=new DataInputStream(System.in);
        parser parsing=new parser(new lexanz(in));
        parsing.run();
    }
    
    
}
