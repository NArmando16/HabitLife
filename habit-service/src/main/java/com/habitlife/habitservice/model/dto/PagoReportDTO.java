package com.habitlife.habitservice.model.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoReportDTO {
    private LocalDate date;
    private long pagoCount;
}
