public class Classes3 {
    public static void main(String [] args){
        //String meuNome = "Gleyson";

        //int anoFabricacao = 2023;

        //boolean simNao = true;

        String primeiroNome = "Sabrina";
        String segundoNome = "Mendonça";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    //um metodo em java sempre pede um parâmetro
        public static String nomeCompleto(String primeiroNome, String segundoNome){
            return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        }
}