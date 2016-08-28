
package Herança;


public class App {


    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(123,"Fulano",3500) {};
        Funcionario f2 = new Funcionario(183,"Beltrano",2500) {};
        Funcionario f3 = new Funcionario(177,"Fulano",4500) {};
        Funcionario f4 = new Funcionario(177,"Fulano",4500) {};
        
        System.out.println("f1 equals f2? "+f1.equals(f2));
        System.out.println("f3 equals f4? "+f3.equals(f4));  
        System.out.println("f3 equals f3? "+f3.equals(f3));  
        
        System.out.println("");
        
        Servente s = new Servente(345,"Servente Fulano", 1000);
        System.out.println(s);
        System.out.println("Nome do servente s: " + s.getNome());
        
        System.out.println("");
        
        Motorista m = new Motorista("0787", 234, "Motorista Beltrano", 1000);
        System.out.println(m);
        System.out.println("Nome do motorista m: " + m.getNome());
        
        System.out.println("");
        
        MestreDeObras mo = new MestreDeObras(567,"Mestre Ciclano", 1000, 20);
        System.out.println(mo);
    }
}
