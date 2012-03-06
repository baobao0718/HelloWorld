package prototypePattern;

public class MessageBox implements Product {
	private char decochar='*';
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		for(int i=0; i<s.length()+2; i++)
			System.out.print(decochar);
		System.out.println("\n"+decochar+s+decochar);
		for(int i=0; i<s.length()+2; i++)
			System.out.print(decochar);
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
