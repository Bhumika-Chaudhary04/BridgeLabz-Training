package StreamBuzz;
import java.util.*;
public class CreatorStats {
	private String CreatorName;
	private List<Double> weeklyLikes;
	public static List<CreatorStats> engagementBoard=new ArrayList<>();
	public CreatorStats(String CreatorName,List<Double> weeklyLikes) {
		this.CreatorName=CreatorName;
		this.weeklyLikes=weeklyLikes;
	}
	public String getCreatorName() {
	    return CreatorName;
	}

	public List<Double> getWeeklyLikes() {
	     return weeklyLikes;
	}
}
