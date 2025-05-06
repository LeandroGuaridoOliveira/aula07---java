import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        testeTamanho pessoa1 = new testeTamanho("gabriel", 200, 1.50,18);

        testeTamanho pessoa2 = new testeTamanho("quaique", 20, 1.90,20);
        testeTamanho pessoa3 = new testeTamanho("leandro", 80, 1.80,21);


        if (pessoa2.getPeso() > pessoa1.getPeso()) {
            System.out.println("quaique e mais pesado que gabriel");
        } else {
            System.out.println("Gabriel e mais pesado q o quaique");
        }

        if(pessoa2.getAltura() > pessoa1.getAltura()){
            System.out.println("quaique e maior que gabriel");
        } else {
            System.out.println("gabriel e maior q quaique");
        }

    }
}