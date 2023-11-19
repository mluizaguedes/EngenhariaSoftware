package main;

public class Viajem extends Voo{
    public String companhia;

    public Viajem(String nome, String cpf, int codigo, String destino, int codigoVoo, String companhia) {
        super(nome, cpf, codigo, destino, codigoVoo);
        this.companhia = companhia;
    }
    
    public String getCompanhia() {
        return companhia;
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
    
    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

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
    
    public void imprimir(){
        System.out.println("Nome do passageiro: "+nome);
        System.out.println("CPF: "+ cpf);        
        System.out.println("Codigo do passageiro: "+codigo);
        System.out.println("Destino: "+destino);
        System.out.println("Codigo do voo: "+codigoVoo);
        System.out.println("Companhia Aerea: "+companhia);
    }
    
}
