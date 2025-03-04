package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.TipoIphone;

public class Client {
	
	public static void main(String[] args) {
		TipoIphone.IPHONE_X.getIphone().fabricar();
		System.out.println("### Ordering an iPhone X");
		
		System.out.println("\n\n### Ordering an iPhone 11 Pro");
		TipoIphone.IPHONE_ONZE_PRO.getIphone().fabricar();
	}
}
