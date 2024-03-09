package metodosOdenacao;
import java.util.Arrays;

public class InsertionSort {
    /*
    O Insertion Sort é um algoritmo de ordenação que percorre a lista de elementos um por um e os insere no lugar correto na parte já ordenada da lista.
    Ele mantém uma parte do array classificada e, a cada iteração, insere um novo elemento na posição correta dessa parte classificada.
    */

    /*
    Método insertionSort(int[] arr):

    Recebe como parâmetro um array de inteiros arr.
    Obtém o tamanho do array.
    Percorre todos os elementos do array a partir do segundo elemento.
    Para cada elemento, compara-o com os elementos anteriores na parte ordenada do array e o insere no lugar correto.
    */
    public static void insertionSort(int[] arr) {
        int n = arr.length; // Obtém o tamanho do array

        for (int i = 1; i < n; i++) { // Percorre todos os elementos do array a partir do segundo elemento
            int key = arr[i]; // Armazena o valor do elemento atual
            int j = i - 1; // Inicializa o índice do elemento anterior

            // Move os elementos maiores que a chave para a frente do array
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Move o elemento para frente
                j = j - 1; // Move para o próximo elemento anterior
            }
            arr[j + 1] = key; // Insere a chave na posição correta
        }
    }

    /*
    Método main(String[] args):

    Cria um array de inteiros não ordenado.
    Chama o método insertionSort para ordenar o array.
    Imprime o array ordenado na saída padrão.
    */
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6}; // Array de exemplo
        insertionSort(arr); // Chama o método insertionSort para ordenar o array
        System.out.println("Array ordenado usando Insertion Sort:");
        System.out.println(Arrays.toString(arr)); // Imprime o array ordenado
    }
}
