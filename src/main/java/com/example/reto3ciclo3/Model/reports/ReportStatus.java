package com.example.reto3ciclo3.Model.reports;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportStatus {
    private Integer completed;
    private Integer cancelled;
}
