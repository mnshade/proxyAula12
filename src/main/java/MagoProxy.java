import java.util.List;

public class MagoProxy implements IMago {
    private Mago mago;

    private int digitoUnico;

    public MagoProxy(int digitoUnico) {
        this.digitoUnico = digitoUnico;
    }
    @Override
    public List<String> obterDadosdoMago(){
        if(this.mago == null){
            this.mago = new Mago(this.digitoUnico);
        }
        return this.mago.obterDadosdoMago();
    }
    @Override
    public List<Float>obterPoderMagico(MestreDosMagos mestreDosMagos){
        if (!mestreDosMagos.isAdministrador()) {
            throw new IllegalArgumentException("Têm certeza que é um mago? Se liga na origem do seu nome.");
        }
        if(this.mago == null){
            this.mago = new Mago(this.digitoUnico);
        }
        return this.mago.obterPoderMagico(mestreDosMagos);
    }
}
