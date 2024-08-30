class Q04 {
    public static void main(String[] args) {
        //Variaveis
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        double soma = sp + rj + mg + es + outros;

        double porcentagemSP, porcentagemRJ, porcentagemMG, porcentagemES, porcentagemOutros;

        System.out.println("Faturamento total: " + soma);

        porcentagemSP = calculoPorcentagem(sp, soma);
        porcentagemRJ = calculoPorcentagem(rj, soma);
        porcentagemMG = calculoPorcentagem(mg, soma);
        porcentagemES = calculoPorcentagem(es, soma);
        porcentagemOutros = calculoPorcentagem(outros, soma);

        System.out.printf("SP: %.2f%%\n", porcentagemSP);
        System.out.printf("RJ: %.2f%%\n", porcentagemRJ);
        System.out.printf("MG: %.2f%%\n", porcentagemMG);
        System.out.printf("ES: %.2f%%\n", porcentagemES);
        System.out.printf("Outros: %.2f%%\n", porcentagemOutros);
    }   
    
    public static double calculoPorcentagem(double faturamento, double soma){
        return  ((faturamento * 100) / soma);
    }
}
