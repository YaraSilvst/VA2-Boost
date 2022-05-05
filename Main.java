public class Main {
  public static void main(String[] args) {
    
    Disciplina Fitopatologia = new Disciplina("FIT", 90, "Aurélio");
    Disciplina FisicaGeral = new Disciplina("FISG", 80, "João Andrade");
    Disciplina QuimicaGeral = new Disciplina("QUIG", 55, "Antônio");
    Disciplina Anatomia = new Disciplina("ANA", 62, "Emanuel");
      
    Curso Agronomia = new Curso("AGRO", Fitopatologia, FisicaGeral, QuimicaGeral);
    
    Curso Enfermagem = new Curso("ENF", Anatomia, Fitopatologia, QuimicaGeral);
                               
    Aluno aluno01 = new Aluno("Leonardo Nunes", 01, Agronomia);
    Aluno aluno02 = new Aluno("Isabele Caroline", 02, Enfermagem);

    System.out.println("Media do aluno(a) " + aluno01.nome + ": " +
                       aluno01.curso.CalcularMedia()
                      );

    System.out.println("Media do aluno(a) " + aluno02.nome + ": " +
                       aluno02.curso.CalcularMedia()
                      );

    System.out.println("Nota do aluno(a) " + aluno02.nome + ": " +
                       aluno02.curso.NotaPorDisciplina(2)
                      );

    Fitopatologia.ExibirRelatorioDisciplina();
    FisicaGeral.ExibirRelatorioDisciplina();  

    aluno01.ExibirRelatorio();
    aluno02.ExibirRelatorio();
  }
}