package com.company.Tipo_Cliente;
import com.company.Cliente;
import com.company.Pagos.TargetaCredito;

public class ClientePersonal extends Cliente{
    TargetaCredito targetaCredito;

    public ClienteCorporativo(){
        TargetaCredito targetaCredito = new TargetaCredito();
    }
}
