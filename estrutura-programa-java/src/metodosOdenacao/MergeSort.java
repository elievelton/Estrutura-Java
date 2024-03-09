package metodosOdenacao;

// Import para ajudar a manipular array
import java.util.Arrays;

// Definição da classe MergeSort
public class MergeSort {
    /*
    O Merge Sort é um algoritmo de ordenação que divide o array em duas metades, 
    recursivamente ordena cada metade e depois mescla as duas metades ordenadas para produzir um único array ordenado.
    */

    /*
    Método para ordenar o array usando Merge Sort
    Recebe como parâmetros um array de inteiros arr, o índice do primeiro elemento l e o índice do último elemento r.
    */
    public static void mergeSort(int[] arr, int l, int r) {
        // Verifica se há mais de um elemento no array
        if (l < r) {
            int m = (l + r) / 2; // Encontra o ponto médio do array
            mergeSort(arr, l, m); // Ordena a metade esquerda do array recursivamente
            mergeSort(arr, m + 1, r); // Ordena a metade direita do array recursivamente
            merge(arr, l, m, r); // Une as duas metades ordenadas
        }
    }

    /*
    Método para unir duas metades ordenadas do array
    Recebe como parâmetros um array de inteiros arr, os índices do primeiro elemento l, do último elemento m da primeira metade e do último elemento r da segunda metade.
    */
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1; // Tamanho do array temporário para a primeira metade
        int n2 = r - m; // Tamanho do array temporário para a segunda metade

        // Cria arrays temporários para armazenar as duas metades
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia os elementos para os arrays temporários
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Une os arrays temporários de volta no array original
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de L, se houver algum
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de R, se houver algum
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Método principal
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7}; // Array de exemplo
        mergeSort(arr, 0, arr.length - 1); // Chama o método de ordenação Merge Sort
        System.out.println("Array ordenado usando Merge Sort:");
        System.out.println(Arrays.toString(arr)); // Imprime o array ordenado
    }
}
