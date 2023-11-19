package diagrama;

public class Passageiro {
    protected String nome;
    protected String cpf;
    protected int codigo;

    public Passageiro(String nome, String cpf, int codigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCodigo() {
        return codigo;
    }
    
}
