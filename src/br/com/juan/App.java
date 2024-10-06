package br.com.juan;

public class App {
    public static void main (String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Jose Silva");
        pf.setSexo("Masculino");
        pf.setCpf(123456789L);
        pf.setTelefone(21987654321L);
        pf.setDataNascimento("01-02-1999");
        pf.setEndereco("rua 1, bairro teste, Rio de janeiro");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa do Jose");
        pj.setEndereco("Av. teste, 123");
        pj.setTelefone(987654321);
        pj.setCnpj(12345678901234L);
        pj.setDataAbertura(20220101);
        pj.setNomeFantasia("Fantasia X");
        pj.setPorte("Grande");

    System.out.println(pf);
    System.out.println(pj);
    }
}
