package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Collection_Set_ex04{

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num;
		
		List<Integer> numeros = new ArrayList<Integer>();	
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		if (numeros.contains(num)) { // .contains procura o número na lista
			
			System.out.println("\nO número "+num+" foi encontrado!");
		} else {
			System.out.println("\nO número "+num+" não foi encontrado!");
		}
	}
}