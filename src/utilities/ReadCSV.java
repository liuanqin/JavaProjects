package utilities;

import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
	// This function will read CSV file and return data as a list
	public static List<String[]> read(String file) throws FileNotFoundException{
		List<String[]> data = new LinkedList<>();
		String dataRow;
		try{
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		while((dataRow = br.readLine()) != null){
		String[] dataRecords = dataRow.split(",");
		data.add(dataRecords);
		}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		catch(IOException e){
			System.out.println("Could not read file");
		}
		return data;
	}
	
}
