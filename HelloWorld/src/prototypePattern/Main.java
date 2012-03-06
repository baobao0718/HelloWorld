package prototypePattern;

public class Main {
	public static void main(String[] args){
		Manager manager=new Manager();
		UnderlinePen upen=new UnderlinePen();
		MessageBox mbox=new MessageBox();
		manager.register("BOBO", upen);
		manager.register("Mary", mbox);
		
		Product p1=manager.create("BOBO");
		p1.use("My name is Bobo.");
		Product p2=manager.create("Mary");
		p2.use("Mary is a good boy");
	}
}
