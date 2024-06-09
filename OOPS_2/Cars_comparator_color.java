package OOPS_2;

import java.util.Comparator;

public class Cars_comparator_color implements Comparator<Cars_comparator>{

	@Override
	public int compare(Cars_comparator o1, Cars_comparator o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);
	}



}
