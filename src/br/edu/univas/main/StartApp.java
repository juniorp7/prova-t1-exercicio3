package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	
	public static void main(String[] args) {

		int numbers[] = new int[16];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Informe valor somente 0 e 1: ");
			numbers[i] = input.nextInt();
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 0)
				numbers[i] = 1;
			else
				numbers[i] = 0;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("conversão: " + numbers[i]);
		}
		input.close();
	}
}