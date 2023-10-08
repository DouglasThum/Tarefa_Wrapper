package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: ");
		int valorPrimitivo = input.nextInt();
		System.out.println("Variável tipo primitivo: " + valorPrimitivo);
		
		Integer valorWrapper = valorPrimitivo;
		System.out.println("Variável tipo Wrapper: " + valorWrapper);
		
		input.close();
	}

}
