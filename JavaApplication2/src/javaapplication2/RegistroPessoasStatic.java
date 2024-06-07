
package javaapplication2;

import java.util.HashMap;
import java.util.Map;
import javaapplication2.Pessoa2;

/**
 *
 * @author andressa
 */
final class RegistroPessoasStatic {
    //Armazenas "como subclasses de registros"
    private static final RegistroPessoasStatic INSTANCE = new RegistroPessoasStatic();
    private static final Map<String,Pessoa2> REGISTRY = new HashMap<>();
    
    static{
        Pessoa2 p1 = new Pessoa2();
        p1.setNome("Robo");
        p1.setClasse("Android");
        REGISTRY.put("Prototipo1", p1);
        
        Pessoa2 p2 = new Pessoa2();
        p2.setNome("Joao");
        p2.setAltura(1.80);
        p2.setPeso(80.0);
        p2.setClasse("Humano");
        REGISTRY.put("Prototipo2", p2);
        
        Pessoa2 p3 = new Pessoa2();
        p3.setNome("Alien");
        p3.setAltura(1.40);
        p3.setPeso(50.0);
        p3.setClasse("Alienigena");
        REGISTRY.put("Prototipo3", p3);
    }
    
    public static RegistroPessoasStatic getInstance(){
        return INSTANCE;
    }
    
    public Pessoa2 getPessoa2(String chave){
        try{
            return REGISTRY.get(chave).clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}