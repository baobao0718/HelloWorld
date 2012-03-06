package prototypePattern;

public class UnderlinePen implements Product {
	private char ulchar='-';
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		for(int i=0; i<s.length(); i++)
			System.out.print(ulchar);
		System.out.println();
	}

	@Override
	public Product createClone() {
		// TODO Auto-generated method stub
		Product p=null;
		try {
			p=(Product)this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}
