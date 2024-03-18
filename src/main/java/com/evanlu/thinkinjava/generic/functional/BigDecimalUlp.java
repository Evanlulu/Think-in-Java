package com.evanlu.thinkinjava.generic.functional;

import java.math.BigDecimal;

public class BigDecimalUlp implements UnaryFunction<BigDecimal, BigDecimal>{
    @Override
    public BigDecimal function(BigDecimal x) {
        return x.ulp();
    }
}
