package projetolivro;

public class Programa {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Lissa", 26, "Fem.");
        p[1] = new Pessoa("Ariel", 30, "Masc");

        l[0] = new Livro("Aprendendo Java", "DIO", 60, p[0]);
        l[1] = new Livro("Arquitetura de Software", "João", 120, p[1]);

        l[0].abrir();
        l[0].folhear(20);

        System.out.println(l[0].toString());
        System.out.println(l[1].toString());
    }
}
