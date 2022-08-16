package entidades.services;

import entidades.Banco;
import entidades.Cliente;

public interface ServicoDeEmprestimos {
    double jurosPagos(Cliente c, Banco b);
    double dinheiroAplicadoPagamentoDivida(Cliente c, Banco b);
    double jurosAcumuladosPagos(Cliente c, Banco b);
    double valorAindaPorPagar(Cliente c, Banco b);
    double numeroDeMesesFaltantes(Cliente c, Banco b);
    double valorUltimaPrestacao(Cliente c, Banco b);

}
