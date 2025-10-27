package fabricas;

import adaptadores.*;

public class SocialMediaFabrica {

    // Este é o nosso Factory Method.
    public static ISocialMediaAdapter criarAdapter(TipoRedeSocial tipo) {
        switch (tipo) {
            case TWITTER:
                return new TwitterAdapter();
            case INSTAGRAM:
                return new InstagramAdapter();
            case LINKEDIN:
                return new LinkedinAdapter();
            case TIKTOK:
                return new TiktokAdapter();
            default:
                throw new IllegalArgumentException("Tipo de rede social desconhecido.");
        }
    }
}