package FileCode;
import java.lang.*;
import java.io.*;
import BasicCode.*;


public class FileReadWriteDemo
{
	private File file;				
	private FileWriter writer;		
	private FileReader reader;		
	private BufferedReader bfr;	
	String[] words=null;
	String s;	
	
	
	public void writeInFile(Customer p)
	{
		
		try
		{
			file = new File("History.txt");	
		
			file.createNewFile();					
			writer = new FileWriter(file, true);	
			writer.write(p.SaveData()+"\r"+"\n"+"**"+"\r"+"\n");	
		
			writer.flush();							
			writer.close();							 
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		
		
		try
		{
			//file = new File("History.txt");	
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);		
			String text="";
			String temp;					
			
			while((temp=bfr.readLine())!=null)		//reading one line from the file, storing it in the variable temp and checking whether it is null or not. It will be null at the end of reading from the file.
			{
				text=text+temp+"\n"+"\r";			//storing the temp string in text by concating it with text and "\n" and "\r" is used to go to a newline.
			}
			
			System.out.print(text);   				//printing the whole string in console.
			reader.close();							//closing the file.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}