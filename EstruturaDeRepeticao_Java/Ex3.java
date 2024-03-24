/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        while (true) {
            System.out.println("Nome: ");
            nome = sc.nextLine();
            if (nome == null || nome.length() < 3) {
                System.out.println("Erro: Nome deve ser maior que 3 caracteres.");
            } else {
                break;
            }
        }
        int idade;
        while (true) {
            System.out.println("Idade: ");
            idade = sc.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Erro: Idade deve estar entre 0 e 150.");
            } else {
                break;
            }
        }
        int salario;
        while (true) {
            System.out.println("Salário: ");
            salario = sc.nextInt();
            if (salario < 0) {
                System.out.println("Erro: Salário deve ser maior que 0.");
            } else {
                break;
            }
        }
        String sexo;
        while (true) {
            System.out.println("Sexo: ");
            sexo = sc.nextLine();
            if (sexo.equals("M") || sexo.equals("F")) {
                break;
            } else {
                System.out.println("Erro: Sexo deve ser 'M' ou 'F'.");
            }
        }
        String estadoCivil;
        while (true) {
            System.out.println("Estado Civil: ");
            estadoCivil = sc.nextLine();
            if (!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil.equals("V") && !estadoCivil.equals("D")) {
                System.out.println("Erro: Estado Civil deve ser 'S', 'C', 'V' ou 'D'.");
            } else {
                break;
            }
        }
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

    }
}