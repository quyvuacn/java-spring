package com.example.springschool.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class CommonProperties {
    @Value("10")
    private Integer defaultPageSize;
    @Value("0")
    private Integer defaultPageNumber;
}