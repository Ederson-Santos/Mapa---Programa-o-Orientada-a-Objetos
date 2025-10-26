// Classe Aluno com os atributos nome, matrícula e curso.
public class Aluno {
    String nome;
    long matricula;
    String curso;

    // Método principal para criar um objeto Aluno e exibir seus atributos.
    public static void main (String[] args){
        //Criando um objeto da classe Aluno
        Aluno aluno1= new Aluno();
        aluno1.nome="Ederson Moreno";
        aluno1.matricula=325892;
        aluno1.curso="Análise e Desenvolvimento de Sistemas \n";
        
        Aluno aluno2= new Aluno();
        aluno2.nome="Helena Moreno";
        aluno2.matricula=325999;
        aluno2.curso="Tecnologia da Informação \n";

        //Exibindo os atributos do objeto aluno1
        System.out.println ("Nome:" + aluno1.nome);
        System.out.println ("Matricula:" + aluno1.matricula);
        System.out.println ("Curso:" + aluno1.curso);

        System.out.println ("Nome:" + aluno2.nome);
        System.out.println ("Matricula:" + aluno2.matricula);
        System.out.println ("Curso:" + aluno2.curso);
    }                            
}
