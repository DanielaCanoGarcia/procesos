
/**
 * @version 1.0 19/04/2024
 * @author Daniela Cano
 */
public class Data {

    /**
     * Default constructor
     */
    public Data() {
    }

    /**
     * @param data
     */
    public String[] saveData(String data) {//Este metodo nos ayuda a convertir un string a array
        //Utilizamos el metodo split para dividir el string por comas y lo guardamos en un array
	String[] arrData = data.split(",");//+
    for(int i=0;i<arrData.length;i++){//UUU
        System.out.println(arrData[i]);//UUU se imprime el array
    }//UUU
	return arrData;//UUU retorna el array
    }

}
