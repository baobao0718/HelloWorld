package templatePattern;

public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;
	public StringDisplay(String string){
		this.string=string;
		this.width=string.length();
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		printLine();
	}

	private void printLine() {
		// TODO Auto-generated method stub
		System.out.print("+");
		for(int i=0; i<width; i++)
			System.out.print("-");
		System.out.print("+");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
