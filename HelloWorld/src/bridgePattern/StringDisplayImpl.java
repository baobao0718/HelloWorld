package bridgePattern;


public class StringDisplayImpl extends DisplayImpl {
	private String string;
	private int width;
	public StringDisplayImpl(String string){
		this.string=string;
		this.width=string.getBytes().length;
	}
	@Override
	protected void rawOpen() {
		// TODO Auto-generated method stub
		printLine();
	}

	@Override
	protected void rawPrint() {
		// TODO Auto-generated method stub
		System.out.println("|"+string+"|");
	}

	@Override
	protected void rawClose() {
		// TODO Auto-generated method stub
		printLine();
	}
	private void printLine(){
		System.out.print("+");
		for(int i=0; i<width; i++){
			System.out.print("-");
		}
		System.out.println("+");
	}

}
