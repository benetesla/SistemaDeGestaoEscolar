import javax.swing.JOptionPane;

public class controle {

  public static void main(String[] args) {
    JOptionPane.showMessageDialog(
      null,
      "Bem vindo ao sistema de controle de alunos, professores e diretores da Universidade Federal de Pernambuco"
    );
    String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
    String matricula = JOptionPane.showInputDialog(
      "Digite a matricula do aluno"
    );
    String curso = JOptionPane.showInputDialog("Digite o curso do aluno");
    String departamento = JOptionPane.showInputDialog(
      "Digite o departamento do aluno"
    );
    aluno aluno1 = new aluno(nome, matricula, curso, departamento);
    JOptionPane.showMessageDialog(
      null,
      "O aluno " + aluno1.getNome() + " foi cadastrado com sucesso"
    );
    String nome2 = JOptionPane.showInputDialog("Digite o nome do professor");
    String id = JOptionPane.showInputDialog("Digite o id do professor");
    String departamento2 = JOptionPane.showInputDialog(
      "Digite o departamento do professor"
    );
    String curso2 = JOptionPane.showInputDialog("Digite o curso do professor");
    String disciplina = JOptionPane.showInputDialog(
      "Digite a disciplina do professor"
    );
    String turma = JOptionPane.showInputDialog("Digite a turma do professor");
    String horario = JOptionPane.showInputDialog(
      "Digite o horario do professor"
    );
    String sala = JOptionPane.showInputDialog("Digite a sala do professor");
    professor professor1 = new professor(
      nome2,
      id,
      departamento2,
      curso2,
      disciplina,
      turma,
      horario,
      sala
    );
    JOptionPane.showMessageDialog(
      null,
      "O professor " + professor1.getNome() + " foi cadastrado com sucesso"
    );
    String nome3 = JOptionPane.showInputDialog("Digite o nome do diretor");
    String id2 = JOptionPane.showInputDialog("Digite o id do diretor");
    String departamento3 = JOptionPane.showInputDialog(
      "Digite o departamento do diretor"
    );
    String curso3 = JOptionPane.showInputDialog("Digite o curso do diretor");
    diretor diretor1 = new diretor(nome3, id2, departamento3, curso3, curso3);
    JOptionPane.showMessageDialog(
      null,
      "O diretor " + diretor1.getNome() + " foi cadastrado com sucesso"
    );
  }
}
