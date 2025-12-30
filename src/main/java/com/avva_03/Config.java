package com.avva_03;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> ifc);
}
