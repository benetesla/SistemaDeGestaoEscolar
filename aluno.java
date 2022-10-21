public class aluno {

  //fazer com os alunos escolham um departamento e um curso para receberem as aulas
  private String nome;
  private String matricula;
  private String curso;
  private String departamento;

  //constructor
  public aluno(
    String nome,
    String matricula,
    String curso,
    String departamento
  ) {
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
    this.departamento = departamento;
  }

  //getters and setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }
}
