import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Esse e o Screen Match");
        System.out.println("Filme: Estrelas Além do Tempo");
        
        int ano = 2016;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        
        System.out.println("Ano de lancamento " + ano);
        
        double media = (8.4 + 7.5 + 6.8)/3;
        System.out.println("A media das notas deste filme e: " +media);
        
        String sinopse;
        sinopse = ("Entre as décadas de 50 e 60 a corrida espacial já era uma realidade na NASA, uma vez que a União Soviética já começava a lançar seus primeiros satélites, enquanto os EUA tinham alguns problemas de lançamento.");
        System.out.println(sinopse);
        
    }
}