package bridgePattern;

public class Display {
	private DisplayImpl impl;
	public Display(DisplayImpl impl){
		this.impl=impl;
	}
	protected void open() {
		impl.rawOpen();
	}
	protected void print() {
		impl.rawPrint();
	}
	protected void close() {
		impl.rawClose();
	}
	public final void display(){
		open();
		print();
		close();
	}
}
