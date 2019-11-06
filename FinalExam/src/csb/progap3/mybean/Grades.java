package csb.progap3.mybean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Grades {

	private float midtermAttendance;
	private float midtermExercises;
	private float midtermQuizzes;
	private float midtermProject;
	private float midtermExam;
	private float preFinalAttendance;
	private float preFinalExercises;
	private float preFinalQuizzes;
	private float preFinalProject;
	private float preFinalExam;
	private float midtermGrade;
	private float preFinalGrade;
	private float finalGrade;
	
	

	
	public float getMidtermAttendance() {
		return midtermAttendance;
	}




	public void setMidtermAttendance(float midtermAttendance) {
		this.midtermAttendance = midtermAttendance;
	}




	public float getMidtermExercises() {
		return midtermExercises;
	}




	public void setMidtermExercises(float midtermExercises) {
		this.midtermExercises = midtermExercises;
	}




	public float getMidtermQuizzes() {
		return midtermQuizzes;
	}




	public void setMidtermQuizzes(float midtermQuizzes) {
		this.midtermQuizzes = midtermQuizzes;
	}




	public float getMidtermProject() {
		return midtermProject;
	}




	public void setMidtermProject(float midtermProject) {
		this.midtermProject = midtermProject;
	}




	public float getMidtermExam() {
		return midtermExam;
	}




	public void setMidtermExam(float midtermExam) {
		this.midtermExam = midtermExam;
	}




	public float getPreFinalAttendance() {
		return preFinalAttendance;
	}




	public void setPreFinalAttendance(float preFinalAttendance) {
		this.preFinalAttendance = preFinalAttendance;
	}




	public float getPreFinalExercises() {
		return preFinalExercises;
	}




	public void setPreFinalExercises(float preFinalExercises) {
		this.preFinalExercises = preFinalExercises;
	}




	public float getPreFinalQuizzes() {
		return preFinalQuizzes;
	}




	public void setPreFinalQuizzes(float preFinalQuizzes) {
		this.preFinalQuizzes = preFinalQuizzes;
	}




	public float getPreFinalProject() {
		return preFinalProject;
	}




	public void setPreFinalProject(float preFinalProject) {
		this.preFinalProject = preFinalProject;
	}




	public float getPreFinalExam() {
		return preFinalExam;
	}




	public void setPreFinalExam(float preFinalExam) {
		this.preFinalExam = preFinalExam;
	}




	public float getMidtermGrade() {
		return midtermGrade;
	}




	public void setMidtermGrade(float midtermGrade) {
		this.midtermGrade = midtermGrade;
	}




	public float getPreFinalGrade() {
		return preFinalGrade;
	}




	public void setPreFinalGrade(float preFinalGrade) {
		this.preFinalGrade = preFinalGrade;
	}




	public float getFinalGrade() {
		return finalGrade;
	}




	public void setFinalGrade(float finalGrade) {
		this.finalGrade = finalGrade;
	}




	public String compute() {
		
		midtermGrade = (float) ((midtermAttendance * 0.10) + (midtermExercises * 0.20) + (midtermQuizzes * 0.25)
				+ (midtermProject * 0.20) + (midtermExam * 0.25));
		
		preFinalGrade = (float) ((preFinalAttendance * 0.10) + (preFinalExercises * 0.20) + (preFinalQuizzes * 0.25)
				+ (preFinalProject * 0.20) + (preFinalExam * 0.25));
		
		finalGrade = (float) ((midtermGrade * .50) + (preFinalGrade * .50));
		
		return "results";
		
	}
	
	
}
