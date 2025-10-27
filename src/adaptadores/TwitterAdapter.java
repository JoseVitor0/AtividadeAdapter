package adaptadores;

import apis_simuladas.ApiTwitter;
import modelos.Conteudo;
import modelos.ResultadoPublicacao;

public class TwitterAdapter implements ISocialMediaAdapter {
    private final ApiTwitter apiTwitter;

    public TwitterAdapter() {
        this.apiTwitter = new ApiTwitter();
    }

    @Override
    public ResultadoPublicacao postar(Conteudo conteudo) {
        String idTweet = apiTwitter.postarTweet(conteudo.getTexto());

        return new ResultadoPublicacao(true, "Tweet postado com sucesso!", idTweet);
    }
}