package ExemploTurma;
import javax.swing.*;

public class TesteTurma {
  public static void main(String[] args) {
  String nome =   JOptionPane.showInputDialog("Digite nome da turma");
  String curso =   JOptionPane.showInputDialog("Digite curso da turma");
  int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
  int serie =   Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));

  Turma turma= new Turma(nome, curso, quantidadeDeAlunos, serie);

    JOptionPane.showMessageDialog(null, "O nome da turma é: "+turma.getNome() +"\n"+
    "O curso da turma é: "+turma.getCurso()+"\n"+
    "A quantidade de alunos é: "+turma.getQuantidadeDeAlunos()+"\n"+
    "A serie é: "+turma.getSerie()+"\n"
    );

    turma.setQuantidadeDeAlunos(Integer.parseInt(JOptionPane.showInputDialog("Digite uma nova quantidade de alunos")));

    JOptionPane.showMessageDialog(null, "O nome da turma é "+turma.getNome() +"\n"+ "O curso da turma é: "+turma.getCurso()+"\n"+
    "A quantidade de alunos é: "+turma.getQuantidadeDeAlunos()+"\n"+
    "A serie é : "+turma.getSerie()+"\n"
    );
  }
}
