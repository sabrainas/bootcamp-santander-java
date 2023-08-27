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