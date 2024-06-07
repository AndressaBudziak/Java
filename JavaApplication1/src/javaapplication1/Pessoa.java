
package javaapplication1;

public class Pessoa implements ProtoType{
    
    private Double altura;
    private Double peso;
    private String nome;
    
    //Construtores
    public Pessoa(){
        
    }
    
    public Pessoa(String nome,Double altura, Double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;        
    }

    //Gets e Sets
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public ProtoType clonar(){
        return new Pessoa(nome,altura,peso);
    }
    
    @Override
    public String toString(){
        return "Pessoa:\nNome: "+nome+", peso: "+peso+", altura: "+altura+"\n";
    }
    
}
