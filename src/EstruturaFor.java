import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		//Comando para ler dados do teclado
		Scanner sc = new Scanner(System.in);
		
		//Estrutura de laço for
		
		int N = sc.nextInt(); 
		
		int soma = 0;
		for(int i = 0; i < N; i++) {
		int x = sc.nextInt();
		soma = soma + x;
		
		}
		System.out.println(soma);
		
		sc.close();
	}

}
