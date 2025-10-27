package apis_simuladas;

public class ApiTiktok {
    public String uploadVideo(String pathVideo, String descricao) {
        System.out.println("API TikTok: Fazendo upload do vídeo '" + pathVideo + "' com descrição '" + descricao + "'...");
        // Simula um retorno com o ID do vídeo.
        return "tiktok_video_uuid_abc-def";
    }
}