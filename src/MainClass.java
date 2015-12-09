public class MainClass {
	public static void main(String[] args) {		
		String name = "C:\\Users\\licence.PW18\\Desktop\\file.txt";
		//FilesReader fileReader = new FilesReader(name);
		ReverseReader reverseFile = new ReverseReader(name);
		
		//System.out.println(fileReader.getFileName());
		//fileReader.readFile();
		reverseFile.readFile();
		
		//FileInputStream in = null;
		
		//File f = new File("C:\\Users\\licence.PW18\\Desktop\\file.txt");
		//try {
			//in = new FileInputStream(f);
			//System.out.println(f.getName());
			
			//InputStream flux = in; 
			//InputStreamReader read = new InputStreamReader(flux);
			//BufferedReader buff = new BufferedReader(read);
			//String ligne;
			//while ((ligne = buff.readLine()) != null){
			//	System.out.println(ligne);
			//}
			//buff.close(); 
			
		//}
		//finally {
		//	if(in != null )
		//		in.close();
		//}
	}
}

