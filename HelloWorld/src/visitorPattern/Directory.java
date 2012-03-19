package visitorPattern;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
	private String name;
	private Vector<Entry> dir;
	public Directory(String name){
		this.name=name;
		dir=new Vector<Entry>();
	}
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		Iterator iterator=dir.iterator();
		int sum=0;
		while(iterator.hasNext()){
			sum+=((Entry)iterator.next()).getSize();
		}
		return sum;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return dir.iterator();
	}
	public Entry add(Entry entry){
		dir.add(entry);
		return entry;
	}

}
