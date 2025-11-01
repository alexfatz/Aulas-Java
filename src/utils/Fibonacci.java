package utils;


public class Fibonacci {
    public static int fibonacci(int numero) {
		int anterior = 0;
		int atual = 1;
		int prox;

        if (numero > 0){
            for (int i = 1; i <= numero; i++) {
                prox = anterior + atual;
                anterior = atual;
                atual = prox;
                
                if (numero == i){
                    System.out.println(atual);
                    return atual;
                }
            }
        } 

        else if (numero < 1) {
            while (true){
                System.out.println(atual);
                prox = anterior + atual;
                anterior = atual;
                atual = prox;
            }
        }

        return -1;
    }
}
