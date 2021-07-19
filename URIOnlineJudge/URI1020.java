/*Idade em Dias::Leia um valor inteiro correspondente à idade de uma
pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
Entrada
O arquivo de entrada contém um valor inteiro.
Saída
Imprima a saída conforme exemplo fornecido.

 */

package URIOnlineJudge;

import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qT = input.nextInt();



        int qAs = qT / 365;
        qT = qT % 365;

        int qM = qT / 30;
        qT = qT % 30;

        int qD = qT;

        System.out.printf("%d ano(s)\n", qAs);
        System.out.printf("%d mes(es)\n", qM);
        System.out.printf("%d dia(s)\n", qD);



    }
}
