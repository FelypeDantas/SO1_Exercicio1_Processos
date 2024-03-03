package view;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redes = new RedesController();
		
		String process = "PING -4 -n 10 www.google.com.br";
		
		redes.readProcess(process);
		
		String ip = "IPCONFIG";
		redes.config(ip);

	}

}
