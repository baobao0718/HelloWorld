package adapterPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		load(new FileInputStream(new File(filename)));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		store(new FileOutputStream(new File(filename)), "");
	}

	@Override
	public void setValue(String key, String value) {
		// TODO Auto-generated method stub
		setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		// TODO Auto-generated method stub
		return getProperty(key);
	}

}
