package templatePattern;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public void display(){
		open();
		print();
		close();
	}
	
}
