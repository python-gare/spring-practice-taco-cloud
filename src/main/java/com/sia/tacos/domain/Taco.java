package com.sia.tacos.domain;

import java.util.List;
import lombok.Data;

/**
 *
 * @author manic
 */
@Data
public class Taco {

    private String name;
    private List<Ingredient> ingredient;
    
}
