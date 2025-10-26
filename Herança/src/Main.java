/*
 * Herança - permite que uma classe pai (Superclasse) forneca atributos e métodos para outras classes filhas (subclasse ou classe derivada);
 * é importante para reutilização de código e para estabelecer uma relação hierárquica entre classes.
 *  
 * Exemplo:
 * */
//  classe pai (superclasse), classe Pessoa com atributos comuns às classes filhas Aluno e Professor.
class Pessoa {    
    //  atributos da classe Pessoa protegidos para serem acessíveis em subclasses.        
    protected String nome;  
    protected Long CPF;      

    // construtor da classe Pessoa, this é usado para inicializar os atributos.
    public Pessoa (String nome, Long CPF) {   
        this.nome = nome;                   
        this.CPF = CPF;                      
    }
    // GETTERS - métodos para acessar os atributos privados, esse método é necessário para acessar os atributos das classes filhas.
    public String getNome(){               
        return nome;
    }

    public Long getCPF(){   
        return CPF;
    }

    // SETTERS - métodos para modificar os atributos privados, esse método é necessário para modificar os atributos das classes filhas.
    public void setNome(String nome){
        this.nome = nome;
    }   
    public void setCPF(Long CPF){
        this.CPF = CPF;
    }       
}

// classe Aluno herda atributos da classe pai (Pessoa), além de seus próprios atributos e métodos.
class Aluno extends Pessoa {
    // atributos específicos da classe Aluno, além dos herdados de Pessoa, privado significa que só podem ser acessados dentro da classe Aluno.
    private  String matricula;       
    private String curso;
    // construtor da classe Aluno, usado para inicializar os atributos e chamar o construtor da classe pai (Pessoa).     
    public Aluno(String nome, Long CPF, String matricula, String curso) {
        super(nome, CPF);            
        this.matricula = matricula; 
        this.curso = curso;         
    }
    
    // GETTERS - métodos para acessar os atributos privados, esse método é necessário para acessar os atributos das classes filhas.
    public String getMatricula(){   
        return matricula;
    }
    
    public String getCurso(){       
        return curso;
    }

    //SETTERS - métodos para modificar os atributos privados, esse método é necessário para modificar os atributos das classes filhas.
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
}

// classe Professor herda atributos da classe Pessoa, além de seus próprios atributos e métodos.
class Professor extends Pessoa {
    private String departamento;    
    private String especialidade;   
    private String graduacao;       

    // construtor da classe Professor, usado para inicializar os atributos e chamar o construtor da classe pai Pessoa.
    public Professor(String nome, Long CPF, String departamento, String especialidade, String graduacao) {
        super(nome, CPF);                       
        this.departamento = departamento;       
        this.especialidade = especialidade;     
        this.graduacao = graduacao;
    }
    // GETTERS - métodos para acessar os atributos privados, esse método é necessário para acessar os atributos das classes filhas.
    public String getDepartamento(){   
        return departamento;
    }
    
    public String getEspecialidade(){       
        return especialidade;
    }

    public String getGraduacao(){       
        return graduacao;
    }

    //SETTERS - métodos para modificar os atributos privados, esse método é necessário para modificar os atributos das classes filhas.
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public void setGraduacao(String graduacao){
        this.graduacao = graduacao;
    }       
}   

// classe Main para testar as classes Pessoa, Aluno e Professor.
public class Main{
    public static void main (String[] args){
        Aluno aluno1 = new Aluno ("Eder Moreno", 12345678921L, "325892", "Análise e Desenvolvimento de Sistemas");
        Aluno aluno2 = new Aluno ("Helena Santos", 23456789022L, "369123", "Tecnologia da Informação");
        Professor prof1 = new Professor ("Regina Dias", 34578912323L, "Tecnologia", "Engenharia de Software", "Engenharia de Software \n");
    
    System.out.println ("Aluno 1:");
    System.out.println ("Nome: " + aluno1.getNome());
    System.out.println ("CPF: " + aluno1.getCPF());
    System.out.println ("Matrícula: " + aluno1.getMatricula());     
    System.out.println ("Curso: " + aluno1.getCurso() + "\n");

    System.out.println ("\nAluno 2:");
    System.out.println ("Nome: " + aluno2.getNome());   
    System.out.println ("CPF: " + aluno2.getCPF());
    System.out.println ("Matrícula: " + aluno2.getMatricula());
    System.out.println ("Curso: " + aluno2.getCurso() + "\n");
        
    System.out.println ("Professor 1:");
    System.out.println ("Nome: " + prof1.getNome());
    System.out.println ("CPF: " + prof1.getCPF());  
    System.out.println ("Departamento: " + prof1.getDepartamento());
    System.out.println ("Especialidade: " + prof1.getEspecialidade());      
    System.out.println ("Graduação: " + prof1.getGraduacao());
    }
}