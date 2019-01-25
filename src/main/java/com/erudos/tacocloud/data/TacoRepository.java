package com.erudos.tacocloud.data;

import com.erudos.tacocloud.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
