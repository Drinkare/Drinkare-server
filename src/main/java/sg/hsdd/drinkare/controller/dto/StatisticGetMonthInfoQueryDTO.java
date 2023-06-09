package sg.hsdd.drinkare.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StatisticGetMonthInfoQueryDTO {
    private Long userId;
    private Long year;
    private Long month;
}
