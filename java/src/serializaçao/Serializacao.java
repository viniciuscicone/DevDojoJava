package serializaçao;

import java.io.*;

public class Serializacao {

    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }

    private static void gravadorObjeto() {
        Turma t = new Turma("nome da turma");
        Aluno aluno = new Aluno(1L, "fulano de tal", "123456");
        aluno.setTurma(t);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Aluno implements Serializable {
    private Long id;
    private String nome;
    private transient String password;
    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            turma = new Turma(ois.readUTF());
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

class Pessoa {

}

class Turma {
    private String nome;

    public Turma(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
