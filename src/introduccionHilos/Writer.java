package introduccionHilos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer extends Thread{
	
	private File f;
	private FileWriter fw;
	private BufferedWriter bw;
	
	public Writer(String path) throws IOException {
		
		this.f = new File(path);
		this.fw = new FileWriter(f,true);
		this.bw = new BufferedWriter(fw);
		
	}
	
	@Override
	public void run() {
		
		try {
			this.write();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void write() throws IOException {
		
		System.out.println("Introduce el texto a añadir: ");
		Scanner s = new Scanner(System.in);
		bw.write(s.nextLine());
		
		bw.close();
		fw.close();
		s.close();
		
	}
	
	
	
}
