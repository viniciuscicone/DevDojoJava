package injecao;

import java.util.List;


public class Migrar {
    
    public static void main(String[] args) {
        new MigracaoUsuario().migrar();
    }
}

class MigracaoUsuario {

    FileReader reader = new FileReader();
    BdWriter writer = new BdWriter();

    void migrar(){
        List<Usuario> users = reader.returnFile();
        writer.write(users);
    };
}

record Usuario(String username, String email) {

}

class FileReader {
    List<Usuario> returnFile(){
        System.out.print("Lendo usuario de um arquivo");
        return List.of(new Usuario("vinicius", "emailbom"));
    }
}

class BdWriter {
    void write(List<Usuario> Usuario){
        System.out.print("Lendo usuario da memoria");
        System.out.print(Usuario);
    };
}