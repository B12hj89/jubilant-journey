package aparelhoTelefonico;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void fazerChamada() {

    }

    @Override
    public void enviarMensagem() {

    }

    @Override
    public void fazerChamada(String numero) {
        // Implemente o código para fazer uma chamada com o número fornecido.
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void enviarMensagem(String mensagem, String destinatario) {
        // Implemente o código para enviar uma mensagem para o destinatário fornecido.
        System.out.println("Enviando mensagem para " + destinatario + ": " + mensagem);
    }
}
