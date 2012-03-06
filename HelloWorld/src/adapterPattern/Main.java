package adapterPattern;

import java.io.IOException;

public class Main {
	public static void main(String[] args){
		FileIO fileIO=new FileProperties();
		try {
			fileIO.readFromFile("file.txt");
			fileIO.setValue("year", "2012");
			fileIO.setValue("month", "11");
			fileIO.setValue("day", "12");
			fileIO.writeToFile("newfile.txt");
		} catch ( IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
