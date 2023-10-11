package iphoneapp;

import aparelhoTelefonico.AparelhoTelefonico;
import aparelhoTelefonico.AparelhoTelefonicoImpl;
import navegadorInternet.NavegadorInternet;
import navegadorInternet.NavegadorInternetImpl;
import reprodutorMusical.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces
    @Override
    public void tocarMusica() {
        // Aqui você coloca o código para iniciar a reprodução de música
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        // Aqui você coloca o código para pausar a reprodução de música
        System.out.println(" Pausando música...");
    }

    @Override
    public void avancarMusica() {
        // Aqui você coloca o código para avancar a reprodução de música
        System.out.println(" Avancar música...");
    }

    @Override
    public void fazerChamada() {
        // Implemente o código para fazer uma chamada com o número fornecido.
        String numero = null;
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void enviarMensagem() {
        // Implemente o código para enviar uma mensagem para o destinatário fornecido.
        String destinatario = null;
        String mensagem = new String();
        System.out.println("Enviando mensagem para " + destinatario + ": " + mensagem);
    }

    /**
     * @param numero
     */
    public void fazerChamada(String numero) {

    }

    /**
     * @param mensagem
     * @param destinatario
     */
    public void enviarMensagem(String mensagem, String destinatario) {

    }

    @Override
    public void abrirBrowser() {
        // Implemente o código para abrir o navegador da Internet.
        System.out.println("Navegador de Internet aberto.");
    }

    @Override
    public void fecharBrowser() {
        // Implemente o código para fechar o navegador da Internet.
        System.out.println("Navegador de Internet fechado.");
    }

    @Override
    public void navegar(String url) {

    }

    @Override
    public void navegar() {
        // Implemente o código para navegar para a URL fornecida.
        String url = new String();
        Object paginaAtual = url;
        System.out.println("Navegando para: " + url);
    }

    public static void main(String[] args) {
        AparelhoTelefonico aparelho = new AparelhoTelefonicoImpl();
        aparelho.fazerChamada("1234567890");
        aparelho.enviarMensagem("Olá, mundo!", "987654321");

        NavegadorInternet navegador = new NavegadorInternetImpl();
        navegador.abrirBrowser();
        navegador.navegar("https://www.example.com");
        navegador.fecharBrowser();

    }





}
