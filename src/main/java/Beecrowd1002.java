import java.util.Scanner;
public class Beecrowd1002 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        double raio, A;
        //ler variável raio
        raio = leitor.nextDouble();
        
        A = (double) (3.14159*raio*raio);
        //mostrar resultado no console
        System.out.printf("A=%.4f%n" , A);
    }
}
