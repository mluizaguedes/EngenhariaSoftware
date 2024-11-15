package diagrama;

public class Voo extends Passageiro{
    public String destino;
    protected int codigoVoo;

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCodigoVoo(int codigoVoo) {
        this.codigoVoo = codigoVoo;
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

    public String getDestino() {
        return destino;
    }

    public int getCodigoVoo() {
        return codigoVoo;
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

    public Voo(String nome, String cpf, int codigo, String destino, int codigoVoo) {
        super(nome, cpf, codigo);
        this.destino = destino;
        this.codigoVoo = codigoVoo;
    }
    
}
