package com.br.Ecep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Gerador {
    public void salvaJson(Endereço endereço) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(endereço.cep() + ".json");
        escrita.write(gson.toJson(endereço));
        escrita.close();
    }
}
