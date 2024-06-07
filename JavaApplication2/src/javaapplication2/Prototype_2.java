
package javaapplication2;


public class Prototype_2 {
    
    public static void main(String[] args) throws CloneNotSupportedException {
       /*
        Pessoa2 p1 = new Pessoa2();
        p1.setNome("Joao");
        p1.setAltura(1.75);
        p1.setPeso(80.0);
        System.out.println(p1);
        
        System.out.println("---");
        
        Pessoa2 p2 = p1.clone();   
        p2.setNome("Maria");
        System.out.println(p2);
        
        System.out.println("---");
        
        Pessoa2 p3 = p1.clone();
        p3.setAltura(1.52);
        System.out.println(p3);
        */
        //aplicação com registro estatico de pessoas definido;
        RegistroPessoasStatic registry = RegistroPessoasStatic.getInstance();
        Pessoa2 p1 = registry.getPessoa2("Prototipo1");
        System.out.println(p1);
        
        Pessoa2 p2 = registry.getPessoa2("Prototipo2");
        System.out.println(p2);
        
        Pessoa2 p3 = registry.getPessoa2("Prototipo3");
        System.out.println(p3); 
        
    }
    
}