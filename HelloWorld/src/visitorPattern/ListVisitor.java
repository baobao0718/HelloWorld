package visitorPattern;

import java.util.Iterator;

public class ListVisitor extends Visitor {
	private String currentdir="";
	
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		System.out.println("visiting..."+currentdir+"/"+file);
	}

	@Override
	public void visit(Directory directory) {
		// TODO Auto-generated method stub
		System.out.println("visiting..."+currentdir+"/"+directory);
		String savedir=currentdir;
		currentdir=currentdir+"/"+directory.getName();
		Iterator iterator=directory.iterator();
		while(iterator.hasNext()){
			((Entry)iterator.next()).accept(this);
		}
		currentdir=savedir;
	}


}
