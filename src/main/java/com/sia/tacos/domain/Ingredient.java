package com.sia.tacos.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

@Data
public class Ingredient implements Persistable<String> {

    @Id
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    @Override
    public boolean isNew() {
        return true;
    }
}
