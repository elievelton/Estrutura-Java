package metodosOdenacao; // Declaração do pacote

// Importa a classe Arrays da biblioteca java.util para usar o método toString para imprimir o array ordenado
import java.util.Arrays;

// Classe que implementa o algoritmo Quick Sort
public class QuickSort {
    /*
    O Quick Sort é um algoritmo de ordenação eficiente que divide o array em duas partes, de modo que os elementos menores que o pivô fiquem à esquerda e os elementos maiores que o pivô fiquem à direita.
    O pivô é escolhido e os elementos são rearranjados de forma que todos os elementos menores que o pivô estejam à esquerda e todos os elementos maiores que o pivô estejam à direita.
    */

    /*
    Método para ordenar o array usando Quick Sort
    Recebe como parâmetros um array de inteiros arr, o índice do primeiro elemento low e o índice do último elemento high.
    */
    public static void quickSort(int[] arr, int low, int high) {
        // Verifica se há mais de um elemento no array
        if (low < high) {
            // Encontra o índice do pivô após a partição
            int pi = partition(arr, low, high);

            // Ordena recursivamente os elementos antes e depois do pivô
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /*
    Método para particionar o array e retornar o índice do pivô
    Recebe como parâmetros um array de inteiros arr, o índice do primeiro elemento low e o índice do último elemento high.
    Retorna o índice do pivô após a partição.
    */
    public static int partition(int[] arr, int low, int high) {
        // Seleciona o elemento mais à direita como pivô
        int pivot = arr[high];
        // Inicializa o índice do elemento menor
        int i = (low - 1);
        // Percorre o array para encontrar elementos menores que o pivô
        for (int j = low; j < high; j++) {
            // Se o elemento atual for menor que o pivô
            if (arr[j] < pivot) {
                // Incrementa o índice do elemento menor
                i++;
                // Troca arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Troca arr[i + 1] e arr[high] (pivô)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Retorna o índice do pivô após a partição
        return i + 1;
    }

    // Método principal
    public static void main(String[] args) {
        // Array de exemplo
        int[] arr = {10, 7, 8, 9, 1, 5};
        // Obtém o tamanho do array
        int n = arr.length;
        // Chama o método quickSort para ordenar o array
        quickSort(arr, 0, n - 1);
        // Imprime o array ordenado
        System.out.println("Array ordenado usando Quick Sort:");
        System.out.println(Arrays.toString(arr));
    }
}
