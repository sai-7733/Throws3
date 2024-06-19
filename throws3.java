import java.io.*;
class Example {  
   public static void main(String args[]) throws IOException
   {
	FileInputStream fis = null;
	try{
        fis = new FileInputStream("B:/myfile.txt");
	}
	catch(FileNotFoundException e){
	    System.out.println("The specified file is not present at given path");
	}
	int k; 
	try{
	while(( k = fis.read() ) != -1) 
	{ 
		System.out.print((char)k); 
	}
	fis.close(); 
	}
	catch(IOException g){
	    System.out.println("I/O error occured");
	}
   }
}