package introduccionHilos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HilosFicheros extends Thread{

	private String path;
	
	public HilosFicheros(String str,String path) {
		super(str);
		this.path = path;
	}
	@Override
	public void run() {
		
		switch(Integer.parseInt(getName())) {
			case 1:
				File f = new File(this.path);
				String line;
			try {
				FileReader fs = new FileReader(f);
				BufferedReader br = new BufferedReader(fs);
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
				break;
			case 2:
				File filewrite = new File(this.path);
				Scanner s = new Scanner(System.in);
				String phrase;
			try {
				FileWriter fw = new FileWriter(filewrite);
				BufferedWriter bw = new BufferedWriter(fw);
				System.out.println("Introduzca la frase que quieres escribir: ");
				phrase = s.nextLine();
				bw.write(phrase);
			} catch (IOException e) {
				e.printStackTrace();
			}
				break;
		}
	}
}
