package padroescomportamentais.interpreter;

public class Texto implements Interpretador {

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
