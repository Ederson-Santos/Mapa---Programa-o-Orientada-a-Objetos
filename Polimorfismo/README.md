•	Polimorfismo - é  a capacidade de um objeto assumir diferentes formas, permite que você use uma referência de uma superclasse ou interface para apontar para objetos de subclasses diferentes, deixando o código mais flexível, reutilizável e extensível. Caracteriza-se por permitir que uma mesma mensagem possa ser interpretada de diferentes formas,  ou seja, permite que métodos com o mesmo nome possam ter comportamentos diferentes dependendo do objeto que os invoca (OLIVEIRA JUNIOR; NOEL, 2023). Pode ser de dois tipos:

•	sobrecarga (Overload) - é do tipo compile time, ocorre quando existem vários métodos com o mesmo nome, mas com diferentes tipos ou quantidades de parâmetros dentro da mesma classe.

•	sobrescrita (@Override) - é do tipo runtime e ocorre quando uma subclasse fornece uma implementação específica de um método que já existe na sua superclasse.

Estrutura de pastas, é composta de pastas por padrão, onde:

src: representa o diretório onde fica o código-fonte do seu programa, ou seja, os arquivos (.java) que você escreve. Ex.: Aluno.java, Professor.java, Disciplina.java, Poli.java, Pessoa.java

lib: armazena dependências externas, ou seja, bibliotecas que seu projeto precisa para funcionar corretamente. Ex.: Bibliotecas externas (.jar)

bin: gera arquivos de saída compilados (.class) Ex.: Aluno.class, Professor.class, Disciplina.class, Poli.class, Pessoa.class

README.md → Apresenta a descrição do projeto
