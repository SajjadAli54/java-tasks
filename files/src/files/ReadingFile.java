package files;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Sajjad Ali
 */
public class ReadingFile {
    public static void main(String args[]){
        try(InputStream ins = new FileInputStream("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\files\\ReadingFile.java")){
            int b = 0;
            int i = 0;
            while((b =ins.read()) != -1){
                if(b == '\n'){
                    i++;
                    if(i==3){
                        break;
                    }
                }
                System.out.print((char)b);
            }
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    
}
