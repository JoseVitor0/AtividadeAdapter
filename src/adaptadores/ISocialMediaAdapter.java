package adaptadores;

import modelos.Conteudo;
import modelos.ResultadoPublicacao;

public interface ISocialMediaAdapter {
    ResultadoPublicacao postar(Conteudo conteudo);
}