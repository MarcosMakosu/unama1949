class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    //Construtor
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    // metodo get e set
    
    ///metodo recuperar o titulo (get)
    public String getTitulo() {
        return this.titulo;
    }

    ///metodo configura a recuperar (set)
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //descricao
    public String getdescricao() {
        return this.descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    //prazo
    public String getprazo() {
        return this.prazo;
    }

    public void setprazo(String prazo) {
        this.prazo = prazo;
    }

    //prioridade
    public String getprioridade() {
        return this.prazo;
    }

    public void setprioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}

public class Main {
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "06-09-2024", 1);
        System.out.println("Título:" + tarefa1.getTitulo());
    }
}