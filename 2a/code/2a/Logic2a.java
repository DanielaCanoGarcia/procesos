

/**
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
        // TODO implement here
        Input myInput = new Input();//+
	    Data myData = new Data();//+
	    LineCounter myLineCounter = new LineCounter();//+
	    MethodCounter myMethodCounter = new MethodCounter();//+
	    OutPut myOut = new OutPut();//+
	    System.out.println("exec logicla...");//+
        
        programName="App.java";//+
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
