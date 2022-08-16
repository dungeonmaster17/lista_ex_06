package entidades;

import entidades.services.ServicoDeEmprestimos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private Double juros;
    private ServicoDeEmprestimos servicoDeEmprestimos;

    public Banco(){}

    public Banco(ServicoDeEmprestimos servicoDeEmprestimos){
        this.servicoDeEmprestimos = servicoDeEmprestimos;
    }

    public Banco(String nome, Double juros, ServicoDeEmprestimos servicoDeEmprestimos) {
        this.nome = nome;
        this.juros = juros;
        this.servicoDeEmprestimos = servicoDeEmprestimos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public ServicoDeEmprestimos getServicoDeEmprestimos() {
        return servicoDeEmprestimos;
    }

    public void setServicoDeEmprestimos(ServicoDeEmprestimos servicoDeEmprestimos) {
        this.servicoDeEmprestimos = servicoDeEmprestimos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
