package systemfamily.AI.controller;

import systemfamily.AI.dto.ChatRequestDto;
import systemfamily.AI.dto.ChatResponseDto;
import systemfamily.AI.service.GroqAiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ia")
public class GroqAiController {

    private final GroqAiService groqAiService;

    public GroqAiController(GroqAiService groqAiService) {
        this.groqAiService = groqAiService;
    }

    @PostMapping("/chat")
    public ChatResponseDto chat(@RequestBody ChatRequestDto request) {
        return groqAiService.perguntar(request.getMessage());
    }
}
