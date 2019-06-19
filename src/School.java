public class School {
	public String oralDefense(Student oralDefenser) {
		String status = "Students: " + oralDefenser.getStuID() + ", Thesis: " + oralDefenser.getThesisName();
		System.out.println(status);
		return status;
	}
}
