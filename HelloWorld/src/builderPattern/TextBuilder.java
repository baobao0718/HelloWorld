package builderPattern;

public class TextBuilder extends Builder {
	private StringBuffer buffer=new StringBuffer();
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		buffer.append("@"+title+"@\n");
	}

	@Override
	public void makeString(String string) {
		// TODO Auto-generated method stub
		buffer.append(string+"\n");
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		for(int i=0; i<items.length; i++)
			buffer.append("*"+items[i]+"\n");
	}

	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		buffer.append("-=-=-=-=-=-=-=-=-=-=\n");
		return buffer.toString();
	}

}
