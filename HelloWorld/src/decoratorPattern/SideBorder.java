package decoratorPattern;

public class SideBorder extends Border {
	private char borderchar;
	public SideBorder(Display display, char borderchar){
		super(display);
		this.borderchar=borderchar;
	}
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns()+2;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		return borderchar+display.getRowText(row)+borderchar;
	}

}
