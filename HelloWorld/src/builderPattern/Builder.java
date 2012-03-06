package builderPattern;

public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String string);
	public abstract void makeItems(String[] items);
	public abstract Object getResult();
}
