import java.text.DecimalFormat;

/**
 * @author Daniela Cano
 */
public class Media {

    /**
     * Default constructor
     */
    public Media() {
    }

    /**
     * 
     */
    private double media;

    /**
     * @param datalist 
     * @param n
     */
    public double getMedia(String[] datalist, int n) {
        // TODO implement here
        double [] arrData = new double[n];
        for(int i=0;i<n;i++){
            arrData[i]=Double.parseDouble(datalist[i]);
        }
        for(int j=0;j<n;j++){
            media+=arrData[j];
        }
        media/=n;
        DecimalFormat df = new DecimalFormat("###.##");
        media = Double.parseDouble(df.format(media));
	return media;
    }

}
