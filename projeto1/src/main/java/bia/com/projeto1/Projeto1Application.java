package bia.com.projeto1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Projeto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto1Application.class, args);

		Scanner sc = new Scanner(System.in);
		 // Cria um array de objetos Rent com capacidade para 10 elementos
		Rent[] rooms = new Rent[10];

		 // Solicita ao usuário o número de quartos que serão alocados
		System.out.print("Quantos quartos serão alocados: ");
		int n = sc.nextInt();

		// Loop para alocar os quartos especificados pelo usuário
		for (int i = 0; i < n; i++) {
			System.out.println();
			 // Imprime o número do aluguel
			System.out.println("Rent #" + (i+1) + ":");
			 // Solicita e lê o nome do locatário
			System.out.print("Name: ");
			sc.nextLine();  // Consome a quebra de linha pendente
			String name = sc.nextLine();
			// Solicita e lê o email do locatário
			System.out.print("Email: ");
			String email = sc.nextLine();
			 // Solicita e lê o número do quarto a ser alocado
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();
			// Cria um objeto Rent com o nome e email fornecidos
			Rent rent = new Rent(name, email);
			 // Aloca o objeto Rent no índice do array de acordo com o número do quarto
			rooms[roomNumber] = rent;

		}
		System.out.println();
		System.out.println("Quartos Ocupados: ");
		// Loop para imprimir os quartos ocupados
		for(int i = 0; i<10; i++){
			// Verifica se há um objeto Rent no índice atual
			if(rooms[i] != null){
				 // Imprime o número do quarto e os detalhes do aluguel
				System.out.println(i + ": " + rooms[i]);
			}
		}

		sc.close();

	}

}
