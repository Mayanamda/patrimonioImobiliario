public class Aplicacao {
    
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("Pessoa Física 1", "111.111.111-11");
        PessoaFisica pessoa2 = new PessoaFisica("Pessoa Física 2", "222.222.222-22");
        PessoaFisica pessoa4 = new PessoaFisica("Pessoa Física 4", "444.444.444-44");
        PessoaFisica pessoa5 = new PessoaFisica("Pessoa Física 5", "555.555.555-55");

        PessoaJuridica empresaC = new PessoaJuridica("Empresa C", "11111");
        PessoaJuridica empresaD = new PessoaJuridica("Empresa D", "22222");

        BemImovel bem1 = new BemImovel(100000);
        BemImovel bem2 = new BemImovel(150000);
        BemImovel bem3 = new BemImovel(200000);
        BemImovel bem4 = new BemImovel(300000);

        pessoa1.adicionarBemImovel(bem1);
        pessoa1.adicionarBemImovel(bem3);
        pessoa2.adicionarBemImovel(bem2);
        pessoa4.adicionarBemImovel(bem4);
        pessoa5.adicionarBemImovel(bem4);

        empresaD.adicionarSocio(pessoa4);
        empresaD.adicionarSocio(pessoa5);

        Empresa empresaA = new Empresa("Empresa A");
        empresaA.adicionarSocio(pessoa1);
        empresaA.adicionarSocio(pessoa2);
        empresaA.adicionarSocio(empresaD);

        CalculadoraPatrimonio calculadora = new CalculadoraPatrimonio();
        double patrimonioImovelEmpresaA = calculadora.calcularPatrimonioImovel(empresaA);
        System.out.println("Patrimônio Imobiliário da Empresa A: " + patrimonioImovelEmpresaA);
    }
}