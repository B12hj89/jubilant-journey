package aparelhoTelefonico;

public interface AparelhoTelefonico {
    void fazerChamada();

    void enviarMensagem();

    void fazerChamada(String numero);

    void enviarMensagem(String mensagem, String destinatario);
}
