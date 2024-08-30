public class Q05 {
    public static void main(String[] args) {
        //Variaveis
        String str;

        //Leitura do teclado
        str = MyIO.readLine();

        //Funcao que vaai inverter a string e mostrar a saida na tela
        inverteString(str);
    }

    public static void inverteString(String str){
        int tamStr = str.length() - 1;
        char[] vetorString = new char[tamStr + 1];
        char aux;

        //Colocando a string em umm vetor de char, pois a string em Java eh imutável
        for(int i = 0; i <= tamStr; i++) {
            vetorString[i] += str.charAt(i);
        }

        //Invertendo a string
        for(int i = 0; i <= tamStr / 2; i++){
            aux = vetorString[i];
            vetorString[i] = vetorString[tamStr - i];
            vetorString[tamStr - i] = aux;
        }

        System.out.println(vetorString);
    }
}
