package Corejava;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;

public class JavaPrintFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("C:\\Users\\NVU2018\\Desktop\\Java-Test-Files"); //Enter path of folder/directory to print the text files out from

		        FilenameFilter textFilter = new FilenameFilter() {//Create Filter Object
		            @Override
					public boolean accept(File dir, String name) {
						String lowercaseName = name.toLowerCase();
						if (lowercaseName.endsWith(".txt")) { //Ignore files without.txt 
							return true;
						} else {
							return false;
						}
					}
		        };
		        try {
		        File[] files = folder.listFiles(textFilter); //Get list of files from directory
		        for(int i = 0; i < files.length; i++) { //Loops through files
		            if((i+1) % 3 == 0) { //If its the third text file print it out
		                Scanner input = new Scanner(files[i]);
		                while (input.hasNextLine()) //Printing out file contents
		                {
		                    System.out.println(input.nextLine());
		                }
		                input.close();
		            }
		        }
		        }
		        catch(Exception ex) { //Catch not handled exception 
		        	System.out.println(ex.getMessage());
		        }
		    }
		
	}


