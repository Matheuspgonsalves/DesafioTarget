class Q01 {
    public static void main(String[] args) {
        //Variaveis
        int indice = 13, soma = 0, k = 0;

        /*
         * Estrutura de repeticao que executa as operacoes k = k + 1; e soma = soma + k;
         * A condicao é atingida quando k = indice
         * Nesse momento a estrutura será interrompida 
         */
        while(k < indice){
            k++;
            soma += k; 
        }

        //Classe de saída utilizada
        System.out.println(soma);
    }
}