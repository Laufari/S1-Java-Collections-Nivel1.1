//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashSet;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        MonthListManager manager = new MonthListManager();

        ArrayList<Month> months = manager.createMonthsList();

        months = manager.insertAugust(months);

        manager.printMonthsWhithIterator(months);

        HashSet<Month> monthsSet = manager.convertToHashSet(months);
        System.out.println("\nHashSet (no duplicates):");
        for (Month month : monthsSet)
        {
            System.out.println(month);
        }
    }
}