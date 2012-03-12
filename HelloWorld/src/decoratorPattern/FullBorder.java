package decoratorPattern;

public class FullBorder extends Border{
	public FullBorder(Display display){
		super(display);
	}
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns()+2;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows()+2;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row==0||row==display.getRows()+1)
			return "+"+makeLine('-', display.getColumns())+"+";
		else
			return "|"+display.getRowText(row-1)+"|"; 
	}
	private String makeLine(char ch, int count){
		StringBuffer buf=new StringBuffer();
		for(int i=0; i<count; i++)
			buf.append(ch);
		return buf.toString();
	}

}
