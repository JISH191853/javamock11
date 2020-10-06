//REQUIREMENT 5 

package javamock11;
import java.util.Comparator;

public class StartingDateComparator implements Comparator<Object>
{

	@Override
	public int compare(Object arg0, Object arg1) {
		College obj0=(College)arg0;
		College obj1=(College)arg1;
		return obj0.getStartingDate().compareTo(obj1.getStartingDate());
	}

}
