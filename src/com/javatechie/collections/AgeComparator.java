package com.javatechie.collections;

import java.util.Comparator;

class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User p1, User p2) {
        return Integer.compare(p1.getAge(), p2.getAge()); // Ascending order
    }
}