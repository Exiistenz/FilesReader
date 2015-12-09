import java.io.*;

public class FilesReader implements ProcessFile {
	private String fileName;
	
	private File files;
	
	public FilesReader(String name) {
		fileName = name;
		files = new File(fileName); 
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public void readFile() {
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(this.files);
		}
		catch (FileNotFoundException e){	
		}

		try {
			InputStream flux = in; 
			InputStreamReader read = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(read);
			String ligne;
			while ((ligne = buff.readLine()) != null){
				System.out.println(ligne);			
			}
			buff.close(); 		
		}
		catch(IOException e) {		
		}
	}
}

