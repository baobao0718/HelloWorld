package compositePattern;

public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	public void printList(){
		printList("");
	}
	public abstract void printList(String prefix);
	public Entry add(Entry entry){
		return null;
	}
	public String toString(){
		return getName()+" ("+getSize()+")";
	}
}
