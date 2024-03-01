

/**
 * @author Daniela Cano
 */
public class Logic {

    /**
     * Default constructor
     */
    public Logic() {
    }

    /**
     * 
     */
    private int n;

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private String[] arrData;

    /**
     * 
     */
    private double media;

    /**
     * 
     */
    private double desv;

    /**
     * 
     */
    public void logicla() {
        // TODO implement here
	Input myInput = new Input();
	Data myData = new Data();
	Media myMedia = new Media();
	DesvEst myDesv = new DesvEst();
	OutPut myOut = new OutPut();
	System.out.println("exec logicla...");
        
        data = myInput.readData("C:\\Users\\zS22019950\\procesos\\psp\\1a\\code\\Model\\in2.txt");
	System.out.println(data);
	arrData = myData.saveData(data);
	System.out.println(arrData);
	
	n=arrData.length;
        media=myMedia.getMedia(arrData, n);
	System.out.println(media);

	desv = myDesv.getDesvEst(media, arrData, n);
	System.out.println(desv);

	myOut.writeData("Out.txt","Media: " + media+ " Desviacion Estandar: " +desv);
    }

}
