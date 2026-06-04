package bookstore.AI.dto;

import lombok.Data;

@Data
public class ChatResponseDto {

    private String response;

    public ChatResponseDto(String resposta) {
        this.response = resposta;
    }
}
