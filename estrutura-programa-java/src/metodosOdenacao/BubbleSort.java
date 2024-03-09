package metodosOdenacao;
/*
O Bubble Sort é um algoritmo de ordenação simples que funciona comparando cada elemento da lista com o próximo elemento, e trocando-os se estiverem na ordem errada.
Esse processo é repetido várias vezes até que a lista esteja ordenada.
*/

/*
Método bubbleSort(int[] arr):

Recebe como parâmetro um array de inteiros arr.
Obtém o tamanho do array.
Inicia um loop externo para percorrer todos os elementos do array, exceto o último.
Dentro desse loop, inicia um loop interno para percorrer os elementos restantes do array.
Compara o elemento atual com o próximo elemento.
Se o elemento atual for maior que o próximo elemento, troca os dois elementos de posição.
Repete esse processo até que todos os elementos estejam em sua posição correta.
*/

/*
Método main(String[] args):

Cria um array de inteiros não ordenado.
Chama o método bubbleSort para ordenar o array.
Imprime o array ordenado na saída padrão.
*/
public class BubbleSort {
    // Método para ordenar o array usando Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Obtém o tamanho do array
        // Loop para percorrer todos os elementos do array
        for (int i = 0; i < n-1; i++) {
            // Loop para percorrer os elementos restantes do array
            for (int j = 0; j < n-i-1; j++) {
                // Verifica se o elemento atual é maior que o próximo
                if (arr[j] > arr[j+1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
//Chamada do main 
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 200, 1, 8, 1908};
        bubbleSort(arr); // Chama o método de ordenação
        // Imprime o array ordenado
        System.out.println("Array ordenado usando Bubble Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
