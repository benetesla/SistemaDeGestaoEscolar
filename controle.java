import javax.swing.JOptionPane;

public class controle {

  public static void main(String[] args) {
    JOptionPane.showMessageDialog(
      null,
      "Bem vindo ao sistema de controle de alunos, professores e diretores da Universidade Federal do Estado de Sergipe"
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
    //exibir dados do aluno
    JOptionPane.showMessageDialog(
      null,
      "Nome: " +
      aluno1.getNome() +
      " Matricula: " +
      aluno1.getMatricula() +
      " Curso: " +
      aluno1.getCurso() +
      " Departamento: " +
      aluno1.getDepartamento()
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
    //exibir dados do professor
    JOptionPane.showMessageDialog(
      null,
      "Nome: " +
      professor1.getNome() +
      " Id: " +
      professor1.getId() +
      " Departamento: " +
      professor1.getDepartamento() +
      " Curso: " +
      professor1.getCurso() +
      " Disciplina: " +
      professor1.getDisciplina() +
      " Turma: " +
      professor1.getTurma() +
      " Horario: " +
      professor1.getHorario() +
      " Sala: " +
      professor1.getSala()
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
    //exibir dados do diretor
    JOptionPane.showMessageDialog(
      null,
      "Nome: " +
      diretor1.getNome() +
      " Id: " +
      diretor1.getId() +
      " Departamento: " +
      diretor1.getDepartamento() +
      " Curso: " +
      diretor1.getCurso()
    );
    //exibir todos os dados da universidade
    JOptionPane.showMessageDialog(
      null,
      "Nome: " +
      aluno1.getNome() +
      " Matricula: " +
      aluno1.getMatricula() +
      " Curso: " +
      aluno1.getCurso() +
      " Departamento: " +
      aluno1.getDepartamento() +
      " Nome\n: " +
      professor1.getNome() +
      " Id: " +
      professor1.getId() +
      " Departamento: " +
      professor1.getDepartamento() +
      " Curso: " +
      professor1.getCurso() +
      " Disciplina: " +
      professor1.getDisciplina() +
      " Turma: " +
      professor1.getTurma() +
      " Horario: " +
      professor1.getHorario() +
      " Sala: " +
      professor1.getSala() +
      " Nome\n: " +
      diretor1.getNome() +
      " Id: " +
      diretor1.getId() +
      " Departamento: " +
      diretor1.getDepartamento() +
      " Curso\n: " +
      diretor1.getCurso()
    );
  }
}
