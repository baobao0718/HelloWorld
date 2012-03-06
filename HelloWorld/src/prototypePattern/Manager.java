package prototypePattern;

import java.util.Hashtable;

public class Manager {
	private Hashtable<String, Product> showcase=new Hashtable<String, Product>();
	
	public void register(String name, Product proto){
		showcase.put(name, proto);
	}
	public Product create(String protoname){
		Product product=(Product)showcase.get(protoname).createClone();
		return product;
	}
}
