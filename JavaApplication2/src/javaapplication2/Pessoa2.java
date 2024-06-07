
package javaapplication2;

public class Pessoa2 implements Cloneable{
    
    private Double altura;
    private Double peso;
    private String nome;
    private String classe;
    
    // Construtores
    public Pessoa2() {
    }
    
    public Pessoa2(Pessoa2 prototipo) {
            this.altura = prototipo.getAltura();
            this.peso = prototipo.getPeso();
            this.nome = prototipo.getNome();
            this.classe = prototipo.getClasse();
    }
    


    // Getters e Setters
    public String getClasse() {
        return classe;
    }
        
    public void setClasse(String classe) {    
        this.classe = classe;
    }

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
    public Pessoa2 clone() throws CloneNotSupportedException {
        return (Pessoa2) super.clone();
    }
    
    @Override
    public String toString() {
        return "Pessoa:\nNome: " + nome +", classe: "+classe+", peso: " + peso + ", altura: " + altura + "\n";
    }
}