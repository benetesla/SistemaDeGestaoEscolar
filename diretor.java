public class diretor {

  private String nome;
  private String id;
  private String departamento;
  private String curso;
  private String gestao;

  //constructor
  public diretor(
    String nome,
    String id,
    String departamento,
    String curso,
    String gestao
  ) {
    this.nome = nome;
    this.id = id;
    this.departamento = departamento;
    this.curso = curso;
    this.gestao = gestao;
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

  public String getGestao() {
    return gestao;
  }

  public void setGestao(String gestao) {
    this.gestao = gestao;
  }
}
