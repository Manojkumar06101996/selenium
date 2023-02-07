package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./testdata/propertydata.properties");
		Properties property = new Properties();
		property.load(fis);
		
		String urlfromproperty = property.getProperty("url");
		System.out.println(urlfromproperty);
		String usernamefromeproperty= property.getProperty("username");
		System.out.println(usernamefromeproperty);
		String passwordfromproperty = property.getProperty("password");
		System.out.println(passwordfromproperty);
		
		
		
	}

}
