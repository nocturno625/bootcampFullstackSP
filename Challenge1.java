package Challenge1;
import java.util.*;
import java.math.*;
public class Challenge1 {
public static void main(String[] args) {
	/* List<String> myList = Arrays.asList("John","Ben","Gregor","Peter");
	String name="", type1="Tipo A", type2="Tipo B", ejem="",test="Peter";
	boolean r;
	Scanner keyboard = new Scanner(System.in);
	while(!name.equals(type1) && !name.equals(type2)) {
	System.out.println("digite el tipo de cadena:(Tipo A o Tipo B )"  );
	name = teclado.nextLine();
	}
	ejem= ChooseType(name);
	r=findString(test,myList);
	System.out.println(ejem);
	System.out.println(r);*/
	
	}

public static String ChooseType (String name){
	int i,x;
	String type1="Tipo A",chain="";
	if (name.equals(type1)) {
		chain="54";
		for(i=0;i<=7;i++) {
		x= (int)(Math.random()*9);
		chain= chain + String.valueOf(x);
		
		
		}
	}else {
	    chain="08";
		for(i=0;i<=7;i++) {
		x= (int)(Math.random()*9);
		chain= chain + String.valueOf(x);	
		
	}
		
	}
	return chain;
}

public static boolean findString (String key,  List<String> myList){
	
		
		if(myList.contains(key)) {
		    return false;
		} else 
			return true;  
	}
		
	

}