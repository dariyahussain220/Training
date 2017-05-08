package fridaytest2;

public class GradeFinding {

	public String printGrade(Student s1) {

		int marks = s1.getScore();
		if (marks > 100)
			return "invalid marks";
		else if (marks > 80 || (marks == 80 && s1.getAttendance() >= 75))
			return "Grade A";
		else if (marks > 60 && marks < 80
				|| (marks == 80 && s1.getAttendance() <= 75)
				|| (marks == 60 && !s1.isTalkative()))
			return "Grade B";
		else if (marks < 60 || (marks == 60 && s1.isTalkative()))
			return "Grade C";

		return "No negatives";

	}
}
