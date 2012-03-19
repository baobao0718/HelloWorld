package visitorPattern;

import java.util.Iterator;

public abstract class Entry implements Acceptor{
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry){
		return null;
	}
	public Iterator iterator(){
		return null;
	}
	public String toString(){
		return getName()+"("+getSize()+")";
	}
}
