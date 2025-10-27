package adaptadores;

import apis_simuladas.ApiTiktok;
import modelos.Conteudo;
import modelos.ResultadoPublicacao;

public class TiktokAdapter implements ISocialMediaAdapter {
    private final ApiTiktok apiTiktok;

    public TiktokAdapter() {
        this.apiTiktok = new ApiTiktok();
    }

    @Override
    public ResultadoPublicacao postar(Conteudo conteudo) {
        // Para o TikTok, vamos assumir que a URL da imagem é o "caminho do vídeo"
        String idVideo = apiTiktok.uploadVideo(conteudo.getUrlImagem(), conteudo.getTexto());

        return new ResultadoPublicacao(true, "Vídeo enviado para o TikTok!", idVideo);
    }
}