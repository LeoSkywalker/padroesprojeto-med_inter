package padroescomportamentais.interpreter;

public class FormaPagamento implements Interpretador{

    private String txt;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String interpretar(String txt) {
        return txt;
    }
}
