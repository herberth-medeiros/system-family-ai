package bookstore.AI.service;

import bookstore.AI.dto.ChatResponseDto;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class GroqAiService {

    private final ChatClient chatClient;

    public GroqAiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public ChatResponseDto perguntar(String mensagem) {
        String resposta = chatClient
                .prompt()
                .user(mensagem)
                .call()
                .content();

        return new ChatResponseDto(resposta);
    }
}