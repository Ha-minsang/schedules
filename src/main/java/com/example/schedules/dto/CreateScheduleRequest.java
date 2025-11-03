package com.example.schedules.dto;

import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class CreateScheduleRequest {

    private String title;
    private String content;
    private String writer;
    private String password;
}
