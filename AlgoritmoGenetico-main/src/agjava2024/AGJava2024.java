package agjava2024;

public class AGJava2024 {

    public static void main(String[] args) {
        int populacao = 20;
        double capacidadePeso = 400;  // capacidade máxima de peso do avião
        double larguraMaxima = 300;   // largura máxima da área de carga do avião
        double alturaMaxima = 300;    // altura máxima da área de carga do avião
        double profundidadeMaxima = 400;  // profundidade máxima da área de carga do avião
        int probabilidadeMutacao = 5; // 5%
        int qtdeCruzamentos = 5;
        int numeroGeracoes = 10;

        AlgoritmoGenetico meuAg = new AlgoritmoGenetico(populacao, capacidadePeso, larguraMaxima, alturaMaxima, profundidadeMaxima, probabilidadeMutacao, qtdeCruzamentos, numeroGeracoes);
        meuAg.carregaArquivo("dados.csv");
        meuAg.executar();
    }
}
