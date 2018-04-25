package com.company.Vendedores;

import com.company.Cliente;
import com.company.Tipo_Cliente.ClienteCorporativo;

import java.util.List;

public class Vendedor {
    List<ClienteCorporativo> clienteCorporativos;
    public Vendedor(){

    }
    public addClienteCorporativo(ClienteCorporativo clienteCorporativo){
        List<Cliente> this.clienteCorporativos = clienteCorporativo;
    }
}
