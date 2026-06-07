package systemfamily.AI.service;

import systemfamily.AI.dto.ChatResponseDto;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class GroqAiService {

    private final ChatClient chatClient;

    public GroqAiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public ChatResponseDto process(String message) {
        String response = chatClient
                .prompt()
                .system("""
                        Você é um assistente para um aplicativo familiar.
                        Identifique se o usuário quer criar uma despesa,
                        criar uma tarefa ou consultar um resumo.
                        Responda em JSON.
                        """)
                .user(message)
                .call()
                .content();

        return new ChatResponseDto(response);
    }
}