package OOPS_2;
import java.util.*;
public class Cars_comparator_speed implements Comparator<Cars_comparator>{


	@Override
	public int compare(Cars_comparator o1, Cars_comparator o2) {
		// TODO Auto-generated method stub
		return o1.speed-o2.speed;
	}


	

}
