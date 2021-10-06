import java.util.Arrays;
import java.util.List;

public class Mago implements IMago{
    private int digitoUnico;
    private String nome;
    private String tipoAptidao;
    private float poderMagico;

    public Mago(int digitoUnico) {
        this.digitoUnico = digitoUnico;
        Mago objeto = BD.getMago(digitoUnico);
        this.nome = objeto.nome;
        this.tipoAptidao = objeto.tipoAptidao;
        this.poderMagico = objeto.poderMagico;

    }
    public Mago(int digitoUnico, String nome, String tipoAptidao, float poderMagico) {
        this.digitoUnico = digitoUnico;
        this.nome = nome;
        this.tipoAptidao = tipoAptidao;
        this.poderMagico = poderMagico;
    }


    public int getDigitoUnico(){
        return digitoUnico;
    }
    @Override
    public List<String> obterDadosdoMago(){
        return Arrays.asList(this.nome,this.tipoAptidao);
    }
    @Override
    public List<Float> obterPoderMagico(MestreDosMagos mestreDosMagos){
        return Arrays.asList(this.poderMagico);
    }
}
