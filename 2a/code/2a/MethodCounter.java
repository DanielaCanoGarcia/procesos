

/**
 * @author Daniela Cano
 */
public class MethodCounter {

    /**
     * Default constructor
     */
    public MethodCounter() {
    }

    /**
     * 
     */
    public int totalMethods;

    /**
     * @param arrData
     */
    public int count(String[] arrData) {
        for (String line : arrData) {//+
            if (!line.isEmpty() && line.trim().contains("public")) {//+
                if (!line.trim().contains("class")) {  //+
                    totalMethods++;//+
                }
            }
        }
        return totalMethods;//+
    }

}