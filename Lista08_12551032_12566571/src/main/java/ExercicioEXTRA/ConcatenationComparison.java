package ExercicioEXTRA;

public class ConcatenationComparison {

    public static void main(String[] args) {
        // Definindo o número de iterações
        int numIterations = 10000;

        // Concatenação usando a classe String
        long startTimeString = System.currentTimeMillis();
        String concatenatedString = "";
        for (int i = 0; i < numIterations; i++) {
            concatenatedString = concatenatedString.concat("String" + i);
        }
        long endTimeString = System.currentTimeMillis();
        long durationString = endTimeString - startTimeString;

        // Concatenação usando a classe StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numIterations; i++) {
            stringBuilder.append("String").append(i);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long durationStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        // Exibindo os resultados
        System.out.println("Tempo de concatenação usando String: " + durationString + " ms");
        System.out.println("Tempo de concatenação usando StringBuilder: " + durationStringBuilder + " ms");
    }
}


//A concatenação usando String é mais lenta devido à sua imutabilidade. Cada operação
// de concatenação cria uma nova instância de String, o que é menos eficiente em termos
// de desempenho. StringBuffer, por ser mutável, oferece uma concatenação mais eficiente,
// modificando diretamente o conteúdo da string sem criar novas instâncias.
