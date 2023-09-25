import java.util.ArrayList;
import java.util.List;

public class Empresa extends Pessoa {
    private List<Pessoa> socios;

    public Empresa(String nome) {
        super(nome);
        this.socios = new ArrayList<>();
    }

    public void adicionarSocio(Pessoa socio) {
        socios.add(socio);
    }

    @Override
    public String getIdentificacao() {
        // Para a empresa, usaremos o nome como identificação
        return nome;
    }

    public List<Pessoa> getSocios() {
        return socios;
    }
}