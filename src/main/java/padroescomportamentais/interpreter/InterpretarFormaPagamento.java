package padroescomportamentais.interpreter;

public class InterpretarFormaPagamento implements Interpretador{

    public String interpretar(String txt) {

        String resultInterpretador = null;

        if(txt.equals("Debito")){
            FormaPagamento pagamento = new FormaPagamento();
            pagamento.setTxt(txt);
            pagamento.interpretar(txt);
            resultInterpretador = pagamento.getTxt();
        }else if (txt.equals("Credito")){
            FormaPagamento pagamento = new FormaPagamento();
            pagamento.setTxt(txt);
            pagamento.interpretar(txt);
            resultInterpretador = pagamento.getTxt();
        }else {
            throw new IllegalArgumentException("Forma de pagamento não existente.");
        }
        return resultInterpretador;
    }
}
