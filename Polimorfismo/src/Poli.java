/* polimorfismo - caracteriza-se por permitir que uma mesma mensagem possa ser interpretada de diferentes formas,  ou seja, o polimorfismo permite que métodos com o mesmo nome possam ter comportamentos diferentes dependendo do objeto que os invoca.
pode ser de dois tipos:
 - sobrecarga ou Overload  - é do tipo compile time e ocorre quando existem vários métodos com o mesmo nome, mas com diferentes listas de parâmetros (diferentes tipos ou quantidades de parâmetros) dentro da mesma classe.
 - sobrescrita ou @Override - é do tipo runtime e ocorre quando uma subclasse fornece uma implementação específica de um método que já existe na sua superclasse.
 */

class Pessoa{
    public void apresentar(){
        System.out.println("Olá, tudo bem?");
    }   
}  

// sobrescrita ou  @Override usado para alterar o comportamento do método falar de aluno e professor.
class Aluno extends Pessoa{
    @Override
    public void apresentar(){
        System.out.println("Olá, tudo bem! Meu nome é Ederson, sou aluno do curso de Análise e Desenvolvimento de Sistemas.\n");
    }
}

class Professor extends Pessoa{
    @Override
    public void apresentar(){
        System.out.println("Olá, tudo bem! Sou a professora Regina, sou responsável pela disciplina de Programação Orientada a Objetos.\n");
    }
}

// sobrecarga ou Overload
class Disciplinas{  
    // primeira sobrecarga do método disciplinaCurso com 2 parâmetros (curso, disciplina)
    public void disciplinaCurso (String curso, String disciplina){
        System.out.println ("O curso é: " + curso);
        System.out.println ("A disciplina é: " + disciplina);
    } 

   // segunda sobrecarga do método disciplinaCurso com 3 parâmetros (nome, curso, disciplina)
    public void disciplinaCurso (String nome, String curso, String disciplina){ 
        System.out.println ("O nome do aluno é: " + nome);
        System.out.println ("O curso é: " + curso);
        System.out.println ("A disciplina é: " + disciplina);
    }
    // terceira sobrecarga método disciplinaCurso com 3 parâmetros (disciplina, carga horária e professor).
    public void disciplinaCurso (String disciplina, int cargaHoraria, String professor){
        System.out.println ("A disciplina é: " + disciplina);
        System.out.println ("A carga horária é: " + cargaHoraria + " horas");
        System.out.println ("O professor responsável é: " + professor);  
    }
}

// classe principal, onde serão criados os objetos e testados os métodos.
public class Poli {
    public static void main (String [] args){
        Pessoa p1 = new Aluno(); 
        p1.apresentar();

        Pessoa p2 = new Professor();
        p2.apresentar(); 
        
        Disciplinas d = new Disciplinas();
        // primeira sobrecarga do método disciplinaCurso com 2 parâmetros (curso, disciplina)
        d.disciplinaCurso("Análise e Desenvolvimento de Sistemas", "Programação Orientada a Objetos \n");
        d.disciplinaCurso("Análise e Desenvolvimento de Sistemas", "Banco de Dados \n");
        d.disciplinaCurso("Análise e Desenvolvimento de Sistemas", "Tecnologia da Informação\n");
       
        // segunda sobrecarga do método disciplinaCurso com 3 parâmetros (nome, curso, disciplina)
        d.disciplinaCurso("Ederson", "Análise e Desenvolvimento de Sistemas", "Programação Orientada a Objetos \n");
        d.disciplinaCurso("Ederson", "Análise e Desenvolvimento de Sistemas", "Banco de Dados \n");
        d.disciplinaCurso("Ederson", "Análise e Desenvolvimento de Sistemas", "Tecnologia da Informação\n");

        // terceira sobrecarga do método disciplinaCurso com 3 parâmetros (disciplina, carga horária e professor)
        d.disciplinaCurso("Programação Orientada a Objetos", 120, "Regina Dias\n");
        d.disciplinaCurso("Banco de Dados", 120, "Regina Dias\n");
        d.disciplinaCurso("Tecnologia da Informação", 120, "Regina Dias\n");    
    }
}