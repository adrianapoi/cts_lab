package ro.ase.cts.seminar6.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class TechProductFactory extends AbstractProductFactory{

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		return new TechProduct("generic");
	}

	@Override
	public String getCatalog() {
		ArrayList<String> records=readRecordsFromFile("tech_products.csv");
		StringBuilder builder= new StringBuilder();
		for(String record:records) {
			String[] productArrtributes=record.split(",");
			builder.append(productArrtributes[0]+ " - ");
			builder.append(productArrtributes[1]+" - ")
			.append(productArrtributes[2]+" ")
			.append(productArrtributes[3]+"\n");
		}
		return builder.toString();
	}
	
	private ArrayList<String> readRecordsFromFile(String fileName){
		ArrayList<String> records=new ArrayList<String>();
		
		URL fileUrl=getClass().getResource(fileName);
		File productsFile=new File(fileUrl.getPath());
		try {
			BufferedReader reader=new BufferedReader(new FileReader(productsFile));
			String line;
			try {
				while((line=reader.readLine())!=null) {
					records.add(line);
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return records;
	}

}