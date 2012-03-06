package compositePattern;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
	private String name;
	private Vector<Entry> directory=new Vector<Entry>();
	public Directory(String name){
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int sum=0;
		Iterator<Entry> iterator=directory.iterator();
		while(iterator.hasNext()){
			sum+=iterator.next().getSize();
		}
		return sum;
	}

	@Override
	public void printList(String prefix) {
		// TODO Auto-generated method stub
		Iterator<Entry> iterator=directory.iterator();
		System.out.println(prefix+"/"+this);
		while(iterator.hasNext()){
			iterator.next().printList(prefix+"/"+name);
		}
	}
	public Entry add(Entry entry){
		directory.add(entry);
		return entry;
	}

}
