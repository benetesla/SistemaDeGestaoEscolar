public class professor {

  private String nome;
  private String id;
  private String departamento;
  private String curso;
  private String disciplina;
  private String turma;
  private String horario;
  private String sala;

  //constructor
  public professor(
    String nome,
    String id,
    String departamento,
    String curso,
    String disciplina,
    String turma,
    String horario,
    String sala
  ) {
    this.nome = nome;
    this.id = id;
    this.departamento = departamento;
    this.curso = curso;
    this.disciplina = disciplina;
    this.turma = turma;
    this.horario = horario;
    this.sala = sala;
  }

  //getters and setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public String getTurma() {
    return turma;
  }

  public void setTurma(String turma) {
    this.turma = turma;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public String getSala() {
    return sala;
  }

  public void setSala(String sala) {
    this.sala = sala;
  }
}
