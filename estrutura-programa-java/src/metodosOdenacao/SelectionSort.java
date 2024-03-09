package metodosOdenacao; // Declaração do pacote

// Classe que implementa o algoritmo Selection Sort
public class SelectionSort {
    /*
    O Selection Sort é um algoritmo de ordenação que divide o array em duas partes: uma parte ordenada e outra parte não ordenada.
    Ele encontra o menor elemento da parte não ordenada e o coloca no início da parte ordenada, repetindo esse processo até que toda a lista esteja ordenada.
    */

    // Método para ordenar o array usando Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Obtém o tamanho do array

        // Loop para percorrer todos os elementos do array, exceto o último
        for (int i = 0; i < n-1; i++) {
            int minIndex = i; // Define o índice do elemento mínimo como o índice atual

            // Loop para percorrer os elementos restantes do array
            for (int j = i+1; j < n; j++) {
                // Verifica se o elemento atual é menor que o mínimo
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Atualiza o índice do elemento mínimo
                }
            }

            // Troca o elemento mínimo com o primeiro elemento não ordenado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Método principal
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 78, 101, 786}; // Array de exemplo
        selectionSort(arr); // Chama o método de ordenação
        // Imprime o array ordenado
        System.out.println("Array ordenado usando Selection Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
