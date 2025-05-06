import java.util.Scanner;

public class TesteEleitores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------Dados da primeira pessoa----------------------");

        System.out.println("Digite o nome da primeira pessoa");
        String nomePessoa1 = scanner.nextLine();

        System.out.println("Digite a idade da pessoa");
        int idadePesoa1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite a altura da primeira pessoa");
        double alturaPessoa1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso da primeira pessoa");
        double pesoPessoa1 = Double.parseDouble(scanner.nextLine());

        System.out.println("--------------Dados da segunda pessoa--------------");
        //pessoa2
        System.out.println("Digite o nome da segunda pessoa");
        String nomePessoa2 = scanner.nextLine();

        System.out.println("Digite a idade da segunda pessoa");
        int idadePesoa2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite a altura da segunda pessoa");
        double alturaPessoa2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso da segunda pessoa");
        double pesoPessoa2 = Double.parseDouble(scanner.nextLine());

        //pessoa 3
        System.out.println("--------------Dados da terceira pessoa--------------");

        System.out.println("Digite o nome da terceira pessoa");
        String nomePessoa3 = scanner.nextLine();

        System.out.println("Digite a idade da terceira pessoa");
        int idadePesoa3 = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite a altura da terceira pessoa");
        double alturaPessoa3 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso da terceira pessoa");
        double pesoPessoa3 = Double.parseDouble(scanner.nextLine());

        testeTamanho pessoa1 = new testeTamanho(nomePessoa1,pesoPessoa1,alturaPessoa1,idadePesoa1);
        testeTamanho pessoa2 = new testeTamanho(nomePessoa2,pesoPessoa2,alturaPessoa2,idadePesoa2);
        testeTamanho pessoa3 = new testeTamanho(nomePessoa3,pesoPessoa3,alturaPessoa3,idadePesoa3);

        if(pessoa1.getIdade() < 16){
            System.out.println(pessoa1.getIdade() + " não é eleitor");
        } else if ( pessoa1.getIdade() < 18 || pessoa1.getIdade() >=65) {
            System.out.println(pessoa1.getNome() + " é eleitor facultativo");
        } else {
            System.out.println(pessoa1.getNome() + " tem voto obrigatorio");
        }

        if(pessoa2.getIdade() < 16){
            System.out.println(pessoa2.getIdade() + " não é eleitor");
        } else if ( pessoa2.getIdade() < 18 || pessoa2.getIdade() >=65) {
            System.out.println(pessoa2.getNome() + " é eleitor facultativo");
        } else {
            System.out.println(pessoa2.getNome() + " tem voto obrigatorio");
        }


        if(pessoa3.getIdade() < 16){
            System.out.println(pessoa3.getIdade() + " não é eleitor");
        } else if ( pessoa3.getIdade() < 18 || pessoa3.getIdade() >=65) {
            System.out.println(pessoa3.getNome() + " é eleitor facultativo");
        } else {
            System.out.println(pessoa3.getNome() + " tem voto obrigatorio");
        }
    }
}
