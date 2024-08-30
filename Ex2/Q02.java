public class Q02 {
    public static void main(String[] args) {

        //Variaveis
        int primeiroTermo = 0, segundoTermo = 1, prox_termo = 0, in = 0;
        boolean ehSequencia = false;

        //Leitor de dados usando a classe MyIO. (Classe usada pela PUC Minas)
        MyIO.println("Digite o numero desejado:");
        in = MyIO.readInt(); //Leitura dos dados

        //Printando o primeiro termo 
        MyIO.print(primeiroTermo  + " ");

        while( prox_termo < in) {
            prox_termo = primeiroTermo + segundoTermo; 
            MyIO.print(prox_termo + " "); 

            segundoTermo = primeiroTermo;
            primeiroTermo = prox_termo;
            
            ehSequencia = prox_termo == in ? true : false;
        }

        MyIO.print("\n\n");
        
        MyIO.println(ehSequencia ? "O numero digitado FAZ parte da sequencia" : "O numero digitado NAO faz parte da sequencia");
    }    
}
