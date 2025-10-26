public class Privado {
    private String nome;
    private Long matricula;
    private String curso;

    // Getter - Retorna o valor de um atributo, saída de dados
    public String getNome(){
        return nome;
    }  

    public Long getMatricula() { 
        return matricula; 
    }

    public String getCurso() {
        return curso;
    }

    // Setters - Define ou atualiza o valor de um atributo, entrada de dados
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }   
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
// Método main para testar a classe Privado, criando objetos e exibindo seus atributos e valores.   
    public static void main (String[] args){
        Privado aluno1= new Privado();
        aluno1.setNome ("Ederson Moreno");
        aluno1.setMatricula (325892L);
        aluno1.setCurso("Análise e Desenvolvimento de Sistemas \n");

         Privado aluno2= new Privado();
        aluno2.setNome ("Helena Santos");
        aluno2.setMatricula (369123L);
        aluno2.setCurso("Tecnologia da Informação \n");

        System.out.println ("Nome: " + aluno1.getNome());
        System.out.println ("Matricula: " + aluno1.getMatricula());
        System.out.println ("Curso: " + aluno1.getCurso());

        System.out.println ("Nome: " + aluno2.getNome());
        System.out.println ("Matricula: " + aluno2.getMatricula());
        System.out.println ("Curso: " + aluno2.getCurso());
    }
}

