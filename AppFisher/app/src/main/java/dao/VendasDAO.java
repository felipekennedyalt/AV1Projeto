package dao;

import com.example.appfisher.CadastroVendas;

public class VendasDAO {

    public boolean save(CadastroVendas vendas){
        System.out.println("Operação realizada com sucesso! " + vendas.getValorVenda());
        return true;
    }
}
