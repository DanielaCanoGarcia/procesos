import java.util.*;
/**
 * @author Daniela Cano
 */
public class OutPut {

    /**
     * Default constructor
     */
    public OutPut() {
    }

    /**
     * @param outFile 
     * @param outText
     */
    public void writeData(String outFile, String outText) {
        // TODO implement here
        Formatter file = null;
        try{
            file = new Formatter("C:\\Users\\zS22019950\\procesos\\psp\\1a\\code\\Model\\"+outFile);
            file.format("%s", outText);
        }catch(Exception e){
            System.out.println("No se ha podido guardar el archivo");
        }finally{
            file.close();
        }
        }
    }
