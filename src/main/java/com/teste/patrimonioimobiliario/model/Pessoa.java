import java.util.HashSet;
import java.util.Set;

public abstract class Pessoa {
    protected String nome;
    protected Set<BemImovel> bensImoveis;

    public Pessoa(String nome) {
        this.nome = nome;
        this.bensImoveis = new HashSet<>();
    }

    public abstract String getIdentificacao(); 

    public void adicionarBemImovel(BemImovel bemImovel) {
        bensImoveis.add(bemImovel);
    }

    public Set<BemImovel> getBensImoveis() {
        return bensImoveis;
    }
}