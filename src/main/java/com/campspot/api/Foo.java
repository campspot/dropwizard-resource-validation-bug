package com.campspot.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

public class Foo {
    @NotBlank
    private final String name;

    @JsonCreator
    public Foo(
        @JsonProperty("name") String name
    ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
