package bridgePattern;

public class CountDisplay extends Display {
	public CountDisplay(DisplayImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	protected void mutiDisplay(int times) {
		open();
		for(int i=0; i<times; i++)
			print();
		close();
	}
}
