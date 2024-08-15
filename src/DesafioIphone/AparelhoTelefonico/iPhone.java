package DesafioIphone.AparelhoTelefonico;

import DesafioIphone.Ligacao.AparelhoTelefonico;
import DesafioIphone.Musica.ReprodutorMusical;
import DesafioIphone.NavegacaoInternet.NavegadorNaInternet;

public class iPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void escolherMusica(String musica) {
        System.out.println("Escolhendo a música: " + musica);
    }
}
