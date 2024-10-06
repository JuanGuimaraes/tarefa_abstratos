package br.com.juan;

public class PessoaJuridica extends Pessoa {

    private long cnpj;
    private long dataAbertura;
    private String nomeFantasia;
    private String porte;

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(long dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone=" + getTelefone() +
                ", cnpj=" + cnpj +
                ", dataAbertura=" + dataAbertura +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", porte='" + porte + '\'' +
                '}';
    }
}
