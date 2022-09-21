package pratica3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class questao1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        Stack <String> pilha = new Stack(); // Classe Pilha

        scanner = new Scanner(new File("D:\\Projetos\\ExemplosEstruturaDados\\ExemplosEstruturaDados-main\\ExemplosEstruturaDados-main\\pilha\\nomes.txt"));
        while (scanner.hasNextLine()) {
            pilha.push(scanner.nextLine());
        }
        System.out.println("Tamanho da Pilha " + pilha.size());    
       
       System.out.println("### Rotina a executar ###");
      
       Queue<String> q = new LinkedList<>();
       
         for (int i = 0; i < 10; i++){
             q.add(pilha.pop());             
         }
         
         System.out.println(" --- Lista 10 últimas mais buscadas --- ");
         
         q.forEach(System.out::println);
         
         System.out.println(" ");
         System.out.println("--- Desempilhando ---");
         System.out.println(" ");
         
        while (!pilha.empty()) {
            System.out.println(pilha.pop());
        }
 
    }
    
}
