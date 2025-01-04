package com.br.Ecep;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Consulta consulta = new Consulta();

        System.out.println("Digite um CEP");
        var cep = leitura.nextLine();

        try {
            Endereço novoEndereco = consulta.busca(cep);
            System.out.println(novoEndereco);
            Gerador gerador = new Gerador();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a Aplicação");
        }


    }
}
