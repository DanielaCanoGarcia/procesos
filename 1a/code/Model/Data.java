
/**
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
    public String[] saveData(String data) {
        // TODO implement here
	String[] arrData = data.split(",");
    for(int i=0;i<arrData.length;i++){
        System.out.println(arrData[i]);
    }
	return arrData;
    }

}
