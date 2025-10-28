# José Vitor Gonçalves
# 30654114


README: Sistema de Gerenciamento Unificado de Redes Sociais
1. Objetivo
Este projeto demonstra a implementação de um sistema que gerencia múltiplas APIs de redes sociais através de uma interface unificada.

O desafio está na diferença de dados entre as APIs, cada uma tem seus próprios métodos e modelos de dados. O objetivo é criar uma arquitetura flexível que abstrai essa complexidade, aplicando os padrões de projeto vistos em aula.

2. Padrões Aplicados
Padrão Adapter: É o núcleo da solução. Atua como um tradutor que conecta a interface unificada do nosso sistema às interfaces incompatíveis das APIs externas. Cada adapter "envelopa" uma API e traduz a chamada postar() genérica para a chamada específica que a API espera.

Padrão Factory Method: É usado para criar o adapter correto de forma dinâmica. A SocialMediaFactory centraliza a lógica de decisão, permitindo ao sistema selecionar qual adapter instanciar com base em uma configuração, sem que o código principal precise conhecer as classes concretas.

Modelo de Resposta Unificado: A classe ResultadoPublicacao garante que, independentemente da API usada, o sistema principal sempre receba um objeto de resposta com uma estrutura padronizada.

3. Estrutura do Projeto
O código é organizado por responsabilidade:

/apis_simuladas:

Classes que simulam as APIs externas (ex: ApiTwitter.java), cada uma com métodos diferentes.

/modelos:

Conteudo.java: (DTO) Dados genéricos de entrada para a postagem.

ResultadoPublicacao.java: (DTO) Dados padronizados da resposta.

/adaptadores:

ISocialMediaAdapter.java: A interface-alvo unificada que o sistema utiliza.

TwitterAdapter.java, InstagramAdapter.java, etc.: As implementações do Adapter, que fazem a "tradução" para as APIs.

/fabrica:

SocialMediaFactory.java: Centraliza a criação dos adapters.

TipoRedeSocial.java: Enum usado para a configuração da fábrica.

Main.java:

O "Cliente" (ponto de entrada) que utiliza a fábrica e a interface unificada para fazer as postagens.
