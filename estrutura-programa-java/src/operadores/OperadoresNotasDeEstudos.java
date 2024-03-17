package operadores;
/* Usando esses códigos apenas para revisões e aprendizagem */

public class OperadoresNotasDeEstudos {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 10, b = 5;
        System.out.println("Operadores Aritméticos:");
        System.out.println("Soma: " + (a + b));        // Adição
        System.out.println("Subtração: " + (a - b));   // Subtração
        System.out.println("Multiplicação: " + (a * b));  // Multiplicação
        System.out.println("Divisão: " + (a / b));    // Divisão
        System.out.println("Resto da Divisão: " + (a % b));  // Resto da divisão
        
        // Operadores de Atribuição
        int c = 10;
        c += 5; // Equivalente a c = c + 5;
        System.out.println("\nOperadores de Atribuição:");
        System.out.println("Valor de c após c += 5: " + c); // Atribuição e operação de adição
        
        // Operadores Relacionais
        System.out.println("\nOperadores Relacionais:");
        System.out.println("a == b: " + (a == b));  // Igualdade
        System.out.println("a != b: " + (a != b));  // Diferença
        System.out.println("a > b: " + (a > b));    // Maior que
        System.out.println("a < b: " + (a < b));    // Menor que
        System.out.println("a >= b: " + (a >= b));  // Maior ou igual a
        System.out.println("a <= b: " + (a <= b));  // Menor ou igual a
        
        // Operadores Lógicos
        boolean x = true, y = false;
        System.out.println("\nOperadores Lógicos:");
        System.out.println("x && y: " + (x && y));  // E lógico
        System.out.println("x || y: " + (x || y));  // OU lógico
        System.out.println("!x: " + (!x));          // Negação lógica
        
        // Operadores Bitwise
        int m = 5, n = 3;
        System.out.println("\nOperadores Bitwise:");
        System.out.println("m & n: " + (m & n));    // AND bitwise
        System.out.println("m | n: " + (m | n));    // OR bitwise
        System.out.println("m ^ n: " + (m ^ n));    // XOR bitwise
        System.out.println("~m: " + (~m));          // Complemento bitwise
        
        // Operadores de Deslocamento
        int p = 10;
        System.out.println("\nOperadores de Deslocamento:");
        System.out.println("p << 2: " + (p << 2));  // Deslocamento para a esquerda
        System.out.println("p >> 2: " + (p >> 2));  // Deslocamento para a direita com sinal
        System.out.println("p >>> 2: " + (p >>> 2));// Deslocamento para a direita sem sinal
    }
}
