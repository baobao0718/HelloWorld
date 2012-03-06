package factoryPattern;

import java.util.Vector;

public class IDCardFactory extends Factory {
	private Vector<String> owners=new Vector<String>();
	
	@Override
	public Product createProduct(String owner) {
		// TODO Auto-generated method stub
		Product product=new IDCard(owner);
		System.out.println(owner+"'s card is created...");
		return product;
	}

	@Override
	public void registerProduct(Product product) {
		// TODO Auto-generated method stub
		owners.add(((IDCard)product).getowner());
	}
	public Vector<String> getowners(){
		return owners;
	}

}
