/**
 * @version 1.0 22/03/2024
 * @author Daniela Cano
 */
public class Logic2a {

    /**
     * Default constructor
     */
    public Logic2a() {
    }

    /**
     * 
     */
    private String programName;

    /**
     * 
     */
    public String data;

    /**
     * 
     */
    public String[] arrData;

    /**
     * 
     */
    public int lineCounter;

    /**
     * 
     */
    public int methodCounter;

    /**
     * 
     */
    public void logic2a() {
        // Metodo que crea instancias de Input, Data, LineCounter, MethodCounter, OutPut y las utiliza 
        Input myInput = new Input();//UUU
	    Data myData = new Data();//UUU
	    LineCounter myLineCounter = new LineCounter();//+
	    MethodCounter myMethodCounter = new MethodCounter();//+
	    OutPut myOut = new OutPut();//UUU
	    System.out.println("exec logicla...");//UUU
        
        programName="Data.java";//+
        data=myInput.readData(programName);//+
	    System.out.println(data);//+
	    arrData = myData.saveData(data);//+
	    System.out.println(arrData);//+
	
        lineCounter=myLineCounter.count(arrData);//+
	    System.out.println(lineCounter);//+

        methodCounter = myMethodCounter.count(arrData);//+
	    System.out.println(methodCounter);//+

	    myOut.writeData("Out.txt","total LOC: " + lineCounter+ " total methods: " +methodCounter);//+
    }

}
