package app;
/**
 * A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
 */
import java.util.Scanner;
import ospedi.Ospedi;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        Ospedi[] rent = new Ospedi[10];
        
        System.out.print("How many rooms will be rented? ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("");
            System.out.println("Rent #" + i + ":");

            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            rent[room] = new Ospedi(nome, email);
        }

        System.out.println(" ");
        System.out.println("Busy Rooms:");
        for (int i = 0; i < 10; i++) {
            if (rent[i] != null) {
                System.out.println(i + ":" + rent[i]);
            }
            
        }

        sc.close();
    }
}
