
package javaapplication1;

public class Cliente {
    
    public static void main(String[] args){
        Pessoa pessoas = new Pessoa("Robin", 1.70, 70.7);
        System.out.println(pessoas);
        
        Pessoa clone1 = (Pessoa)pessoas.clonar();
        clone1.setNome("Alibaba");
        Pessoa clone2 = (Pessoa)pessoas.clonar();
        clone2.setNome("Joana");
        clone2.setAltura(1.50);
        
        System.out.println(clone1);
        System.out.println(clone2);
    }
        
}