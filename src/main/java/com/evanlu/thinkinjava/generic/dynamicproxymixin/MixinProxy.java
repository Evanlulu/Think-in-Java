package com.evanlu.thinkinjava.generic.dynamicproxymixin;

import com.evanlu.thinkinjava.generic.decorator.Basic;
import com.evanlu.thinkinjava.generic.decorator.SerialNumbered;
import com.evanlu.thinkinjava.generic.decorator.TimeStamped;
import com.evanlu.thinkinjava.generic.mix.BasicImp;
import com.evanlu.thinkinjava.generic.mix.SerialNumberedImp;
import com.evanlu.thinkinjava.generic.mix.TimeStampedImp;
import com.evanlu.thinkinjava.generic.tuple.TwoTuple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MixinProxy implements InvocationHandler {

    Map<String, Object> delegatesByMethod;

    public MixinProxy(TwoTuple<Object,Class<?>>...pairs) {
        delegatesByMethod = new HashMap<>();
        for (TwoTuple<Object, Class<?>> pair : pairs) {
            for (Method method : pair.second.getMethods()) {
                String name = method.getName();
                if (!delegatesByMethod.containsKey(name)){
                    delegatesByMethod.put(name, pair.first);
                }
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate = delegatesByMethod.get(methodName);
        return method.invoke(delegate, args);
    }
    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple... pairs){
        Class[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            interfaces[i] = (Class) pairs[i].second;
        }
        ClassLoader c1 = pairs[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(c1, interfaces, new MixinProxy(pairs));
    }
    public class DynamocProxyMixin{
        public static void main(String[] args) {
            Object mixin = MixinProxy.newInstance(
                    new TwoTuple<>(new BasicImp(), Basic.class),
                    new TwoTuple<>(new TimeStampedImp(), TimeStamped.class),
                    new TwoTuple<>(new SerialNumberedImp(), SerialNumbered.class)
            );
            Basic b = (Basic) mixin;
            TimeStamped t = (TimeStamped) mixin;
            SerialNumbered s = (SerialNumbered)mixin;
            System.out.println(b.get());
            System.out.println(t.getTimeStamp());
            System.out.println(s.getSerialNumber());

        }
    }
}
