package builderPattern;

public class Director {
	private Builder builder;
	public Director (Builder builder){
		this.builder=builder;
	}
	public Object construct(){	//建立文件
		builder.makeTitle("Greeting");
		builder.makeString("Long long ago...");
		builder.makeItems(new String []{
				"Morning", "Good night",
		});
		builder.makeString("It is dark");
		builder.makeItems(new String []{
				"Sleepy", "Huhuhuhu",
		});
		return builder.getResult();
	}
}
