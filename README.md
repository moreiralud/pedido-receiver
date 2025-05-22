===================================
PEDIDO-RECEIVER - TECH CHALLENGE
===================================

Microsserviço responsável por receber eventos de novos pedidos e processá-los de forma assíncrona, integrando-se com o serviço de pedidos principal.

-------------------------------
📦 TECNOLOGIAS UTILIZADAS
-------------------------------
- Java 17
- Spring Boot
- Spring Web
- Spring Cloud Stream
- Apache Kafka (ou RabbitMQ)*
- Docker
- Maven
- Lombok

(*) Dependendo da configuração do projeto

-------------------------------
📁 ESTRUTURA DO PROJETO
-------------------------------
src/
├── main/
│   ├── java/
│   │   └── br.com.techchallenge.pedidoreceiver/
│   │       ├── application/    -> Listeners e controladores
│   │       ├── core/           -> Domínio e lógica de negócio
│   │       └── infrastructure/ -> Configurações e integração com mensageria
│   └── resources/
│       ├── application.yml     -> Configurações do serviço
│       └── ...                 -> Outros recursos
└── test/                       -> Testes unitários e de integração

-------------------------------
⚙️ COMO EXECUTAR LOCALMENTE
-------------------------------
1. Verifique se o Docker está instalado e rodando.
2. Certifique-se que o broker de mensagens (Kafka ou RabbitMQ) esteja configurado.
3. Execute:
   docker compose up --build

-------------------------------
📡 FUNCIONALIDADE PRINCIPAL
-------------------------------
- Consome mensagens de pedidos criados via mensageria.
- Processa os dados recebidos e aciona lógica relacionada a persistência ou integração com outros microsserviços.

-------------------------------
✅ TESTES
-------------------------------
Os testes estão em `src/test`.

Para executar:
> mvn test

Para gerar o relatório de cobertura:
> mvn jacoco:report

Acesse o relatório em:
target/site/jacoco/index.html

-------------------------------
📌 OBSERVAÇÕES
-------------------------------
- Este serviço é executado em background e não possui endpoints REST.
- Depende de um broker de mensageria configurado corretamente.
- Integra-se ao serviço de pedidos.

-------------------------------
👩‍💻 DESENVOLVIDO POR
-------------------------------
Ludmila Moreira - Tech Challenge 2025

