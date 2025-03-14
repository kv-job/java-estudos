package exercicios_java;

import java.util.Scanner;

public class ContaBanco {
		public static void main(String[] args) {
				
				int conta;
				String agencia, nomeCliente, saldo; 
				
			
				Scanner sca = new Scanner(System.in);
				
				System.out.println("Olá, digite o seu Nome e Sobrenome: ");
				nomeCliente = sca.nextLine(); //Entrada nome
				
				System.out.println("Por favor, digite o numero de sua Agencia: ");
				agencia = sca.nextLine(); //Entrada da agencia
				
				System.out.println("Por favor, digite o numero de sua Conta: ");
				conta = Integer.parseInt(sca.nextLine()); //Entrada da Conta - número da conta é um inteiro
				
				System.out.println("Qual o valor do depósito que você deseja fazer: ");
				 saldo = sca.nextLine(); //leitura da saldo
				
				
				//Mensagem formatada conforme anúncio
				System.out.println("\nOlá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
						" conta " + conta + " e o seu saldo " + saldo + " já está dispónivel para saque.\n") ;
				
				sca.close();
				
			}

	}

