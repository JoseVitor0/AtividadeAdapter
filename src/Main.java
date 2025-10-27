import adaptadores.ISocialMediaAdapter;
import fabricas.SocialMediaFabrica;
import fabricas.TipoRedeSocial;
import modelos.Conteudo;
import modelos.ResultadoPublicacao;

public class Main {

    public static void main(String[] args) {
        System.out.println("|Sistema de Gerenciamento de Mídias Sociais|");

        TipoRedeSocial redeSocialAlvo = TipoRedeSocial.TWITTER;

        Conteudo meuConteudo = new Conteudo(
                "Olá mundo! Esta é minha primeira postagem nessa rede!",
                "/caminho/para/minha/imagem.jpg"
        );

        System.out.println("\n>> Tentando postar no: " + redeSocialAlvo);
        ISocialMediaAdapter gerenciador = SocialMediaFabrica.criarAdapter(redeSocialAlvo);

        ResultadoPublicacao resultado = gerenciador.postar(meuConteudo);
        System.out.println(">> Resposta Unificada: " + resultado);

        System.out.println("--------------------------------------------------");

        // Postando no Instagram ---
        redeSocialAlvo = TipoRedeSocial.INSTAGRAM;

        System.out.println("\n>> Mudando a configuração para: " + redeSocialAlvo);
        gerenciador = SocialMediaFabrica.criarAdapter(redeSocialAlvo);
        resultado = gerenciador.postar(meuConteudo);
        System.out.println(">> Resposta Unificada: " + resultado);

        System.out.println("--------------------------------------------------");

        // Postando no LinkedIn ---
        redeSocialAlvo = TipoRedeSocial.LINKEDIN;

        System.out.println("\n>> Mudando a configuração para: " + redeSocialAlvo);
        gerenciador = SocialMediaFabrica.criarAdapter(redeSocialAlvo);
        resultado = gerenciador.postar(meuConteudo);
        System.out.println(">> Resposta Unificada: " + resultado);
    }
}