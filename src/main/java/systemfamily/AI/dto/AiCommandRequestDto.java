package systemfamily.AI.dto;

import lombok.Data;

@Data
public class AiCommandRequestDto {

  private String message;

  private Long familyId;

  private Long userId;

}
