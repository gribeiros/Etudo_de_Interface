package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import model.servive.IpvaBrasil;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Marca do carro:");
			String marca = sc.next();
			System.out.print("Valor do carro:");
			Double preco = sc.nextDouble();
			System.out.print("Porcentagem do ipva:");
			Double p = sc.nextDouble();
			p /= 100;

			Carro car = new Carro(marca, preco,p,new IpvaBrasil());
			
			System.out.println("\n"+car);
			
		}

		finally {
			sc.close();
		}
	}
}