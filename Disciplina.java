public class Disciplina {
  String nome;
  Professor professor;
  float NotaFinal;

  Disciplina(String NomeDisciplina,
      float NotaFinal,
      String NomeProfessor) {
    professor = new Professor(NomeProfessor);
    nome = NomeDisciplina;
    this.NotaFinal = NotaFinal;
  }

  void ExibirRelatorioDisciplina() {
    System.out.println("Disciplina:" + nome + "\nNome do professor:" + professor.nome + "\nNota final:");
    RetornarNotaFinal();
  }

  float RetornarNotaFinal() {
    return NotaFinal;
  }
}