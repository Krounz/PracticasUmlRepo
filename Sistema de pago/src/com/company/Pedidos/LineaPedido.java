package com.company.Pedidos;
import com.company.Productos.Producto;
import java.util.List;

public class LineaPedido {
    List<Producto> producto;

    public LineaPedido(){
    }
    public addProducto(Producto producto){
        List<Producto> this.producto = (List<Producto>) new Producto();
    }
}
