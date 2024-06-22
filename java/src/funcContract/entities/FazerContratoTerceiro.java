package funcContract.entities;

public class FazerContratoTerceiro extends FazerContratoPadrao {


    private Integer valIntegral;


    public FazerContratoTerceiro() {
        super();
    }

    public FazerContratoTerceiro(Integer valuePerHour, Integer hora, String nome, int terceiro) {
        super(valuePerHour, hora, nome);
        this.valIntegral = terceiro;
    }

    public FazerContratoTerceiro(int valuePerHour, int hora, String nome) {
    }


    public Integer getValIntegral() {
        return valIntegral;
    }

    public void setValIntegral(Integer valIntegral) {
        this.valIntegral = valIntegral;
    }

    @Override
    public int getPagamento()  {
        return (int) (super.getPagamento() * 1.1);
    }

}
