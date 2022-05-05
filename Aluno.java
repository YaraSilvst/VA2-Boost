public class Aluno {
  String nome;
  int matricula;
  Curso curso;

  Aluno(String name, int mat, Curso cur) {
    nome = name;
    matricula = mat;
    curso = cur;
  }

  void ExibirRelatorio() {
    System.out.println(
      "Nome do aluno: " + nome +
      "\nCurso do aluno: " + curso.nome +
      "\nAprovado?: " + (curso.EstaAprovado()? "Sim" : "Não") +
      "\nMatricula: " + matricula
    );
  }
}