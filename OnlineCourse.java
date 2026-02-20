class OnlineCourse extends Course
 {
public void joinLiveSession() { 
System.out.println("Joined live session"); 
}
public void submitAssignment() { 
System.out.println("Submitted assignment through online"); 
}
public static void main(String[] args) {
Course course = new OnlineCourse();
course.enroll();
course.drop();
if (course instanceof OnlineCourse) {
OnlineCourse onlinecourse = (OnlineCourse) course;
onlinecourse.joinLiveSession();
onlinecourse.submitAssignment();
} else {
System.out.println("not an OnlineCourse");
}
}
}