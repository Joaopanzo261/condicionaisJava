package beecrowdExercicios;

import java.util.Scanner;

public class DDD {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

        int ddd;
        
        System.out.println("Digite o DDD da sua região: ");
        ddd = leia.nextInt();

        if (ddd == 11) {
            System.out.println("Pelo DDD a sua cidade é São Paulo");
            
        } else if (ddd == 85) {
            System.out.println("Pelo DDD a sua cidade é Fortaleza");
        } else if (ddd == 27) {
            System.out.println("Pelo DDD a sua cidade é Vitoria");
        } else if (ddd == 95) {
            System.out.println("Pelo DDD a sua cidade é Roraima");
        } else if (ddd == 63) {
            System.out.println("Pelo DDD a sua cidade é Tocantis");
        } else if (ddd == 96) {
            System.out.println("Pelo DDD a sua cidade é Amapá");
        } else if (ddd == 71) {
            System.out.println("Pelo DDD a sua cidade é Salvador");
        } else if (ddd == 21) {
            System.out.println("Pelo DDD a sua cidade é Rio de Janeiro");
        } else {
            System.out.println("DDD nao cadastrado");
        }

	}

}
