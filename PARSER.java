package project;
import java.lang.Object;
import java.io.InputStream;
import java.io.FilterInputStream;
import java.io.DataInputStream;
import java.io.IOException; 

public class parser {
    public lexanz lexical;
    int token;
    parser(lexanz lexical)
    {
        this.lexical=lexical;
    }
    public void run() throws IOException
    {
        token=lexical.getchar();
        
        postalcode();
    }
    public void postalcode() throws IOException
    {
        if(token!=1)
            System.out.println("ERROR...INVALID POSTAL CODE!!");
        else
        {
            token=lexical.getchar();
            if(token!=2)
                System.out.println("ERROR...INVALID POSTAL CODE!!");
            else
            {
                token=lexical.getchar();
                if(token!=1)
                System.out.println("ERROR...INVALID POSTAL CODE!!");
                else
                {
                token=lexical.getchar();
                if(token!=3)
                System.out.println("ERROR...INVALID POSTAL CODE!!");
                else
                {
                token=lexical.getchar();
                if(token!=2)
                System.out.println("ERROR...INVALID POSTAL CODE!!");  
                else
                {
                token=lexical.getchar();
                if(token!=1)
                System.out.println("ERROR...INVALID POSTAL CODE!!");
                else
                {
                token=lexical.getchar();
                if(token!=2)
                System.out.println("ERROR...INVALID POSTAL CODE!!");
                else
                {
                    System.out.println("POSTAL CODE IS VALID!");
                }
                }
                }
                }
                }
                
            }
        }
    }
    
}
