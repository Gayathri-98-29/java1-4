package java14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filenotfound01 {
	  
	// create FileNotFoundExceptionExample1 to undestand the first point.  

	    public static void main(String[] args) throws Exception   
	    {  
	         // creating an instance of the FileReader class  
	         FileReader fileReader = new FileReader("simple1.txt");  
	         // create an instance of the BufferedReader and pass the FileReader instance to it.  
	         BufferedReader bufferReader = new BufferedReader(fileReader);  
	         // declaring an empty string by passing null value  
	         String fileData = null;  
	         // use while loop to read and print data from buffered reader   
	         while ((fileData = bufferReader.readLine()) != null)   
	         {  
	             System.out.println(fileData);  
	         }  
	         // closing the BufferedReader object  
	         try {  
	            bufferReader.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	}  


