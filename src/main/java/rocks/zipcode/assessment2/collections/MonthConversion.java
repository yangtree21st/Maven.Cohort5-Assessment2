package rocks.zipcode.assessment2.collections;

import java.time.Month;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion  {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    Integer monthNumber;
    String monthName;
    Map<Integer,String> month = new TreeMap<>();


    public void add(Integer monthNumber, String monthName) {
      month.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

//        throw new NullPointerException();
       return month.get(monthNumber);

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {

        for (Integer key : month.keySet()) {
            if (monthName.equals(month.get(key))) {
                return key;
            }

        }
        return 0;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        for(Integer key : month.keySet()){
            if(!monthNumber.equals(month.get(key))) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if (!month.values().contains(monthName)){
            return false;
        }
        return true;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return month.entrySet().size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
         month.put(monthNumber,monthName);
    }
}
