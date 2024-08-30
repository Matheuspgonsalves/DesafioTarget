import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Q03 {

    public static void main(String[] args) throws Exception {
        List<Double> faturamentos = new ArrayList<>();

        // Carregar o JSON do arquivo
        BufferedReader in = new BufferedReader(new FileReader("arquivo.json"));
        StringBuilder jsonBuilder = new StringBuilder();
        String linha;
        while ((linha = in.readLine()) != null) {
            jsonBuilder.append(linha.trim());
        }
        in.close();

        
        String jsonString = jsonBuilder.toString();
        jsonString = jsonString.replace("[", "").replace("]", "");  // Remove colchetes do array
        String[] entries = jsonString.split("\\},\\{");  // Separa cada objeto

        for (int i = 0; i < entries.length; i++) {
            String entry = entries[i];
            entry = entry.replace("{", "").replace("}", "");  // Remover chaves do objeto
            String[] keyValuePairs = entry.split(",");  // Separa as chaves e valores
            double valor = 0;
            boolean hasValor = false;

            for (int j = 0; j < keyValuePairs.length; j++) {
                String pair = keyValuePairs[j];
                String[] keyValue = pair.split(":");
                String key = keyValue[0].trim().replace("\"", ""); 
                String value = keyValue[1].trim();

                if (key.equals("valor")) {
                    valor = Double.parseDouble(value);
                    hasValor = true;
                }
            }

            // Se o valor nao for 0 adiciona ao faturamente
            if (hasValor && valor > 0) {
                faturamentos.add(valor);
            }
        }

        // Resposta para caso nao haja faturamento
        if (faturamentos.isEmpty()) {
            System.out.println("Não há dados de faturamento.");
            return;
        }

        // Encontra o menor e maior valor de faturamento
        double menorFaturamento = faturamentos.get(0);
        double maiorFaturamento = faturamentos.get(0);
        double somaFaturamento = 0;

        for (int i = 0; i < faturamentos.size(); i++) {
            double valor = faturamentos.get(i);
            if (valor < menorFaturamento) {
                menorFaturamento = valor;
            }
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }
            somaFaturamento += valor;
        }

        // Calculaa a média
        double mediaFaturamento = somaFaturamento / faturamentos.size();

        // Contaa os dias com faturamento superior à média
        int diasAcimaDaMedia = 0;
        for (int i = 0; i < faturamentos.size(); i++) {
            double valor = faturamentos.get(i);
            if (valor > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        // Exibir os resultados
        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
    }
}
