public class Curso {
  String nome;
  float NotaFinal;
  Disciplina disciplina1;
  Disciplina disciplina2;
  Disciplina disciplina3;

  Curso(String name, Disciplina disc1, Disciplina disc2, Disciplina disc3) {
        nome = name;
        disciplina1 = disc1;
        disciplina2 = disc2;
        disciplina3 = disc3;
  }
  
  float CalcularMedia() {
    float media = ( disciplina1.NotaFinal + 
                    disciplina2.NotaFinal +
                    disciplina3.NotaFinal
                  )/3;
    return media;
  }

  boolean EstaAprovado() {
    boolean estaAprovado = CalcularMedia() >= 60;
    return estaAprovado;
  }

  float NotaPorDisciplina(int identificador) {
    switch(identificador) {
      case 1:
        return disciplina1.NotaFinal;
      case 2:
        return disciplina2.NotaFinal;
      case 3:
        return disciplina3.NotaFinal;
      default:
        return 0f;
    }
  }
}