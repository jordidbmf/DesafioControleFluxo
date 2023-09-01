import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        // int parametroUm = 12;
        // int parametroDois = 11;

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        else if(parametroUm == parametroDois){
            System.out.println("Os números são iguais, portanto não será impresso nenhum número.");
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
        
    }
}
