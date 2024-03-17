package io;
/* Entrada e Saída (I/O) de dados Java */

import java.util.Scanner;

public class ioNotasEstudos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorDigitado = scanner.nextInt();
    
        System.out.println(valorDigitado);
        scanner.close();
    }
}


