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