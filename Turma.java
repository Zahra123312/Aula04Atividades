package ExemploTurma;
import java.util.Objects;

public class Turma {
    private String nome;
    private String curso;
    private int quantidadeDeAlunos;
    private int serie;

    public Turma(String nome, String curso, int quantidadeDeAlunos, int serie) {
        this.nome = nome;
        this.curso = curso;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return quantidadeDeAlunos == turma.quantidadeDeAlunos && serie == turma.serie && Objects.equals(nome, turma.nome) && Objects.equals(curso, turma.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, curso, quantidadeDeAlunos, serie);
    }
}
