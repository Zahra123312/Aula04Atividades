package ExemploDisciplina;
import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome da determinada disciplina:");
        String professor = JOptionPane.showInputDialog("Digite o nome do professor:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre da disciplina:"));
        int resposta = JOptionPane.showConfirmDialog(null, "A disciplina está sendo ofertada?", "Oferta", JOptionPane.YES_NO_OPTION);
        boolean ofertada = resposta == 0;

        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        JOptionPane.showMessageDialog(null,
         "Disciplina criada: \n" +
             "Nome: " + disciplina.getNome() + "\n" +
            "Professor: " + disciplina.getProfessor() + "\n" +
            "Semestre: " + disciplina.getSemestre() + "\n" +
            "Ofertada: " + (disciplina.isOfertada() ? "Sim" : "Não")
        );
    }
}