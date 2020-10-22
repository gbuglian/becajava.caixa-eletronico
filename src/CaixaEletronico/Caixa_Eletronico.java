package CaixaEletronico;
import java.util.Scanner;

public class Caixa_Eletronico {

	public static void main(String[] args) {

        int[] notas = {200,100,50,20,10,5,2,1};
        int[] quantidade = {0,0,0,0,0,0,0,0}
        int cont;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor a ser sacado, valor minimo 2R$: ");
        int valor = entrada.nextInt();

        int index = 0;
        while(valor > 0) {
        	if(valor >= notas[index]) {
        		quantidade[index] += 1;
        		valor -= notas[index];
        	} else {
        		index += 1;
        	}
        }
        for (int i = 0; i < notas.length; i++) {
        	if (quantidade[i]) {
        		System.out.println("Quantidade de notas de R$" + notas[i] + ": " + quantidade[i]);
        	}
        }

    }