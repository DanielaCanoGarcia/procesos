
import java.util.*;

/**
 * @author Daniela Cano
 */
public class Logic5a {

    /**
     * Default constructor
     */
    public Logic5a() {
    }

    /**
     * 
     */
    private int intNumSeg;

    /**
     * 
     */
    private double dblE;

    /**
     * 
     */
    private int intDof;

    /**
     * 
     */
    private double dblX;

    /**
     * 
     */
    public void logic5a() {
        // TODO implement here
        OutPut myOutPut = new OutPut();
        dblE = 0.00001;
        dblX = 1.1;
        intNumSeg = 10;
        intDof = 9;

        SimpsonIntegration mySimpsonIntegration = new SimpsonIntegration();

        mySimpsonIntegration.computeW(intNumSeg, dblX);
        mySimpsonIntegration.computeXi(intNumSeg);
        mySimpsonIntegration.computeFirtsBaseTerms(intNumSeg, intDof);
        mySimpsonIntegration.computeExponent(intNumSeg,intDof);
        mySimpsonIntegration.computeCoefficient(intDof);
        mySimpsonIntegration.computeFxi(intNumSeg);
        mySimpsonIntegration.computeFinalTerms(dblX, intNumSeg);
        mySimpsonIntegration.computeFinalVallue(intNumSeg, dblE, dblX, intDof);
        myOutPut.writeData("resultados.txt", "Resultado: "+mySimpsonIntegration.computeFinalVallue(intNumSeg, dblE, dblX, intDof));
    }

}