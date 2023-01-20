package com.abdulloh;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("\n----- Konverter Bilangan Desimal ke Bilangan biner ----\n");

		int bilangan;
		String biner;
		Scanner userInput = new Scanner(System.in);

		System.out.print("Masukkan nilai bilangan : ");
		bilangan = userInput.nextInt();

		biner = String.format("%32s", Integer.toBinaryString(bilangan).replace(' ', '0'));

		System.out.printf("\nNilai binernya adalah %s\n", biner);
	}
}
