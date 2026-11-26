package org.msa.msa5spring.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Employee {
    private Long empId;
    private String name;
    private LocalDate birth;
    private Character gender;
    private LocalDate hireAt;
    private LocalDate fireAt;
    private Long supId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
