package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Collection_list_ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//criar arraylist
		ArrayList<String> cores = new ArrayList<String>();
		
		for( int i = 0 ; i< 5 ; i++) {
			System.out.println("Digite a cor número " +(i+1)+":");
			String cor = leia.nextLine();
			//string cor=leia.nextLine();
			cores.add(cor);
		}
		
		Iterator<String> iterator = cores.iterator();
		
		//listando cores
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//listando as cores em ordem alfabetica
		Collections.sort(cores);
		System.out.println("Cores ordenadas: ");
		System.out.println(""+cores);
		
		
		
	}

}
