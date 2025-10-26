// cria uma interface pública chamada Avaliado.
public interface Avaliado {
    void avaliarDesempenho();   
}

// indica que a classe professor vai implementar interface Avaliado
class Aluno implements Avaliado {
    private String nome;
    private String matricula;

    public Aluno (String nome,String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // getters nome e matricula com atributos de classes.
    public String getNome(){
        return nome;
    }
       
    public String getMatricula(){
        return matricula;
    }
    
    @Override
    public void avaliarDesempenho (){
        System.out.println("Aluno " + nome + " Obteve ótimo desempenho!!");
    }
}

// indica que a classe professor vai implementar interface Avaliado
class Professor implements Avaliado {
    private String nome;
    private String disciplina;

    public Professor (String nome,String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    // getters  nome e matricula  com atributos de classes.
    public String getNome(){
        return nome;
    }
       
    public String getDisciplina(){
        return disciplina;
    }
    
    @Override
    public void avaliarDesempenho (){
        System.out.println("Professor " + nome + " Obteve ótimo desempenho na disciplina de " + disciplina +" !!");
    }
}

// classe principal, onde serão criados os objetos e testados os métodos.
class Main {
    public static void main (String [] args){
        Aluno aluno = new Aluno ( "Ederson", "1231132");
        aluno.avaliarDesempenho();
        
        Professor professor = new Professor ("Regina Dias", "Programação Orientada a Objetos");
        professor.avaliarDesempenho();
    }
}