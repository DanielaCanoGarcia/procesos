
import java.util.*;

/**
 * @author Daniela Cano
 */
public class SimpsonIntegration {

    /**
     * Default constructor
     */
    public SimpsonIntegration() {
    }

    /**
     * 
     */
    private int intNumSeg;

    /**
     * 
     */
    private double dblW;

    /**
     * 
     */
    private double dblE;

    /**
     * 
     */
    private int intDOF;

    /**
     * 
     */
    private double dblX;

    /**
     * 
     */
    private double[] dblTotXi;

    /**
     * 
     */
    private double[] dblFirstBaseTerms;

    /**
     * 
     */
    private double[] dblExponent;

    /**
     * 
     */
    private double dblCoeff;

    /**
     * 
     */
    private double[] dblFxi;

    /**
     * 
     */
    private double dblFinalTerms;

    /**
     * 
     */
    private double[] dblFTerms;

    /**
     * 
     */
    private double dblFinalValue;

    /**
     * @param intNumSeg 
     * @param dblX
     */
    public double computeW(int intNumSeg, double dblX) {
        // TODO implement here
        dblW = dblX/intNumSeg;
        System.out.println(dblW);
        return dblW;

    }


    /**
     * @param intNumSeg
     */
    public double[] computeXi(int intNumSeg) {
        // TODO implement here
        dblTotXi = new double[intNumSeg + 1];
        dblTotXi[0] = 0.0;

        for (int i = 1; i <= intNumSeg; i++) {
            dblTotXi[i] = dblTotXi[i - 1] + this.dblW;
            System.out.println("xi" + dblTotXi[i]);
        }

        return dblTotXi;
    }

    /**
     * @param intNumSeg 
     * @param dblTotXi 
     * @param intDOF
     */
    public double[] computeFirtsBaseTerms(int intNumSeg, int intDOF) {
        // TODO implement here
        dblFirstBaseTerms = new double[intNumSeg + 1];
        for (int i = 0; i <= intNumSeg; i++) {
            dblFirstBaseTerms[i] = 1 + (Math.pow(dblTotXi[i], 2) / intDOF);
            System.out.println("fbt" + dblFirstBaseTerms[i]);
        }

        return dblFirstBaseTerms;
    }

    /**
     * @param intDOF
     */
    public double[] computeExponent(int intNumSeg,int intDOF) {
        // TODO implement here
        dblExponent = new double[intNumSeg + 1];
        for (int i = 0; i <= intNumSeg; i++) {
            dblExponent[i] = Math.pow(dblFirstBaseTerms[i], (((intDOF + 1) / 2)*-1));
            System.out.println("exp" + dblExponent[i]);
        }
        return dblExponent;
    }

    /**
     * @param intDOF
     */


    public double computeCoefficient(int intDOF) {
        // TODO implement here
        double x;
        GammaFunction myGrammaFunction = new GammaFunction();

        x = (double) intDOF;
        dblCoeff = Math.exp(myGrammaFunction.computeDblGamma((x + 1) / 2)) /
                (Math.sqrt(x * Math.PI) * Math.exp(myGrammaFunction.computeDblGamma((x / 2))));
        System.out.println(dblCoeff);
        return dblCoeff;
    }

    /**
     * @param intNumSeg
     */
    public double[] computeFxi(int intNumSeg) {
        // TODO implement here
        dblFxi= new double[intNumSeg + 1];

        for (int i = 0; i <= intNumSeg; i++) {
            dblFxi[i] = dblExponent[i]*dblCoeff;
            System.out.println("fxi" + dblFxi[i]);
        }

        return dblFxi;
    }

    /**
     * @param intNumSeg
     */
    public double computeFinalTerms(double dblX,int intNumSeg) {
        // TODO implement here
        dblFTerms = new double[intNumSeg + 1];
        dblFinalTerms = 0.0;
        for (int i = 0; i <= intNumSeg; i++) {
            if (i == 0 || i == intNumSeg) {
                dblFTerms[i] = dblFxi[i]*1*(dblX/(3.0*intNumSeg));
            }
            else if (i%2 == 0 && i != 0 && i != intNumSeg) {
                dblFTerms[i] = dblFxi[i]*2*(dblX/(3.0*intNumSeg));
            }
            else if (i%2 != 0 && i != 0 && i != intNumSeg) {
                dblFTerms[i] = dblFxi[i]*4*(dblX/(3.0*intNumSeg));
            }
            System.out.println("ft" + dblFTerms[i]);

        }

        for (int i = 0; i <= intNumSeg; i++) {
            dblFinalTerms += dblFTerms[i];
        }
        System.out.println("ft" + dblFinalTerms);
        return dblFinalTerms;
    }

    /**
     * @param intNumSeg
     */
    public double computeFinalVallue(int intNumSeg, double dblE, double dblX, int intDof) {
        // TODO implement here
        double [] ME = new double[intNumSeg + 1];
        ME[0] = 0.0;
        double rest = 0.0;
        int aux = 1;

        for (int i = aux; i <= (intNumSeg/10); i++) {
            ME[i] = dblFinalTerms;
            System.out.println("me" + ME[i]);
        }

        for (int j = 0; j <= intNumSeg-1; j++) {
            rest = Math.abs(ME[j]-ME[j+1]);
            System.out.println("rest" + rest);

        }


        do {
            intNumSeg += 10;
            ME = new double[intNumSeg + 1];
            computeW(intNumSeg, dblX);
            computeXi(intNumSeg);
            computeFirtsBaseTerms(intNumSeg, intDof);
            computeExponent(intNumSeg,intDof);
            computeCoefficient(intDof);
            computeFxi(intNumSeg);
            computeFinalTerms(dblX, intNumSeg);
            aux ++;
            for (int i = aux; i <= (intNumSeg/10); i++) {
                ME[i] = dblFinalTerms;
                System.out.println("me" + ME[i]);
            }

            for (int j = 0; j <= intNumSeg-1; j++) {
                rest = Math.abs(ME[j]-ME[j+1]);
                System.out.println("rest" + rest);

            }

        }while (rest > dblE);
        dblFinalValue=dblFinalTerms;
        System.out.println("fv" + dblFinalValue);
        return dblFinalValue;
    }

}