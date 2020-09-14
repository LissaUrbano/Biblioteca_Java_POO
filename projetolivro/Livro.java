package projetolivro;

public class Livro implements Publicacao{
    
    //atributo
        private String titulo;
        private String autor;
        private int totalPaginas;
        private int paginaAtual;
        private boolean aberto;
        private Pessoa leitor;

    @Override
    public String toString() {
        return "Livro [aberto= " + aberto + "\n, autor= " + autor + "\n, leitor= " + leitor.getNome() + "\n, paginaAtual= " + paginaAtual
                + "\n, titulo= " + titulo + "\n, totalPaginas= " + totalPaginas + "]";
    }

    //construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    } 
    
    //metodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    
    //metodos abstratos implementados
    @Override
    public void abrir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folhear(int p) {
        if (p <= this.totalPaginas) {
            this.paginaAtual = p;
        } else{
            System.out.println("Pagina Inválida.");
            this.paginaAtual = 0;
        }
    }

    @Override
    public void avancarPagina() {
        if (this.paginaAtual < this.totalPaginas) {
            this.paginaAtual++;
        } else{
            System.out.println("Impossivel avançar a Pagina.");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.paginaAtual <= this.totalPaginas && this.paginaAtual > 0) {
            this.paginaAtual-- ;
        } else{
            System.out.println("Impossivel voltar Pagina.");
        }
    }




}
