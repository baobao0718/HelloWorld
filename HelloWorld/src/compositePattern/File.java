package compositePattern;

public class File extends Entry {
	private String name;
	private int size;
	public File(String name, int size){
		this.name=name;
		this.size=size;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void printList(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix+"/"+this);
	}

}
