package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy {  //File copy class is initialized for file copy
	public static void main(String[] args)
    {	
    	FileInputStream instream = null; //FileInputStream referenced object 
	FileOutputStream outstream = null; //FileOutputStream referenced object 
 
    	try{
    	    File infile =new File("D:\\MyInputFile.txt"); //Input FILE object created
    	    File outfile =new File("D:\\MyOutputFile.txt"); //Output FILE object created
 
    	    instream = new FileInputStream(infile); //FileInputStream type object instantiated
    	    outstream = new FileOutputStream(outfile); //FileOutputStream type object instantiated
 
    	    byte[] buffer = new byte[1024]; //A byte buffer array created of size 1024 bytes
 
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
    	    while ((length = instream.read(buffer)) > 0){ //Reading and writing process is done here
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	    instream.close(); 
    	    outstream.close();

    	    System.out.println("File copied successfully!!");
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
    }

}
