package apis_simuladas;

public class ApiInstagram {
    public boolean publicarFoto(String caminhoImagem, String legenda) {
        System.out.println("API Instagram: Publicando foto de '" + caminhoImagem + "' com a legenda '" + legenda + "'...");
        // Simula um retorno de sucesso/falha.
        return true;
    }
}