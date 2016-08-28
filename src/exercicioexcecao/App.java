package exercicioexcecao;

public class App {

    public static void main(String[] args) {
        CadastroDeProdutos cad = new CadastroDeProdutos();
        try{
            cad.add(new Produto("0001", -10, 1.9f, "Pacote de 1kg de arroz"));
            cad.add(new Produto("0002", 20, 4.5f, "kkkk"));
            cad.add(new Produto("0003", 20, 4.5f, "Pacote de 1kg de feijao"));
            cad.add(new Produto("0004", 15, 6.3f, "Pacote de 1kg de cafe"));
            cad.add(new Produto("0005", 15, 3.2f, "Pacote de 1kg de massa"));
            cad.add(new Produto("0006", 10, 1f, "Barra de chocolate de 50 gr"));
            cad.add(new Produto("0007", 20, 2.5f, "Pacote de bolacha agua e sal"));
        }catch(IllegalArgumentException e){
                System.out.println(e);
        }finally{
                System.out.println("Esse trecho sempre é executado!!");
        }    
        System.out.println(cad.getRelatorio());
    }
}
