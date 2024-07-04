import java.io.*;
/**
 * @version 1.0 02/05/2024
 * @author Daniela Cano
 */
public class Input {

    /**
     * Default constructor
     */
    public Input() {
    }

    /**
     * Atributo que nos ayudara a retornar el archivo
     */
    private String data;

    /**
     * Atributo que nos ayudara a leer un archivo
     */
    private BufferedReader br=null;

    /**
     * @param inFile
     */
    public String readData(String inFile) {
    // Metodo que nos lee el archivo

	try{//UUU
		br = new BufferedReader(new FileReader(inFile));//UUU 
		String temp="";//UUU
		String brRead;//UUU
		while((brRead = br.readLine()) != null){//UUU
			temp = temp + brRead+",";//UUU
		}//UUU
		data=temp;//UUU
	}catch(Exception e){//UUU
		System.out.println("No se encontro el archivo");//UUU
	}//UUU
	return data;//UUU
    }//UUU

}//UUU
