import java.io.*;
/**
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
    // read file implement here
	// Hard code

	try{
		br = new BufferedReader(new FileReader(inFile));
		String temp="";
		String brRead;
		while((brRead = br.readLine()) != null){
			temp = temp + brRead+",";
		}
		data=temp;
	}catch(Exception e){
		System.out.println("No se encontro el archivo");
	}
	return data;
    }

}
