//REQUIREMENT 5

package javamock11;

import java.util.Comparator;
 

public class DepartmentComparator implements Comparator<Object>
{

	@Override
	public int compare(Object arg0, Object arg1) {
		College dc0=(College)arg0;
		College dc1=(College)arg1;
		return dc0.getNo_of_dept()-(dc1.getNo_of_dept());
	}

}
