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