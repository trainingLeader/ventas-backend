package com.Ventas.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class SaveCategory implements Serializable {
    @NotBlank
    private String name;

}
