package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Collection_Queue_ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int op;
		
		do {
			//criando o menu
			System.out.println("----------------------------------------------------");
			System.out.println("\t1 - Adicionar clientes");
			System.out.println("\t2 - Listar todos os clientes da fila");
			System.out.println("\t3 - retirar clientes da clientes");
			System.out.println("\t4 - sair");
			System.out.println("----------------------------------------------------");
			System.out.println("Entre com a opção desejada: ");
			op=leia.nextInt();
			
			//trabalhando com as opçoes
			switch(op ) {
			case 1:
				leia.nextLine();//limpa o cash
				System.out.println("Digite o seu nome: ");
				String nome =leia.nextLine();
				if(nome.isEmpty()) { //verifica se tem algo digitado
					System.out.println("O nome não foi adicionado na fila");
				} else {		
				fila.add(nome);//adiciona noma na fila
				System.out.println("Cliente adicionado");
				}
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("Lista de clientes da fila..");
				//imprimindo lista clientes
				for(Iterator<String> it = fila.iterator();it.hasNext();) {
					System.out.println(it.next());
				}
				break;
				
			case 3:
				leia.nextLine();
				//verificando se a fila esta vazia
				if(fila.isEmpty() == true) {
					System.out.println("A fila está vazia");
				} else {
					System.out.printf("O (a) cliente %s foi chamdo(a)!", fila.poll());
					System.out.println("Fila: \n");
					//imprimindo a fila usando iterator local
					for(Iterator<String> it = fila.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println();
				}
				break;
				
			case 0:
				System.out.println("Programa finalizado");
				break;
				
				default:
					System.out.println("Opção invalida!");
			}
			
			
				
		} while (op !=0);
	}

}
