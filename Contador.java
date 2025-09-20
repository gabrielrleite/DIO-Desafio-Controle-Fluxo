import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        int parametroUm, parametroDois;
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
        while(true) {
            if (terminal.hasNextInt()) {
                parametroUm = terminal.nextInt();
                break;
            }
            System.out.println("Valor inválido. Utilize somente *Números*");
            terminal.next();
        }
		System.out.println("Digite o segundo parâmetro");
        while(true) {
            if (terminal.hasNextInt()) {
                parametroDois = terminal.nextInt();
                break;
            }
            System.out.println("Valor inválido. Utilize somente *Números*");
            terminal.next();
        }
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
        if(contagem <= 0) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            for(int i = 1; i<=contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
	}
}