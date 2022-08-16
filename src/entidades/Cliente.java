package entidades;

public class Cliente {
    private String nome;
    private Banco banco;
    private Double valorEmprestimo;
    private Integer qtdeDeParcelas;

    public Cliente(){};

    public Cliente(String nome, Banco banco, Double valorEmprestimo, Integer qtdeDeParcelas) {
        this.nome = nome;
        this.banco = banco;
        this.valorEmprestimo = valorEmprestimo;
        this.qtdeDeParcelas = qtdeDeParcelas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(Double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public Integer getQtdeDeParcelas() {
        return qtdeDeParcelas;
    }

    public void setQtdeDeParcelas(Integer qtdeDeParcelas) {
        this.qtdeDeParcelas = qtdeDeParcelas;
    }
}
