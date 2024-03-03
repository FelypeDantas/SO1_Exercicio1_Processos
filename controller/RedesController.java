package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {

	public RedesController() {
		super();
	}
	
	//operação irá mostrar o SO em execução
	private String os() {
		String os = System.getProperty("os.name");
		String arch = System.getProperty("os.arch");
		String version = System.getProperty("os.version");
		return os + " - v. " + version + " - arch. " + arch;
	}
	
	public void config(String process) {
		try {
			
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
			if(os().contains("100")) {
				StringBuffer nbuffer = new StringBuffer();
				nbuffer.append("cmd /c");
				nbuffer.append(" ");
				nbuffer.append(process);
				try {
					
					Runtime.getRuntime().exec(nbuffer.toString());
					
				}catch(IOException e1) {
					
					e1.printStackTrace();
					
				}
			}
			
		}
	}
	
	public void readProcess(String process) {
		try {
			
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
			System.out.println(os());
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
			if(os().contains("10")) {
				StringBuffer nbuffer = new StringBuffer();
				nbuffer.append("cmd /c");
				nbuffer.append(" ");
				nbuffer.append(process);
				try {
					
					Runtime.getRuntime().exec(nbuffer.toString());
					
				}catch(IOException e1) {
					
					e.printStackTrace();
					
				}
			}
			
		}
	}
	

}
