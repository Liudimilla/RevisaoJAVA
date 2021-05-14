# RevisaoJAVA
Revisao
import java.util.Scanner;

public class LerDosNumeros {
//Crie uma classe  Java que leia dois numeros reais e exiba-os na ordem crescentes,(Classe Scanner)
	public static void main(String args[]) { 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1=ler.nextInt();
		
		System.out.println("Digite um numero: ");
		int num2=ler.nextInt();
		
		System.out.println();
		
		if(num1<num2) {
			System.out.println(num1 + " < " + num2);
		} else {
		System.out.println(num2 + " < " + num1);
	}
	}
}
