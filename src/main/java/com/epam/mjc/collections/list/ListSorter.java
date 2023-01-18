package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter
{
    public void sort(List<String> sourceList)
    {
        Collections.sort(sourceList, new ListComparator());

    }
}

class ListComparator implements Comparator<String>
{
    @Override
    public int compare(String a, String b)
    {
        double aValue = 5 * Math.pow(Integer.parseInt(a), 2) + 3;
        double bValue = 5 * Math.pow(Integer.parseInt(b), 2) + 3;

        if (aValue != bValue){
            return Double.compare(aValue, bValue);
        } else {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        }
    }
}

