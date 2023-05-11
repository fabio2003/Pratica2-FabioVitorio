/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Informa se número é ímpar ou par
* Data: 11/04/2023
*/

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.print("O número é par ");
        } else {
            System.out.print("O número é ímpar ");
        }
        
        if (numero >= 0) {
            System.out.print("e positivo.");
        } else {
            System.out.print("e negativo.");
        }
    }
}
