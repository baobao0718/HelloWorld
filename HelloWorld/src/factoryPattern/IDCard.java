package factoryPattern;

public class IDCard extends Product {
	private String owner="";
	IDCard(String owner){
		this.owner=owner;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(owner+" is using his card...");
	}
	public String getowner(){
		return owner;
	}
}
