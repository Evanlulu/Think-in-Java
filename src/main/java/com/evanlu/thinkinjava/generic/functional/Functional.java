package com.evanlu.thinkinjava.generic.functional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Functional {
    public static <T> T reduce(Iterable<T> seq, Combine<T> combiner){
        Iterator<T> it = seq.iterator();
        if (it.hasNext()){
            T result = it.next();
            while(it.hasNext())
                result = combiner.combine(result, it.next());
            return result;
        }
        return null;
    }

    public static <T> Collector<T> forEach(Iterable<T> seq, Collector<T> func){
        for (T t : seq)
            func.function(t);
        return func;
    }
    public static <R,T> List<R> transform(Iterable<T> seq, UnaryFunction<R,T> func ){
        List<R> result = new ArrayList<>();
        for (T t : seq) {
            result.add(func.function(t));
        }
        return result;
    }

    public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred ) {
        List<T> result = new ArrayList<>();
        for (T t : seq) {
            if (pred.test(t))
                result.add(t);
        }
        return result;
    }
}
