
package model;

import control.Fornecedor;
import java.util.ArrayList;
import view.FornecedorView;
import static view.FornecedorView.Modelo;

public class FornecedorWrite {
            public  static ArrayList<Fornecedor> produtos = new ArrayList<>();
            public  static Fornecedor itens = new Fornecedor(null);

            public static void salvar() {
                    atualizarDadosFornecedor();
                    atualizarModelo();
            }
                
            public static void atualizarDadosFornecedor(){
                Fornecedor fornecedor = FornecedorWrite.produtos.get(FornecedorView.index);
                String[] dadosFornecedor = Fornecedor.v;

                fornecedor.getDadosFornecedor().setNome(dadosFornecedor[0]);
                fornecedor.getDadosFornecedor().setCnpj(dadosFornecedor[1]);
                fornecedor.getDadosFornecedor().setEmail(dadosFornecedor[2]);
                fornecedor.getDadosFornecedor().setFone(dadosFornecedor[3]);
                fornecedor.getDadosFornecedor().setNumero(dadosFornecedor[4]);
                fornecedor.getDadosFornecedor().setDescricao(dadosFornecedor[5]);
                fornecedor.getDadosFornecedor().setFonec(dadosFornecedor[6]);
                fornecedor.getDadosFornecedor().setCep(dadosFornecedor[7]);
                fornecedor.getDadosFornecedor().setBairro(dadosFornecedor[8]);
                fornecedor.getDadosFornecedor().setEstado(dadosFornecedor[9]);
                fornecedor.getDadosFornecedor().setCidade(dadosFornecedor[10]);
                fornecedor.getDadosFornecedor().setRua(dadosFornecedor[11]);
                Fornecedor.id = fornecedor.getDadosFornecedor().getCnpj();
                
                itens.setNome(Fornecedor.v[0]);
                itens.setCnpj(Fornecedor.v[1]);
                itens.setEmail(Fornecedor.v[2]);
                itens.setFone(Fornecedor.v[3]);
                itens.setNumero(Fornecedor.v[4]);
                itens.setDescricao(Fornecedor.v[5]);
                itens.setFonec(Fornecedor.v[6]);
                itens.setCep(Fornecedor.v[7]);
                itens.setBairro(Fornecedor.v[8]);
                itens.setEstado(Fornecedor.v[9]);
                itens.setCidade(Fornecedor.v[10]);
                itens.setRua(Fornecedor.v[11]);

                FornecedorWrite.produtos.set(FornecedorView.index, itens);
    }

    private static void atualizarModelo() {
        Fornecedor fornecedor = FornecedorWrite.produtos.get(FornecedorView.index);
        Modelo.setValueAt(fornecedor, FornecedorView.index);
    }
}
