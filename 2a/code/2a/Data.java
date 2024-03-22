
/**
 * @version 1.0 22/03/2024
 * @author Daniela Cano
 */
public class Data {

    /**
     * Default constructor
     */
    public Data() {
    }

    /**
     * @param data
     */
    public String[] saveData(String data) {//Este metodo nos ayuda a convertir un string a array
        // TODO implement here
	String[] arrData = data.split("¬");//+
    for(int i=0;i<arrData.length;i++){//UUU
        System.out.println(arrData[i]);//UUU
    }//UUU
	return arrData;//UUU
    }

}
