import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MonthListManager {
    public ArrayList<Month> createMonthsList() {
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
        return months;
    }

    public ArrayList<Month> insertAugust(ArrayList<Month> months)
    {
        months.add(7, new Month("August"));
        return months;
    }

    public HashSet<Month> convertToHashSet(ArrayList<Month> months)
    {
        return new HashSet<>(months);
    }

    public void printMonthList(ArrayList<Month> months)
    {
        for (Month month : months)
        {
            System.out.println(month);
        }
    }

    public void printMonthsWhithIterator(ArrayList<Month> months)
    {
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}