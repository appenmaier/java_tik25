package model;

import java.util.Comparator;

/**
 * Comparator that orders {@link TableLight} objects by {@link PlugType} in descending natural order.
 *
 * <p>
 * Used with {@link java.util.Collections#sort} or {@link java.util.List#sort} to sort a list of
 * table lights from the highest to the lowest plug-type ordinal.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class TableLightByPlugTypeDescComparator implements Comparator<TableLight> {

   /**
    * Compares two {@link TableLight} objects by their {@link PlugType} in descending order.
    *
    * @param o1 the first table light
    * @param o2 the second table light
    * @return a negative integer, zero, or a positive integer if {@code o1}'s plug type is greater
    *         than, equal to, or less than {@code o2}'s plug type
    */
   @Override
   public int compare(TableLight o1, TableLight o2) {
      return o2.getPlugType().compareTo(o1.getPlugType());
   }

}
