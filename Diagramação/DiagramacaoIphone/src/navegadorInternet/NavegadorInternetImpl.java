package navegadorInternet;

public class NavegadorInternetImpl implements NavegadorInternet {
    private String paginaAtual;

    public NavegadorInternetImpl() {
        paginaAtual = "Página inicial";
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
        // Implemente o código para navegar para a URL fornecida.
        paginaAtual = url;
        System.out.println("Navegando para: " + url);
    }

    /**
     *
     */
    @Override
    public void navegar() {

    }

    public String getPaginaAtual() {
        return paginaAtual;
    }
}
