package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public interface Bag<T> {

    public void add(T t);

    public void remove(T t);

    public void clear();
}
