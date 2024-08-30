public class Q05 {
    public static void main(String[] args) {
        //Variaveis
        String str;

        str = MyIO.readLine();

        String newString = inverteString(str);
    }

    public static String inverteString(String str){
        int tamStr = str.length() - 1;
        char[] vetorString = new char[tamStr + 1];
        char aux;

        //Colocando a string em umm vetor de char, pois a string em Java eh imutável
        for(int i = 0; i <= tamStr; i++) {
            vetorString[i] += str.charAt(i);
        }

        for(int i = 0; i <= tamStr / 2; i++){
            aux = vetorString[i];
            vetorString[i] = vetorString[tamStr - i];
            vetorString[tamStr - i] = aux;
        }

        String newStr = "";

        for(int i = 0; i <= tamStr; i++){
            newStr += vetorString[i];
        }

        System.out.println(newStr);

        return newStr;
    }
}
