package apis_simuladas;

public class ApiTwitter {
    public String postarTweet(String textoTweet) {
        System.out.println("API Twitter: Postando tweet '" + textoTweet + "'...");
        // Simula o retorno de um ID de tweet.
        return "tweet_id_12345";
    }
}