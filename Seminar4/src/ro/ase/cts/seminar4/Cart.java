package ro.ase.cts.seminar4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart implements Serializable{

	public static Map<String,Cart> instances=null;
	
	private String type;
	private static Cart instance=null;
	public ArrayList<String> products;
	private Cart() {
		instances = new HashMap<>();
		products=new ArrayList<String>();
	}

    public static synchronized Cart getInstance(String type) {
    	if(instance==null) {
    		instances=new HashMap<>();
    		
    		
    	}
		if(!instances.containsKey(type)) {
			return instances.get(type);
		}else {
			Cart myCart= new Cart();
    		myCart.type=type;
    		instances.put(type, myCart);
		}
		return instances.get(type);
	}
    public ArrayList<String> getProducts(){
    	return products;
    }
	
}
