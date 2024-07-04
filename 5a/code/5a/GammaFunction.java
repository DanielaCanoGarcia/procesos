
import java.util.*;

/**
 * @author Daniela Cano
 */
public class GammaFunction {

    /**
     * Default constructor
     */
    public GammaFunction() {
    }

    /**
     * 
     */
    private double gammaValue;

    /**
     * @param intValue
     */
    public void computeIntGamma(int intValue) {
        // TODO implement here
        intValue = 0;
    }

    /**
     * @param doubleValue
     */
    public static double computeDblGamma(double x) {
        // TODO implement here
        double tmp = (x - 0.5) * Math.log(x + 4.5) - (x + 4.5);
        double ser = 1.0 + 76.18009173 / (x + 0) - 86.50532033 / (x + 1) + 24.01409822 / (x + 2) - 1.231739516 / (x + 3)
                + 0.00120858003 / (x + 4) - 0.00000536382 / (x + 5);
        return tmp + Math.log(ser * Math.sqrt(2 * Math.PI));
    }
}