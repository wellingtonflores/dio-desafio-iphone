package DesafioIphone;

import DesafioIphone.AparelhoTelefonico.iPhone;
import DesafioIphone.Musica.ReprodutorMusical;

public class Pessoa {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.iniciarCorreioDeVoz();
        iphone.atender();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.ligar("51981633681");
        iphone.escolherMusica("RITMO BARULHENTO");
        iphone.tocar();
        iphone.pausar();
    }
}
