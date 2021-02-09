package com.javaprojectone;

import java.util.ArrayList;
import java.util.List;

public interface Bag {

    public void add(Bag bag);

    public void remove(Bag bag);

    public void clear(Bag bag);
}
