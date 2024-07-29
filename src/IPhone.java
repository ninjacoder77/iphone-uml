public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioPorVoz() {
        System.out.println("INiciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo pagina:  " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void tocar() {
        System.out.println("REproduzindo musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
}
