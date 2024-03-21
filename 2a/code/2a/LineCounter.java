/**
 * @author Daniela Cano
 */
public class LineCounter {

    /**
     * Default constructor
     */
    public LineCounter() {
    }

    /**
     * 
     */
    private int totalLines;

    /**
     * @param arrData
     */
    public int count(String[] arrData) {//+
        // TODO implement here
        totalLines=0;//+
        for (String line : arrData) {//+
            if (!line.isEmpty()){//+
                if (line.trim().startsWith("/") ||
                 line.trim().startsWith("*") || line.trim().startsWith("}")) {//+
                }
                else {//+
                    totalLines++;//+
                }
            }
            
        }

        return totalLines;
    }

}
