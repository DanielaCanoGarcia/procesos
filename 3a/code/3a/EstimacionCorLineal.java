import java.text.DecimalFormat;

/**
 * @version 1.0 19/04/2024
 * @author Daniela Cano
 */
public class EstimacionCorLineal {

    /**
     * Default constructor
     */
    public EstimacionCorLineal() {
    }

    /**
     * 
     */
    private double dblSumX;

    /**
     * 
     */
    private double dblSumY;

    /**
     * 
     */
    private double dblSumXY;

    /**
     * 
     */
    private double dblSumXX;

    /**
     * 
     */
    private double dblSumYY;

    /**
     * 
     */
    private double dblAvgX;

    /**
     * 
     */
    private double dblAvgY;

    /**
     * 
     */
    private int intN;

    /**
     * 
     */
    private double dblB1;

    /**
     * 
     */
    private double dblRR;

    /**
     * 
     */
    private double dblB0;

    /**
     * 
     */

    private int dblXk;

    /**
     * 
     */
    private double dblYk;

    /**
     * @param datalistX
     */

    private double dblRXY;

    /**
     * @param datalistX
     */
    public double sumX(String[] datalistX) {
        // Metodo para obtener la suma de los datos de X
        dblSumX = 0;
        for (int i = 0; i < datalistX.length; i++) {
            dblSumX = dblSumX + Double.parseDouble(datalistX[i]);
        }
        return dblSumX;
    }

    public double SumY(String[] datalistY) {
        // Metodo para obtener la suma de los datos de Y
        dblSumY = 0;
        for (int i = 0; i < datalistY.length; i++) {
            dblSumY = dblSumY + Double.parseDouble(datalistY[i]);
        }
        return dblSumY;
    }

    /**
     * @param datalistX 
     * @param datalistY
     */
    public double sumXY(String[] datalistX, String[] datalistY) {
        // Metodo para obtener la suma de los datos de XY
        dblSumXY = 0;
        for (int i = 0; i < datalistX.length; i++) {
            dblSumXY += (Double.parseDouble(datalistX[i]) * Double.parseDouble(datalistY[i]));
        }
        return dblSumXY;
    }

    /**
     * @param datalistX
     */
    public double sumXX(String[] datalistX) {
        // Metodo para obtener la suma de los datos de XX
        dblSumXX = 0;
        for (int i = 0; i < datalistX.length; i++) {
            dblSumXX += (Double.parseDouble(datalistX[i]) * Double.parseDouble(datalistX[i]));
        }
        return dblSumXX;
    }

    /**
     * @param datalistY
     */
    public double sumYY(String[] datalistY) {
        // Metodo para obtener la suma de los datos de YY
        dblSumYY = 0;
        for (int i = 0; i < datalistY.length; i++) {
            dblSumYY += (Double.parseDouble(datalistY[i]) * Double.parseDouble(datalistY[i]));
        }
        return dblSumYY;
    }

    /**
     * @param datalistX
     */
    public double getAvgX(String[] datalistX) {
        // Metodo para obtener el average de los datos de X
        dblAvgX = 0;
        intN = datalistX.length;
        dblAvgX = dblSumX / intN;
        return dblAvgX;
    }

    /**
     * @param datalistY
     */
    public double getAvgY(String[] datalistY) {
        // Metodo para obtener el average de los datos de Y
        dblAvgY = 0;
        intN = datalistY.length;
        dblAvgY = dblSumY / intN;
        return dblAvgY;
    }

    /**
     * 
     */
    public double getB0() {
        // Metodo para obtener el B0
        dblB0 = 0;
        dblB1 = 0;
        dblB1 = dblSumXY - (intN * dblAvgX * dblAvgY);
        dblB1 = dblB1 / (dblSumXX - (intN * dblAvgX * dblAvgX));
        dblB0 = dblAvgY - (dblAvgX * dblB1);
        DecimalFormat df = new DecimalFormat("#.####");
        dblB0 = Double.parseDouble(df.format(dblB0));
        return dblB0;
    }

    /**
     * 
     */
    public double getB1() {
        // Metodo para obtener el B1
        dblB1 = 0;
        dblB1 = dblSumXY - (intN * dblAvgX * dblAvgY);
        dblB1 = dblB1 / (dblSumXX - (intN * dblAvgX * dblAvgX));
        DecimalFormat df = new DecimalFormat("#.####");
        dblB1 = Double.parseDouble(df.format(dblB1));
        return dblB1;
    }

    /**
     * 
     */
    public double getYk() {
        // Metodo para obtener el Yk
        dblYk = 0;
        dblXk = 386;
        dblB0 = 0;
        dblB1 = 0;
        dblB1 = dblSumXY - (intN * dblAvgX * dblAvgY);
        dblB1 = dblB1 / (dblSumXX - (intN * dblAvgX * dblAvgX));
        dblB0 = dblAvgY - (dblAvgX * dblB1);
        dblYk = dblB0 + (dblB1 * dblXk);
        DecimalFormat df = new DecimalFormat("#.####");
        dblYk = Double.parseDouble(df.format(dblYk));
        return dblYk;
    }

    public double getRR() {
        // Metodo para obtener el R^2
        dblRR = 0;
        dblRR = Math.pow(dblRXY, 2);
        DecimalFormat df = new DecimalFormat("#.####");
        dblRR = Double.parseDouble(df.format(dblRR));
        return dblRR;
    }

    /**
     * 
     */
    public double getRXY() {
        // Metodo para obtener el RXY
        dblRXY = 0;
        dblRXY = 0;
        dblRXY = intN * dblSumXY - (dblSumX * dblSumY);
        dblRXY = dblRXY / Math.sqrt((intN * dblSumXX - (dblSumX * dblSumX)) * (intN * dblSumYY - (dblSumY * dblSumY)));
        DecimalFormat df = new DecimalFormat("#.####");
        dblRXY = Double.parseDouble(df.format(dblRXY));
        return dblRXY;
    }

}