package com.avva_02;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> ifc);
}
