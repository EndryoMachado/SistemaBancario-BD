package br.com.POJO;

public class pessoaJuridicaPOJO extends Cliente {

    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    public pessoaJuridicaPOJO(int numeroConta, String agencia, String telefone, double saldo, double chequeEspecial,
            String cnpj, String razaoSocial, String nomeFantasia) {

        super(numeroConta, agencia, telefone, saldo, chequeEspecial);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public pessoaJuridicaPOJO() {
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String toString () {
        return "pessoaJuridicaPOJO [numeroConta=" + getNumeroConta() +", agencia=" + getAgencia() + ", telefone=" + getTelefone() + ", saldo=" + getSaldo() + 
                ", chequeEspecial=" + getChequeEspecial() + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeFantasia = " + nomeFantasia + "]";
    }

}
