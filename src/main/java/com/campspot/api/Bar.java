package com.campspot.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Bar {
    @NotNull
    @Min(1)
    private final Integer number;

    @JsonCreator
    public Bar(
        @JsonProperty("number") Integer number
    ) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
