package dao;

import com.example.appfisher.CadastroICMS;


public class ICMSDAO {

    public boolean save(CadastroICMS icms){
        System.out.println("Operação realizada com sucesso! " + icms.getEstadoOrigem());
        return true;
    }
}
