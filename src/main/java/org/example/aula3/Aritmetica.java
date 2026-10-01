package org.example.aula3;

public class Aritmetica {
    static void main() {
        System.out.println("2+2=" +2+2);
        System.out.println("2+2= "+(2+2));
        // O primeiro realizada concatenação e no segundo, devido ao parêntese realiza primeiramente a soma.

        int a= 10;
        int b= 3;
        int resultadoSoma=a+b;
        int resultadoSubtracao=a-b;
        int resultadoMultiplicacao=a*b;
        int resultadoDivisao=a/b;
        int resultadoResto=a%b;
        System.out.println("a+b= " + resultadoSoma + "; a-b=" + resultadoSubtracao + "; a*b= " + resultadoMultiplicacao
                + "; a/b= " + resultadoDivisao + "; a%b= " +resultadoResto + ".");

        double A = 10.0;
        double B = 3.0;
        double resultado =A+B;
        double resultado2 =A-B;
        double resultado3 =A*B;
        double resultado4 =A/B;
        double resultado5 =A%B;
        System.out.println("a+b= " + resultado + "; a-b=" + resultado2 + "; a*b= " + resultado3 + "; a/b= " + resultado4
                + "; a%b= " +resultado5 + ".");

        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;
        int resultadoNota = nota1+nota2+nota3;
        int resultadomedia = (nota1+nota2+nota3)/3;
        System.out.println("A soma das notas:" + resultadoNota + ". Enquanto a média é:" + resultadomedia);

        int a1 = 3;
        int b2 = 4;
        int c3 = 5;
        System.out.println(a1+b2*c3);
        System.out.println((a1+b2)*c3);

        int segundos = 3785;
        int resultadoMinutos= segundos/60;
        System.out.println("minutos: " + segundos/60 + "; Segundos restantes: " + segundos%60);
    }
}
