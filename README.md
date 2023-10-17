# Bootcamp Java Backend ♨️

Neste repositório estarei colocando conteúdos que forem aprendidos e colocados em prática ao decorrer do bootcamp.
Estou começando com esse README para organizar as atividades e aproveitar para colocar em prática conhecimentos de Git e GitHub.

Criei esse repositório remotamente e logo após irei clonar na minha máquina com o comando: `git clone https://github.com/sabrainas/bootcamp-santander-java.git`.

Logo após os seguintes comandos:

`git init` - para iniciar o repositório 

`git remote add upstream https://github.com/sabrainas/bootcamp-santander-java.git ` - para manter o repositório local atualizado. 

com o comando de teclado windows `CTRL + SHIFT + P` criei um novo arquivo java chamado "primeiro-java" e pude dar o primeiro **"Olá Mundo!"**

>
```
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá mundo!");
    }
}
```

Logo, para enviar novamente para o repositório local, basta efetuar o comando `git push origin`
## Iniciando com Java

1. Todo arquivo Java deve começar com letra maiúscula. Diferente das variáveis que começam com letras minúsculas.

>Exemplo: Calculadora.java; MinhaClasse.java

2. O nome da classe deve ser o mesmo nome que o arquivo.

3. Caso eu não queira modificar o valor de uma variável, devo nomea-la toda maiúscula e inicializa-la com final
>Exemplo: `final String BR = Brasil`

4. Um método em Java sempre pede parâmetros, eles podem ser de tipos diferentes.
```
public class App {
    public static void main(String [] args){ 

        String primeiroNome = "Sabrina";
        String segundoNome = "Mendonça";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
```

5. A indentação gera uma hierarquia no código Java. São boas práticas de desenvolvimento.

6. Para criar um pacote dentro do meu diretório Java, preciso criar uma pasta com o prefixo com o tipo do projeto, outra com a identidade, seja o da empresa ou projeto pessoal, e por fim o nome do projeto.

```
>comercial = com

>open source = opensource

>educacional = edu

>organizacional = org
```

>Exemplo: com.hypertech.analises

>Exemplo2: edu.sabrina.bootcamp



7. **Java Beans** = é iniciativa conceitual para existir uma estruturação da escrita, para obter códigos mais claros e entendível.

    Existem variáveis que não são recomendadas. Como representadas abaixo:

```
double salMedio = 1500.23; //variáveis abreviadas
String emails = "aluno@escola.com"; //o tipo de dado corresponde a apenas um valor, o ideal seria 'String email'
String myName = "SABRINA";  //não é interessante variáveis em outro idioma
```

Recomendado:

```
double salarioMedio = 1500.23;
String email = "aluno@escola.com";
String [] emails = {"aluno@escola.com", "professor@escola.com"};
String meuNome = "SABRINA"
```


Os métodos devem ser nomeados como verbos, com mistura de letras minúsculas e maiúsculas.

```
somar(int n1, int n2){}
abrirConexao(){}
concluirProcessamento(){}
findById(int id){}
calcularImprimir(){} //este método esta errado, ele possui sentido ambíguo.
```

### Tipos e Variáveis

Oitos tipos primitivos em Java são:
- int
- byte
- short
- long
- float 
- double
- boolean 
- char

Esses tipos não são considerados objetos, portanto representam valores brutos. São armazenados diretamente na pilha de memória. (Memory Stack)

Tipos Primitivos:

| Tipo | Memória | Valor Mínimo | Valo Máximo |
|------|---------|--------------|-------------|
|byte | 1 byte | -128 | 127 |
|short | 2 bytes | -32768 | 32767
|int | 4 bytes | -2147483648 | 2147483647 |
|long | 8 bytes| -9223372036854775808 | 9223372036854775807 |

Atualmente tipos `short` e `byte` se tornaram desnecessários para uso.

Tipos Primitivos com partes fracionárias:

| Tipo | Memória | Valor Mínimo | Valo Máximo |
|------|---------|--------------|-------------|
|float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 |
|double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 |

`float` é menos utilizado pois sofre de uma limitação em seu uso. Tipo float sempre pede um F no final da variável.

A estrutura para a declaração de uma variável sempre vai ser: 
`<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>`
`int anoFabricacao = 2021;`

Tipo de Dado + Identificação + Valor Atribuído.

8. **Constantes**: São valores armazenados em memória que não podem ser modificados depois de declarados, são sempre escritas em caixa alta e com a palavra reservada `final` seguida do tipo.

### Operadores

São símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.

Atribuição: `=`.
Aritméticos: `+`, `-`, `*`, `/`.
Unários: aplicados juntamentes com outro operador aritmético. `+`, `-`, `++`, `--`, `!`.
Ternário: forma resumida de definir uma condição entre dois valores. `?:`
`<Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>`.
Relacionais: avaliam a relação entre duas variáveis ou expressões. `==`, `!=`, `>`, `<`, `>=`, `<=`.
Obs: Objetos são comparados de uma outra estrutura.
Sendo ele `equals`.
Lógicos: expressões lógicas. `&&`, `||`.

### Métodos 
É a definição para uma classe, correspondem a funções ou subrotinas.
- Deve ser nomeado como verbo
- Seguir o padrão camelCase
- Qual a proposta principal do método? Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
- Qual o tipo de retorno esperado após executar o método? Você deve analisar se o método será responsável por retornar algum valor ou não. Obs: caso não retorne nehum valor, ele será representado pela palavra chave `void`. 
- Quais os parâmetros necessários para execução do método? Os métodos as vezes precisam de argumentos como critérios para a execução.
- O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
- Qual a visibilidade do método? Será necessário que o método seja visível a toda aplicação, somente em mesmo pacotes, através de herança ou somente a nível da própria classe.

### Palavras Reservadas

A linguagem Java possui 52 palavras reservadas. Todas são classificadas em grupos e escritas com letra minúscula, sendo identificada com uma cor especial pela maioria das IDE's.
Sendo elas: 

- abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata.
- continue 
- goto 
- package: especifica a que pacote todas as classes de um arquivo pertencem.
- synchronized: indica que um método só pode ser acessado por uma thread de cada vez.
- assert
- default
- if 
- private: acesso apenas dentro da classe.
- this: refere-se a instância atual do objeto.
- boolean 
- do 
- implements: indica as interfaces que uma classe irá implementar.
- protected: acesso por classes no mesmo pacote e subclasses.
- throw: usado para passar uma exceção para o método que o chamou.
- break 
- double 
- import: importa pacotes ou classes para dentro do código.
- public: acesso de qualquer classe.
- throws: indica que um método pode passar uma exceção para o método que o chamou 
- byte
- else 
- instanceof 
- return 
- transient: impede a serialização de campos
- case
- extends: indica a superclasse que a subclasse está estendendo.
- int
- short
- try
- catch 
- final: impossibilita que uma classe seja estendida.
- interface: especifica uma interface
- static: faz método ou variável pertencer à classe ao invés de às instâncias.
- void: indica que um método não tem retorno de valor.
- char
- finally 
- long 
- strictfp: usado em frente a um método ou classe para indicar que os numeros de pontos flutuante seguirão as regras de ponto flutuante em todas as expressões
- volatile: indica que uma variável pode ser alterada durante o uso de threads
- class: especifica uma classe
- float 
- native: indica que um método está escrito em uma linguagem dependente de plataforma, como C,
- super: refere-se a superclasse imediata
- while
- const 
- for
- new: instancia um novo objeto, chamando seu construtor.
- switch

**Link docs: https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/package-summary.html**

### Scanner
A classe **Scanner** permite que o usuário tenha uma interação mais assertiva com o nosso programa

```
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    }
}
```

### For Each
O uso do for/each está relacionado com um cenário onde contenha um array ou coleção, e assim, a interação é baseada aos elementos da coleção
```
int[] numbers = {1, 2, 3, 4, 5};

for (int num : numbers) {
    System.out.println(num);
}
```

### Exceções
O Java é capaz de lançar exceções quando ocorre um erro, mandando essa mensagem de erro para o usuário.

`try` - permite definir um bloco de código para ser testado;
`catch ` - é lançado quando ocorre um erro no bloco `try`
`finally` - define um bloco de código a ser executado independente se há erros ou não

```
try{
    //bloco a ser testado
}
catch(nomedaexcecao){
    //retorno ao usuário
}
```

## Programação Orientada a Objetos com Java

A POO é um paradigma da programação que pretende aproximar o mundo real do virtual. Ou seja, transformar objetos e seus comportamentos em linhas de código.
Esse paradigma apresentam alguns conceitos principais, sendo eles Objetos e Classes.
Os objetos são uma aglutinação de estados e comportamentos, ele é um elemento que representa alguma entidade, seja ela abstrata ou concreta. Depende do negócio.
A classe é um conjunto de objetos com características em comum. O comportamento é definido por métodos (como se fossem funções na programação estruturada, pois são ações daquele objeto) e também por atributos (o que seriam as variáveis, pois podem ser String, Int, Double, Boolean, Float e Array).
Instanciar é o ato de criar um objeto a partir de uma estrutura definida.
```
// Criando a classe Student
// Com todas as características e compartamentos aplicados

public class Estudante {
    String nome;
    int idade;
    Sex sexo;

    void comendo(String comer){
      System.out.Println("O aluno está comendo");
    }
    void bebendo(Juice juice){
      System.out.Println("O aluno está bebendo");
    }
    void correndo(){
      System.out.Println("O aluno está correndo");
    }
}

```

```
// Criando objetos a partir da classe Estudante

public class Escola {
    public static void main(String[] args) throws Exception {
      Student student1 = new Estudante();
      student1.nome= "John";
      student1.idade= 12;
      student1.sexo= Sex.MALE;

      Student student2 = new Student();
      student2.nome= "Sophia";
      student2.idade= 10;
      student2.sexo= Sex.FEMALE;

      Student student3 = new Student();
      student3.nome= "Lily";
      student3.idade= 11;
      student3.sexo= Sex.FEMALE;
    }
}
```

### Pacotes
A linguagem Java é composta por inúmeras classes. Com isso, foi necessário organizá-las atraves de pacotes.
Eles recebem uma nomenclatura para cada tipo de negócio ou projeto.
Ex
`Comercial: com.powersoft;`
`Governamental: gov.powersoft;`
`Código-aberto: org.powersoft;`

Agora para a organização de classes:
`model : Classes que representam a camada e modelo da aplicação : Cliente, Pedido, NotaFiscal, Usuario;`

`repository: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository;`

`service: Classes que contém regras de negócio do sistema : ClienteService possui o método validar o CPF, do cliente cadastrado;`

`controller: Classes que possuem a finalidade de, disponibilizar os nossos recursos da aplicação, para outras aplicações via padrão HTTP;`

`view: Classes que possuem alguma interação, com a interface gráfica acessada pelo usuário;`

`util: Pacote que contém, classes 
utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil.`

### Getters e Setters
Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos, de instâncias de classes.
O método Getter, retorna o valor do atributo especificado.
O método get, é responsável por obter o valor atual do atributo, logo ele precisa ser public, retornar um tipo correspondente ao valor, Ex:
-  `public String getNome() {};`

O método Setter, define outro novo valor para o atributo especificado.
O método set, é responsável por definir ou modificar o valor de um atributo em um objeto, logo, ele também precisa ser public, receber um parâmetro do mesmo tipo da variável, mas não retorna nenhum valor void. Ex: 
- `public void setNome(String newNome);`


Ex:
```
//arquivo Aluno.java
public class Aluno {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		nome = newNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}
```

```
//arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno sabrina = new Aluno();
		felipe.setNome("Sabrina");
		felipe.setIdade(9);
		
		System.out.println("O aluno " + sabrina.getNome() + " tem " + sabrina.getIdade() + " anos ");	
	}
}
```

### Construtores
Também conhecidos pelo inglês constructors, os construtores são os responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida.
Ex:
```
public class Carro{

private String cor;
private double preco;
private String modelo;

/* CONSTRUTOR PADRÃO */
public Carro(){

}

/* CONSTRUTOR COM 2 PARÂMETROS */
public Carro(String modelo, double preco){
//Se for escolhido o construtor sem a COR do veículo
// definimos a cor padrão como sendo PRETA
this.cor = “PRETA”;
this.modelo = modelo;
this.preco = preco;
}

/* CONSTRUTOR COM 3 PARÂMETROS */
public Carro(String cor, String modelo, double preco){
this.cor = cor;
this.modelo = modelo;
this.preco = preco;
}

}
```

### Pilares de POO
Programação Orientada a Objeto sempre será guiada por 4 pilares, sendo eles:

**Herança**: como o próprio nome diz, a herança passa de “pai” para “filho” na escrita do código. Portanto, no objeto principal há vários atributos e métodos que podem originar-se de um atual objeto (pai) para a geração de um novo código (filho).
A "cadeia de herança" é o termo usado para descrever esse fluxo de herança do protótipo do objeto base (aquele do qual todos os outros herdam) até o "final" da cadeia de herança. 

**Encapsulamento**:A definição de encapsulamento é "a ação de colocar algo dentro ou como se estivesse em uma cápsula". Remover o acesso a partes do seu código e tornar as coisas privadas é exatamente o que o Encapsulamento faz (muitas vezes, as pessoas se referem a ele como "ocultação de dados"). É importante limitar o acesso de quais partes do código podem ser acessadas. Caso não sejam necessárias, torne as coisas mais inacessíveis para não possibilitar efeitos colaterais no estado do objeto.
 - Visibilidade dos recursos:
    - Modificador public: Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote, poderá visualizar tais recursos.
    - Modificador default: O modificador default, está fortemente associado a organização das classes por pacotes, algumas implementações, não precisam estar disponíveis por todo o projeto, e este modificador de acesso, restringe a visibilidade por pacotes.
    - Modificador private: Marcando um atributo como privado, fechamos o seu acesso em relação a todas as outras classes e fazemos com que o código não compile.
    - Modificador protected:  Com este modificador, apenas a classe que contém o modificador e os tipos derivados dessa classe tem o acesso.

**Polimorfismo**:Polimorfismo significa "a condição de ocorrer de várias formas diferentes". Se você usou a herança corretamente, agora pode usar tanto os pais de maneira confiável como seus filhos. Quando dois tipos compartilham uma cadeia de herança, eles podem ser usados ​​alternadamente sem erros ou declarações em seu código.

**Abstração**: É a indisponibilidade para determinar a lógica de em ou vários comportamentos em um objeto.

# Collection
É uma estrutura de dados em que armazeno vários elementos em uma única variável. As coleções podem ser homogêneas e heterogêneas.
Existem 4 tipos de Collections:
- `List`: coleção ordenada que permite a inclusão de elementos duplicados. `ArrayList` e `LinkedList`. Se assemelha a uma matriz com comprimento dinâmico.
- `Set`
- `Queue`
- `Map`

Cada uma das classes, possuem subclasses que tem métodos que auxiliam o desenvolvedor na hora de manipular objetos.
Não aceita tipos primitivos, apenas classes.

## Generics Type

Classe genérica ou uma interface que é parametrizada em relação a tipos

Uma classe comum como:
```
public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
```

Se tornaria:
```
/**
Versão genérica da classe Box.
@param <T> o tipo do valor sendo armazenado
*/
public class Box<T> {
	// T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
```

`<>` é chamado de diamond operator, usado para inserir tipos genéricos.
Os parâmetros mais usados são:
- E: Elemento (usado extensivamente pelo Java Collections Framework)
- K: Chave
- N: Número
- T: Tipo
- V: Valor
- S, U, V, etc: 2º, 3º, 4º tipos

Generics Types são seguros, é possível evitar erros garantindo que você esteja lidando com dados corretos.
Torna o código legível.
Torna o código reutilizável.
E melhora o desempenho.

## Comparable X Comparator

`Comparable`
- fornece uma única sequência de ordenação.
- afeta a classe original
- fornece o métdodo `compareTo()`
- está presente no modo `java.lang`
- pode ordenar  elementos da lista usando método `Collections.sort(List)`

`Comparator`
- fornece o método `compare()` para ordenar elementos.
- fornece múltiplas sequências de ordenação.
- não afeta a classe atual
- está presente no pacote `java.util`
- pode ordenar os elementos da lista do tipo `Comparator` usando o método `Collections.sort(List, Comparator)`

# Stream API 

Functional Interface: qualquer interface com um Single Abstract Method é uma interface funcional e sua implementação pode ser tratada como expressões lambda.

`Consumer<T>`: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos Stream sem modificar ou retornar um valor.

```
public class ConsumerExample{
    public static void main(String[] args){
        //criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Criar um Consumer para imprimir cada numero
        Consumer<Integer> imprimirNumero = numero -> System.out.println(numero);

        //usar o Consumer para imprimir cada numero no Stream
        numeros.stream().forEach(imprimirNumero);
    }
}
```

`Suplier<T>` Representa uma operação que nao aceita nenhum argumento e retorna um resultado do tipo T. É comumente usada para criar ou fornecer novos objetos de um determinado tipo.

```
public class SupplierExample{
    public class void main(String[] args){
        //Criar um Supplier para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Ola, seja bem vindo";

        //usar o supplier para obter a saudação
        String mensagemSaudacao = saudacao.get();
        System.out.println(mensagemSaudacao);
    }
}
```