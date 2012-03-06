package factoryPattern;

public class Main {
	public static void main(String []args){
		Factory factory=new IDCardFactory();
		Product card1=factory.create("Bobo");
		Product card2=factory.create("Mary");
		Product card3=factory.create("Queue");
		card1.use();
		card2.use();
		card3.use();
	}
}
