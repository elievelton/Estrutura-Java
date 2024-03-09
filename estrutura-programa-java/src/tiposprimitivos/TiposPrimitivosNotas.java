package tiposprimitivos;

// Notas de estudos sobre os tipos primitivos do Java
public class TiposPrimitivosNotas {
    public static void main(String[] args) {
        char primeiraLetradoNome = 'E';
        char primeiraLetradoNomeASCII = 69;
        System.out.println(primeiraLetradoNome);
        System.out.println(primeiraLetradoNomeASCII);

        // Inteiros ou Integers
        byte nota = 10; // -128 até 127
        short itensComprados = 2; // -32768 até 32767
        int quatidadeEstoque = 23_366; // -2_147_483_648 até 2_147_483_647
        long numeroMuitoGrande = 47647862378462378L; // 19 dígitos

        // Tipos Decimais
        float peso = 1.5f; // 6 - 7 casas decimais
        double preco = 24.99; // ~ 15 casas decimais

        // Booleanos ou Booleans
        boolean verdadeiro = true;
        boolean falso = false;
    }
}
