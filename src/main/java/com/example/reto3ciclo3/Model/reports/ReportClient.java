package com.example.reto3ciclo3.Model.reports;

import com.example.reto3ciclo3.Model.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportClient {

    private Long total;
    private Client client;
}
