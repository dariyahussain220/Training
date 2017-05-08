package fridaytest2;

public class Student {
	
	private int score;
	private int attendance;
	private boolean talkative;
	
	public Student(int score, int attendance, boolean talkative){
		this.score=score;
		this.attendance=attendance;
		this.talkative=talkative;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public boolean isTalkative() {
		return talkative;
	}
	public void setTalkative(boolean studying) {
		this.talkative = studying;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	
}
