package ch11;

/* Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the most
frequently occurring integer (the “mode”) occurs in the list.
Solve this problem using a map as auxiliary storage. If the list is empty, return 0. */

import java.util.*;

public class opg15
{
    public static void main(String[] args)
    {
        List<Integer> myList = new ArrayList<>();
        myList.add(9);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(4);
        myList.add(8);
        myList.add(7);
        myList.add(0);
        myList.add(9);

        System.out.println(MaxOccurrences(myList));
    }

    public static int MaxOccurrences (List<Integer> mySecondList)
    {
        Map<Integer, Integer> i = new HashMap<>();

        Iterator<Integer> itr = mySecondList.iterator();

        while (itr.hasNext())
        {
            int saveMyNumber = itr.next();

            if (i.containsKey(saveMyNumber))
            {
                i.put(saveMyNumber, i.get(saveMyNumber)+1);
            }
            else
                {
                    i.put(saveMyNumber, 1);
                }
        }

        int mostCommonNumber = 0;

        for (int howManyTimes : i.values())
        {
            if (howManyTimes > mostCommonNumber)
            {
                mostCommonNumber = howManyTimes;
            }
        }

        return mostCommonNumber;
    }
}
