package com.evanlu.thinkinjava.generic.functional;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongAdder implements Combiner<AtomicLong> {
    @Override
    public AtomicLong combine(AtomicLong x, AtomicLong y) {
        return new AtomicLong(x.addAndGet(y.get()));
    }
}
