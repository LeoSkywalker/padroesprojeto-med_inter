package padroescomportamentais.mediator;

public interface Departamento {
    String receberDuvida(String msg);
    String receberRequisicaoServico(String msg);
    String receberAvaliacaoServico (String msg);
}
