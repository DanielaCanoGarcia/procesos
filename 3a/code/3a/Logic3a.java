
/**
 * @version 1.0 19/04/2024
 * @author Daniela Cano
 */
public class Logic3a {

    /**
     * Default constructor
     */
    public Logic3a() {
    }

    /**
     * 
     */
    private String dataX;

    /**
     * 
     */
    private String dataY;

    /**
     * 
     */

    private String data;

    /**
     * 
     */
    private String[] arrDatax;

    /**
     * 
     */
    private String[] arrDataY;

    /**
     * 
     */
    private double yk;

    /**
     * 
     */
    private double b0;

    /**
     * 
     */
    private double b1;

    /**
     * 
     */
    private double rr;

    /**
     * 
     */
    private double rxy;

    /**
     * 
     */
    public void logic3a() {
        // Metodo que ejecuta el programa
        Input myInput = new Input();//UUU
	    Data myData = new Data();//UUU
	    OutPut myOut = new OutPut();//UUU
        EstimacionCorLineal myEstimacion = new EstimacionCorLineal();//UUU
	    System.out.println("exec logicla...");//UUU
        
        dataX="y.txt";//+
        data=myInput.readData(dataX);//+
	    System.out.println(data);//+
	    arrDatax = myData.saveData(data);//+
	    System.out.println(arrDatax);//+

        dataY="y2.txt";//+
        data=myInput.readData(dataY);//+
	    System.out.println(data);//+
	    arrDataY = myData.saveData(data);//+
	    System.out.println(arrDataY);//+
        System.out.println(myEstimacion.sumX(arrDatax));
        System.out.println(myEstimacion.SumY(arrDataY));
        System.out.println(myEstimacion.sumXY(arrDatax,arrDataY));
        System.out.println(myEstimacion.sumXX(arrDatax));
        System.out.println(myEstimacion.sumYY(arrDataY));
        System.out.println(myEstimacion.getAvgX(arrDataY));
        System.out.println(myEstimacion.getAvgY(arrDataY));
        System.out.println(myEstimacion.getB0());
        System.out.println(myEstimacion.getB1());
        System.out.println(myEstimacion.getRXY());
        System.out.println(myEstimacion.getYk());
        System.out.println(myEstimacion.getRR());
        b0=myEstimacion.getB0();
        System.out.println("B0: "+ myEstimacion.getB0());
        b1=myEstimacion.getB1();
        System.out.println("B1: "+ myEstimacion.getB1());
        rxy=myEstimacion.getRXY();
        System.out.println("RXY: "+ myEstimacion.getRXY());
        rr=myEstimacion.getRR();
        System.out.println("R^2: "+ myEstimacion.getRR());
        yk=myEstimacion.getYk();
        System.out.println("Yk: "+ myEstimacion.getYk());


	    myOut.writeData("EstimacionLineal.txt","B0: "+ b0 +" \nB1: "+ b1 +" \nR^2: "+ rr +" \nRXY: "+ rxy +" \nYk: "+ yk);//+

    }

}