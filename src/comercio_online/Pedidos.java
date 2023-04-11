package comercio_online;

import java.util.Date;

public class Pedidos {

    int idPedido;
    Usuario usuario;
    Endereco endereco;
    FormaDePagamento formaDePagamento;
    CarrinhoDeCompra carrinhoDeCompra;
    Date dataEntrada;
    Date dataEmissao;
    double Desconto;
    double valorTotal;

    // void concluirPedido(idPedido, idUsuario, idCarrinhoDeCompra, idEndereco, idPagamento)
    //void cancelarPedido(idPedido) {}
    //void rastreioPedido(idPedido){}
    //void aplicarDesconto(int desconto){}
    void calcularFrete(){}
    void formaEnvio(){}
    void statusPedido(){}



}
