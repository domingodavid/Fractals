
public class TupperWare<T>{
	//data object
	private T data; //where T is the unknown type
	
	public TupperWare(T pData) {
		data = pData;
	}
	
	public static void main(String[] arg) {
		System.out.println("tupper");
		
		//try creating a TupperWare object to contain an
		//Integer
		TupperWare blue = new TupperWare(3); //has a number
		
		//create one that can contain a String
		TupperWare a = new TupperWare("Bologne");
		
		//a double?
		TupperWare b = new TupperWare(3.14);
		
		//a boolean?
		TupperWare c = new TupperWare(true);
		
		TupperWare d = new TupperWare(new int[] {});
		
		TupperWare e = new TupperWare(new TupperWare(3));
	}
		
}

