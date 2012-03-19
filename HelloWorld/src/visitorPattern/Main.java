package visitorPattern;

import javax.naming.directory.DirContext;


public class Main {
	public static void main(String[] args){
		System.out.println("Making root entries...");
		Directory rootdir=new Directory("root");
		Directory bindir=new Directory("bin");
		Directory usrdir=new Directory("usr");
		rootdir.add(bindir);
		rootdir.add(usrdir);
		bindir.add(new File("vi", 10000));
		bindir.add(new File("latex", 20000));
		rootdir.accept(new ListVisitor());
		
		System.out.println();
		System.out.println("Making user entries...");
		Directory yuki=new Directory("yuki");
		Directory hanako=new Directory("hanako");
		usrdir.add(yuki);
		usrdir.add(hanako);
		yuki.add(new File("diary.html", 100));
		yuki.add(new File("my.java", 500));
		hanako.add(new File("game.exe", 300));
		rootdir.accept(new ListVisitor());
	}
}
