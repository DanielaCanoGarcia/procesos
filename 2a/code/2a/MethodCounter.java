/**
 * @version 1.0 22/03/2024
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
        //metodo que cuenta los metodos
        for (String line : arrData) {//+
            if (line.trim().contains(";")){
                continue;
            }
            if (!line.isEmpty() && line.trim().contains("public")) {//+
                if (!line.trim().contains("class")) { 
                    
                        totalMethods++;//+
                    
                    
                }
            }
        }
        return totalMethods;//+
    }

}