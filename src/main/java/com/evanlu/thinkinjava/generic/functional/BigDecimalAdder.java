package com.evanlu.thinkinjava.generic.functional;

import java.math.BigDecimal;

public class BigDecimalAdder implements Combiner<BigDecimal> {
    @Override
    public BigDecimal combine(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }
}
