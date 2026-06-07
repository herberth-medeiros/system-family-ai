package systemfamily.AI.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class AiCommandResponseDto {

  private String action;

  private String description;

  private BigDecimal amount;

  private String category;

  private LocalDate date;

  private String taskTitle;

  private LocalDate dueDate;

}
