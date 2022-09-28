package Model;

public class Pagamento {
    float pix ;
    boolean cartaoCredito;
    boolean cartaoDebito;

    public Pagamento(float pix, boolean cartaoCredito, boolean cartaoDebito) {
        this.pix = pix;
        this.cartaoCredito = cartaoCredito;
        this.cartaoDebito = cartaoDebito;
    }

    public float getPix() {
        return pix;
    }

    public void setPix(float pix) {
        this.pix = pix;
    }

    public boolean isCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(boolean cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public boolean isCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(boolean cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "pix=" + pix +
                ", cartaoCredito=" + cartaoCredito +
                ", cartaoDebito=" + cartaoDebito +
                '}';
    }
}
