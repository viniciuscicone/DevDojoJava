package primeiroo.pacote;


//Exemplo de uma classe

public class Carro {
 // Atributos da classe Carro
 private String marca;
 private String modelo;
 private int ano;

 // Construtor da classe Carro
 public Carro(String marca, String modelo, int ano) {
     this.marca = marca;
     this.modelo = modelo;
     this.ano = ano;
 }

 // Métodos da classe Carro
 public String getMarca() {
     return marca;
 }

 public void setMarca(String marca) {
     this.marca = marca;
 }

 public String getModelo() {
     return modelo;
 }

 public void setModelo(String modelo) {
     this.modelo = modelo;
 }

 public int getAno() {
     return ano;
 }

 public void setAno(int ano) {
     this.ano = ano;
 }
}

