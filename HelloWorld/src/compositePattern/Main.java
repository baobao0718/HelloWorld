package compositePattern;

public class Main {
	public static void main(String []args){
		System.out.println("Making root entries...");
		Directory rootdir=new Directory("root");
		Directory bindir=new Directory("bin");
		Directory tmpdir=new Directory("tmp");
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		bindir.add(new File("vi", 10000));
		bindir.add(new File("latex", 20000));
		rootdir.printList();
	}
}
