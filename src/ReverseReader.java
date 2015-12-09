import java.io.*;

public class ReverseReader implements ProcessFile {
	private String fileName;
	
	private File files;

	public ReverseReader(String name) {
		fileName = name;
		files = new File(fileName); 
	}
	
	//public String reverseDisplay() throws IOException {
	//	String reverse[];
	//	String content = this.readFile();
	//	
	//	int i, len = content.length();
	//	int j = 0;
		//String reverse = "Ok";

	 //   for (i = len; i >= 0; i--){
	 //   	reverse[j] = content.charAt(i).ToString();
	 //   	System.out.println(content.charAt(i));
	 //   	j++;
	 //   }

	  //  return content;
	//}
	
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
		
		try {
            int c;
            char car=0;
            FileReader ipsr = new FileReader(this.files);
            BufferedReader br = new BufferedReader(ipsr);
            StringBuffer ligne = new StringBuffer();
            while((c = br.read()) != -1){
            	car = (char) br.read();
            	System.out.println(car);
                c = c + 1;
                ligne.append(car);
            }           
            br.close();
        }          
        catch (Exception e){
            System.out.println(e.toString());
        }
	}

}
