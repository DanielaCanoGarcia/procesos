import java.util.*;
/**
 * @version 1.0 19/04/2024
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
        // Metodo que nos crea un archivo con el total de lineas y metodos encontrados
        Formatter file = null;//UUU
        try{//UUU
            file = new Formatter("C:\\Users\\zS22019950\\procesos\\psp\\3a\\code\\3a\\"+outFile);//UUU
            file.format("%s", outText);//UUU
        }catch(Exception e){//UUU
            System.out.println("No se ha podido guardar el archivo");//UUU
        }finally{//UUU
            file.close();//UUU
        }
        }
    }
