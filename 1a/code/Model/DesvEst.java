import java.text.DecimalFormat;

/**
 * @author Daniela Cano
 */
public class DesvEst {

    /**
     * Default constructor
     */
    public DesvEst() {
    }

    /**
     * @param media 
     * @param dataList 
     * @param n
     */
    public double getDesvEst(double media, String[] dataList, int n) {
        // TODO implement here
        double desv = 0;
        double [] arrData = new double[n];
        for(int i=0;i<n;i++){
            arrData[i]=Double.parseDouble(dataList[i]);
        }
        for(int j=0;j<n;j++){
            desv+=(Math.pow(arrData[j]-media, 2));
        } 
        desv/=(n-1);
        desv=Math.sqrt(desv);
        DecimalFormat df = new DecimalFormat("###.##");
        desv = Double.parseDouble(df.format(desv));
        return desv;
    }

}
