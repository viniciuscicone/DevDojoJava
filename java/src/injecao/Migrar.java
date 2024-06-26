package injecao;

import java.util.List;


public class Migrar {
    
    public static void main(String[] args) {


        new MigracaoUsuario().migrar();

    }
}




class MigracaoUsuario {

    interPonteLer<Usuario> reader = new ClassLerFonteA();
    ponteEscrever<Usuario> escrever = new ClassEscreverBanco();

    void migrar(){
        List<Usuario> users = reader.lerBancoDados();
        List<Usuario> usersArquivo = reader.lerArquivo();
        escrever.escrever(usersArquivo);
    };
}





record Usuario(String username, String email) {

}



interface interPonteLer<T> {
    List<T> lerBancoDados();
    List<T> lerArquivo();
}

class ClassLerFonteA implements interPonteLer<Usuario> {
    public List<Usuario> lerBancoDados(){

        Usuario user = new Usuario("vinicius", "emailbom");
        System.out.println("Lendo usuario de um banco de dados" + user.email() + "__ nome" + user.username());
        return List.of(new Usuario("vinicius", "emailbom"));
    }

    public List<Usuario> lerArquivo(){

        Usuario user = new Usuario("vinicius", "emailbom");
        System.out.println("Lendo usuario de um aquivo" + user.email() + "__ nome" + user.username());
        return List.of(new Usuario("jonas", "emailaquigoogle"));
    }
}


class ClassEscreverBanco implements ponteEscrever<Usuario> {
    public void escrever(List<Usuario> Usuario){
        System.out.println("Escrevendo usuario no banco de dados");
        System.out.println(Usuario);
    };
}
interface ponteEscrever<T> {
    void escrever(List<T> itens);
}