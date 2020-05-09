package dao;


import com.example.appfisher.CadastroPedido;

public class PedidoDAO {

    public boolean save(CadastroPedido pedido){
        System.out.println("Operação realizada com sucesso! " + pedido.getValorPedido());
        return true;
    }
}
