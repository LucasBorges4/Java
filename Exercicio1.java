import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento no formato dd mm aaaa\n");
        int dia_nasc = entrada.nextInt(), mes_nasc = entrada.nextInt(), ano_nasc = entrada.nextInt();
        System.out.print("Digite a data de hoje no formato dd mm aaaa\n");
        int dia_hoje = entrada.nextInt(), mes_hoje = entrada.nextInt(), ano_hoje = entrada.nextInt();
        int dias = calcula_Dias(dia_nasc, mes_nasc, ano_nasc, dia_hoje, mes_hoje, ano_hoje);
        System.out.println("O numero de dias vividos é: "+ dias);

    }

    public static int calcula_Dias(int dia_nasc, int mes_nasc, int ano_nasc, int dia_hoje, int mes_hoje, int ano_hoje){
        int dias = 0;
        dias += (dia_hoje - dia_nasc);
        dias += (30* (mes_hoje - mes_nasc));
        dias += (365* (ano_hoje - ano_nasc));
        
        return dias;
    }

}