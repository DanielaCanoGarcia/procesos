
/**
 * @version 1.0 02/05/2024
 * @author Daniela Cano
 */
public class Logic4a {

    /**
     * Default constructor
     */
    public Logic4a() {
    }

    /**
     * Atributo que nos ayudara a retornar el archivo LOC.TXT
     */
    private String dataX;

    /**
     * Atributo que nos ayudara a retornar el archivo Method.TXT
     */
    private String dataY;

    /**
     * Atributo que nos ayudara a retornar ambos archivos
     */
    private String data;

    /**
     * Atributo que nos permite pasar el archivo a un array
     */
    private String[] arrDataX;

    /**
     * Atributo que nos permite pasar el archivo a un array
     */
    private String[] arrDataY;

    /**
     * Atributo que nos permite retornar el valor del rango mas pequeño
     */
    private double VS;

    /**
     * Atributo que nos permite retornar el valor del rango pequeño
     */
    private double S;

    /**
     * Atributo que nos permite retornar el valor del rango mediano
     */
    private double M;

    /**
     * Atributo que nos permite retornar el valor del rango grande
     */
    private double L;

    /**
     * Atributo que nos permite retornar el valor del rango mas grande
     */
    private double VL;

    /**
     * Metodo que nos permite ejecutar el programa
     */
    public void logic4a() {
        Input myInput = new Input();//UUU
	    Data myData = new Data();//UUU
	    OutPut myOut = new OutPut();//UUU
        Rangos myRango = new Rangos();//UUU
	    System.out.println("exec logicla...");//UUU
        
        dataX="LOC2.txt";//+
        data=myInput.readData(dataX);//+
	    System.out.println(data);//+
	    arrDataX = myData.saveData(data);//+
	    System.out.println(arrDataX);//+

        dataY="Method2.txt";//+
        data=myInput.readData(dataY);//+
	    System.out.println(data);//+
	    arrDataY = myData.saveData(data);//+
	    System.out.println(arrDataY);//+

        System.out.println("xi:"+myRango.computeXi(arrDataX, arrDataY));
        System.out.println("LnXi:"+myRango.computeLnXi());
        System.out.println("Avgxi:"+myRango.computeAvgXi());
        System.out.println("AvgLnXi:"+myRango.computeAvgLnXi());
        System.out.println("var:"+myRango.computeVar());
        System.out.println("dev:"+myRango.computeStdDev());
        System.out.println("vs:"+myRango.computeVS());
        System.out.println("s:"+myRango.computeS());
        System.out.println("m:"+myRango.computeM());
        System.out.println("L:"+myRango.computeL());
        System.out.println("vl:"+myRango.computeVL());
        
        VS=myRango.computeVS();
        System.out.println("VS: "+ myRango.computeVS());
        S=myRango.computeS();
        System.out.println("S: "+ myRango.computeS());
        M=myRango.computeM();
        System.out.println("M: "+ myRango.computeM());
        L=myRango.computeL();
        System.out.println("L: "+ myRango.computeL());
        VL=myRango.computeVL();
        System.out.println("VL: "+ myRango.computeVL());

	    myOut.writeData("Rangos.txt","VS: "+VS+" S: "+S+" M: "+M+" L: "+L+" VL: "+VL);//+
    }

}