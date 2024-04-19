import java.io.*;
/**
 * @version 1.0 19/04/2024
 * @author Daniela Cano
 */
public class Input {

    /**
     * Default constructor
     */
    public Input() {
    }

    /**
     * 
     */
    private String data;

    /**
     * 
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
