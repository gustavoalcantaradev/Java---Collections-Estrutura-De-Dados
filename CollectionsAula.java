package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsAula {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);
		minhaLista.add(4);
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(7);
		minhaLista.add(5);
		
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("Removendo um elemento da lista..");
		System.out.println("");
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		//
		int primeiroElemento = minhaLista.get(0);
		System.out.println("O primeiro elemento da lista é: "+primeiroElemento);
		System.out.println("");
		
		for (int i = 0 ; i <minhaLista.size(); i++) {
			System.out.println("Elemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		System.out.println("Depois de ordenado...");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(5);
		meuSet.add(9);
		meuSet.add(3);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
		
	}

}
