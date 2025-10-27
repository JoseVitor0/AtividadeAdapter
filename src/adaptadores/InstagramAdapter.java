package adaptadores;

import apis_simuladas.ApiInstagram;
import modelos.Conteudo;
import modelos.ResultadoPublicacao;

public class InstagramAdapter implements ISocialMediaAdapter {
    private final ApiInstagram apiInstagram;

    public InstagramAdapter() {
        this.apiInstagram = new ApiInstagram();
    }

    @Override
    public ResultadoPublicacao postar(Conteudo conteudo) {
        boolean sucesso = apiInstagram.publicarFoto(conteudo.getUrlImagem(), conteudo.getTexto());

        if (sucesso) {
            return new ResultadoPublicacao(true, "Foto publicada no Instagram!", "instagram_post_67890");
        } else {
            return new ResultadoPublicacao(false, "Falha ao publicar no Instagram.", null);
        }
    }
}