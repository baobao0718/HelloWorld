package strategyPattern;

public class Maintest {
	public static void main(String[] args){
		String[] data={
				"Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
		};
		int [] dataint={442,324,56,7,864,76,465,3455,65,34,77,};
		SorterAndPrint sap1=new SorterAndPrint(data, new InsertSorter());
		SorterAndPrint sap2=new SorterAndPrint(data, new HeapSort());
		sap1.execute();
		System.out.println();
		sap2.execute();
	}
}
