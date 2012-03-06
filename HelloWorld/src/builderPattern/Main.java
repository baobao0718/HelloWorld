package builderPattern;

public class Main {
	public static void main(String[] args){
		if(args.length!=1){
			usage();
			System.exit(0);
		}
		if(args[0].equals("plain")){
			Director director=new Director(new TextBuilder());
			String resultString=(String) director.construct();
			System.out.println(resultString);
		}else if(args[0].equals("html")){
			Director director=new Director(new HTMLBuilder());
			String filename=(String) director.construct();
			System.out.println(filename+" already build.");
		}else{
			usage();
			System.exit(0);
		}
	}

	private static void usage() {
		// TODO Auto-generated method stub
		System.out.println("Usage: java Main plain");
		System.out.println("Usage: java Mani html");
	}
}
