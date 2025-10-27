package adaptadores;

import apis_simuladas.ApiLinkedin;
import modelos.Conteudo;
import modelos.ResultadoPublicacao;

public class LinkedinAdapter implements ISocialMediaAdapter {
    private final ApiLinkedin apiLinkedin;

    public LinkedinAdapter() {
        this.apiLinkedin = new ApiLinkedin();
    }

    @Override
    public ResultadoPublicacao postar(Conteudo conteudo) {
        int statusCode = apiLinkedin.submeterPostagem(conteudo.getTexto());

        if (statusCode == 200) {
            return new ResultadoPublicacao(true, "Postagem submetida no LinkedIn!", "linkedin_post_xyz");
        } else {
            return new ResultadoPublicacao(false, "Falha ao postar no LinkedIn.", null);
        }
    }
}