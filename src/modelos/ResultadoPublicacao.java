package modelos;

public class ResultadoPublicacao {
    private boolean sucesso;
    private String mensagem;
    private String idPublicacao;

    public ResultadoPublicacao(boolean sucesso, String mensagem, String idPublicacao) {
        this.sucesso = sucesso;
        this.mensagem = mensagem;
        this.idPublicacao = idPublicacao;
    }

    @Override
    public String toString() {
        return "ResultadoPublicacao {" +
                "sucesso=" + sucesso +
                ", mensagem='" + mensagem + '\'' +
                ", idPublicacao='" + idPublicacao + '\'' +
                '}';
    }
}