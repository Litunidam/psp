package introduccionHilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader extends Thread{
	
	private File f;
	private FileReader fr;
	private BufferedReader br;
	
	public Reader(String path) throws FileNotFoundException {
		
		f = new File(path);
		fr = new FileReader(f);
		br = new BufferedReader(fr);
		
	}
	
	@Override
	public void run() {
		
		try {
			this.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void read() throws IOException {
		String line;
		System.out.println("Lectura del archivo:");
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
		fr.close();
		
	}
}
