
import java.text.DecimalFormat;

/**
 * @version 1.0 02/05/2024
 * @author Daniela Cano
 */
public class Rangos {

    /**
     * Default constructor
     */
    public Rangos() {
    }

    /**
     * Atributo que nos guarda la sumatoria de Loc/Method
     */
    private double dblXi;

    /**
     * Atributo que nos guarda la sumatoria de Ln(Loc/Method)
     */
    private double dblLnXi;

    /**
     * Atributo que nos permite pasar cada Loc/Method a un array
     */
    private double[] arrXi;

    /**
     * Atributo que nos permite pasar cada Ln(Loc/Method) a un array
     */
    private double[] arrLnXi;

    /**
     * Atributo que nos permite retornar el promedio de la sumatoria de Loc/Method
     */
    private double dblAvgXi;

    /**
     * Atributo que nos permite retornar el promedio de la sumatoria de Ln(Loc/Method)
     */
    private double dblAvgLnXi;

    /**
     * Atributo que nos permite retornar la varianza
     */
    private double dblVar;

    /**
     * Atributo que nos regresa el total de datos
     */
    private int intN;

    /**
     * Atributo que nos permite retornar la desviacion estandar
     */
    private double dblStdDev;

    /**
     * Atributo que nos permite retornar el valor del rango mas pequeño
     */
    private double dblVS;

    /**
     * Atributo que nos permite retornar el valor del rango pequeño
     */
    private double dblS;

    /**
     * Atributo que nos permite retornar el valor del rango mediano
     */
    private double dblM;

    /**
     * Atributo que nos permite retornar el valor del rango grande
     */
    private double dblL;

    /**
     * Atributo que nos permite retornar el valor del rango mas grande
     */
    private double dblVL;

    /**
     * @param dataX 
     * @param dataY
     */
    public double computeXi(String[] dataX, String[] dataY) {
        // Metodo que nos permite realizar el calculo de Xi
        intN = dataX.length;
        arrXi = new double[intN];
        for (int i = 0; i < intN; i++) {
            dblXi+=Double.parseDouble(dataX[i])/Double.parseDouble(dataY[i]);
            arrXi[i] = Double.parseDouble(dataX[i])/Double.parseDouble(dataY[i]);
        }
        return dblXi;
    }

    /**
     * 
     */
    public double computeAvgXi() {
        // Metodo que nos permite retornar el promedio de la sumatoria de Xi
        dblAvgXi = dblXi / intN;
        return dblAvgXi;
    }

    /**
     * 
     */
    public double computeLnXi() {
        // Metodo que nos permite realizar el calculo de Ln(Xi)
        arrLnXi = new double[intN];
        for (int i = 0; i < intN; i++) {
            dblLnXi += Math.log(arrXi[i]);
            arrLnXi[i] = Math.log(arrXi[i]);
        }
        return dblLnXi;
    }

    /**
     * 
     */
    public double computeAvgLnXi() {
        // Metodo que nos permite retornar el promedio de la sumatoria de Ln(Xi)
        dblAvgLnXi = dblLnXi / intN;
        return dblAvgLnXi;
    }

    /**
     * 
     */
    public double computeVar() {
        // Metodo que nos permite retornar la varianza
        for (int i = 0; i < intN; i++) {
            dblVar += (Math.pow((arrLnXi[i] - dblAvgLnXi), 2));
        }
        dblVar /= (intN - 1);
        return dblVar;
    }

    /**
     * @param var
     */
    public double computeStdDev() {
        // Metodo que nos permite retornar la desviacion estandar
        dblStdDev = Math.sqrt(dblVar);
        return dblStdDev;
    }

    /**
     * 
     */
    public double computeVS() {
        // Metodo que nos permite retornar el valor del rango mas pequeño
        dblVS = dblAvgLnXi - (2*dblStdDev);
        dblVS = Math.exp(dblVS);
        DecimalFormat df = new DecimalFormat("#.####");
        dblVS = Double.parseDouble(df.format(dblVS));
        return dblVS;
    }

    /**
     * 
     */
    public double computeS() {
        // Metodo que nos permite retornar el valor del rango pequeño
        dblS = dblAvgLnXi - dblStdDev;
        dblS = Math.exp(dblS);
        DecimalFormat df = new DecimalFormat("#.####");
        dblS = Double.parseDouble(df.format(dblS));
        return dblS;
    }

    /**
     * 
     */
    public double computeM() {
        // Metodo que nos permite retornar el valor del rango mediano
        dblM = dblAvgLnXi;
        dblM = Math.exp(dblM);
        DecimalFormat df = new DecimalFormat("#.####");
        dblM = Double.parseDouble(df.format(dblM));
        return dblM;
    }

    /**
     * 
     */
    public double computeL() {
        // Metodo que nos permite retornar el valor del rango grande
        dblL = dblAvgLnXi + dblStdDev;
        dblL = Math.exp(dblL);
        DecimalFormat df = new DecimalFormat("#.####");
        dblL = Double.parseDouble(df.format(dblL));
        return dblL;
    }

    /**
     * 
     */
    public double computeVL() {
        // Metodo que nos permite retornar el valor del rango mas grande
        dblVL = dblAvgLnXi + (2*dblStdDev);
        dblVL = Math.exp(dblVL);
        DecimalFormat df = new DecimalFormat("#.####");
        dblVL = Double.parseDouble(df.format(dblVL));
        return dblVL;
    }

}