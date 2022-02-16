import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
  File file=new File("text.txt");
  try {
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String line;
	
	line=br.readLine();
	System.out.println(line);
} catch (FileNotFoundException e) {
System.out.println("file not found:"+file.toString());} catch (IOException e) {
System.out.println("unable to read file:"+file.toString());}
	}

}
