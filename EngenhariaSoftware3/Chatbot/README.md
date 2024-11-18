## Chatbot Telegram em Java

Este projeto implementa um chatbot para Telegram utilizando a API oficial de bots. O bot responde automaticamente às mensagens enviadas pelos usuários.

### Pré-requisitos
Antes de rodar o projeto, certifique-se de que você tem os seguintes itens instalados:

1. Java Development Kit (JDK) 8 ou superior.
2. Apache Maven para gerenciar as dependências.
3. Uma conta no Telegram e um Bot Token gerado via BotFather.

### Como Rodar o Projeto

1. **Clone o repositório** ou faça o download dos arquivos.

2. **Configure o Token do Bot**.
   - Abra o arquivo Main.java
   - Coloque o seu token fornecido pelo BotFather
     
4. **Compile o projeto**. Use o Maven para compilar o código:
   ```bash
   cd EngenhariaSoftware3
   ```
   ```bash
   cd Chatbot
   ```
   ```bash
   mvn clean compile
   ```

5. **Execute o Bot**.
   ```bash
   mvn exec:java
   ```

6. **Teste o Bot**.
   - Abra o Telegram e procure pelo bot pelo nome de usuário que você definiu no BotFather.
   - Envie mensagens para o bot e veja as respostas automáticas.
   
