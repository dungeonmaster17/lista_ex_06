package entidades.services;

import entidades.Banco;
import entidades.Cliente;

public class ServicoDeCalculo implements ServicoDeEmprestimos{

    @Override
    public double jurosPagos(Cliente c, Banco b) {
        double jurosMensal = (c.getValorEmprestimo() / c.getQtdeDeParcelas()) * b.getJuros();
        return jurosMensal * c.getQtdeDeParcelas();
    }

    @Override
    public double dinheiroAplicadoPagamentoDivida(Cliente c, Banco b) {
        return 0;
    }

    @Override
    public double jurosAcumuladosPagos(Cliente c, Banco b) {
        return 0;
    }

    @Override
    public double valorAindaPorPagar(Cliente c, Banco b) {
        return 0;
    }

    @Override
    public double numeroDeMesesFaltantes(Cliente c, Banco b) {
        return 0;
    }

    @Override
    public double valorUltimaPrestacao(Cliente c, Banco b) {
        return 0;
    }
}
