package funcContract.entities;

public class FazerContratoPadrao {

    private String nome;
    private Integer hora;
    private Integer valuePerHour;

    public FazerContratoPadrao() {
    }

    public FazerContratoPadrao(Integer valuePerHour, Integer hora, String nome) {
        this.valuePerHour = valuePerHour;
        this.hora = hora;
        this.nome = nome;
    }

    public int getPagamento()  {
        return hora * valuePerHour;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValHora() {
        return valuePerHour;
    }

    public void setValHora(Integer valHora) {
        this.valuePerHour = valHora;
    }
}
