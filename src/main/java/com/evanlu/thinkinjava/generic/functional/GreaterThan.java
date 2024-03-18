package com.evanlu.thinkinjava.generic.functional;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.List;

import static com.evanlu.thinkinjava.generic.functional.Functional.*;

public class GreaterThan <T extends Comparable<T>> implements UnaryPredicate<T>{
    private T bound;

    public GreaterThan(T bound) {
        this.bound = bound;
    }

    @Override
    public boolean test(T x) {
        return x.compareTo(bound) > 0;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Integer result = reduce(li, new IntegerAddr());
        System.out.println(result);

        Integer reduce = reduce(li, new IntegerSubracter());
        System.out.println(reduce);

        System.out.println(filter(li, new GreaterThan<>(4)));

        MathContext mathContext = new MathContext(7);
        List<BigDecimal> list = Arrays.asList(new BigDecimal(1.1, mathContext), new BigDecimal(2.2, mathContext));
        BigDecimal reduce1 = reduce(list, new BigDecimalAdder());
        System.out.println(reduce1);
    }
}
