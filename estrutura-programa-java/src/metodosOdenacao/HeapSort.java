package metodosOdenacao;

// Importa a classe Arrays da biblioteca java.util para usar o método toString para imprimir o array ordenado
import java.util.Arrays;

// Classe que implementa o algoritmo Heap Sort
public class HeapSort {
    // Método para ordenar o array usando Heap Sort
    public static void heapSort(int[] arr) {
        // Obtém o tamanho do array
        int n = arr.length;
        // Constroi um heap máximo
        // Inicia do último nó não folha e move-se para cima
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extrai os elementos um por um do heap
        for (int i = n - 1; i > 0; i--) {
            // Move a raiz (o maior elemento) para o final do array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Chama heapify no heap reduzido
            heapify(arr, i, 0);
        }
    }

    // Método para construir o heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Inicializa o maior como raiz
        int l = 2 * i + 1; // Índice do filho esquerdo
        int r = 2 * i + 2; // Índice do filho direito

        // Se o filho esquerdo é maior que a raiz
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Se o filho direito é maior que o maior até agora
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Se o maior não é a raiz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente heapify a subárvore afetada
            heapify(arr, n, largest);
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Array de exemplo
        int[] arr = {12, 11, 13, 5, 6, 7};
        // Chama o método heapSort para ordenar o array
        heapSort(arr);
        // Imprime o array ordenado
        System.out.println("Array ordenado usando Heap Sort:");
        System.out.println(Arrays.toString(arr));
    }
}

/*
O Heap Sort é um algoritmo de ordenação que utiliza uma estrutura de dados chamada "heap" para ordenar os elementos de uma lista.
Um heap é uma árvore binária especial em que o valor de cada nó é maior que (ou menor que) os valores de seus filhos, dependendo se é um "max heap" ou "min heap".
No Heap Sort, primeiro construímos um heap máximo a partir dos elementos do array não ordenado.
Em seguida, removemos o elemento máximo (ou mínimo) do heap e o colocamos no final do array ordenado.
Repetimos esse processo até que todos os elementos estejam no array ordenado.

Método heapSort(int[] arr):

Recebe como parâmetro um array de inteiros arr.
Obtém o tamanho do array.
Constroi um heap máximo a partir do array, começando pelo último nó não folha e movendo-se para cima.
Extrai os elementos do heap um por um, movendo o elemento máximo para o final do array ordenado.
Repita esse processo até que todos os elementos estejam no array ordenado.


Método heapify(int[] arr, int n, int i):

Recebe como parâmetros um array de inteiros arr, o tamanho do heap n e um índice i.
Identifica o maior elemento entre o nó atual e seus filhos.
Se o maior não é o nó atual, troca-o com o maior filho e chama recursivamente heapify na subárvore afetada.

Método main(String[] args):

Cria um array de inteiros não ordenado.
Chama o método heapSort para ordenar o array.
Imprime o array ordenado na saída padrão.




*/
