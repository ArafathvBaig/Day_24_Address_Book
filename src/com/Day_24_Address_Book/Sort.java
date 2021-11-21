package com.Day_24_Address_Book;

import java.util.Comparator;

public class Sort {
    static Comparator<Contacts> compareFirstName = new Comparator<>() {
        public int compare(Contacts one, Contacts two) {
            return one.getFirstName().compareTo(two.getFirstName());
        }
    };
}