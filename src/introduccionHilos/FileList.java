package introduccionHilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileList extends Thread{

	static File f;
	static int lines=0;
	static int words=0;
	static int chars=0;
	
	public FileList(){
		
	}
	
	
	@Override
	public void run() {
		
		try {
			allCount();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Lineas: "+lines);
		System.out.println("Palabras: "+words);
		System.out.println("Caracteres: "+chars);
		
	}
	
	public static synchronized void allCount() throws IOException {

		int auxlines=0;
		int auxwords=0;
		int auxchars=0;
		
		FileReader fr;
		String line;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				lines++;
				auxlines++;
				chars+=line.length();
				auxchars+=line.length();
				for (int i = 0; i < line.length(); i++) {
					if (i == 0) {
						if (line.charAt(i) != ' ')
							words++;
							auxwords++;
					} else {
						if (line.charAt(i - 1) == ' ')
							if (line.charAt(i) != ' ')
								words++;
								auxwords++;
						
					}
				}
			}
			System.out.println("Palabras del archivo: "+auxwords);
			System.out.println("Lineas del archivo: "+auxlines);
			System.out.println("Caracteres del archivo: "+auxchars);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		for (String x:args) {
			
			f = new File(x);
			
			new FileList().start();
			
			
		}
		
		
	}

}
