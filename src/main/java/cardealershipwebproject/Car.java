package cardealershipwebproject;

//CAR BEAN
public class Car {
	String ModelNumber, YearofProduction, DownPayment, MonthlyPayment, Duration_in_months;

	public Car() {

	}

	public String getModelNumber() {
		return ModelNumber;
	}

	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
	}

	public String getYearofProduction() {
		return YearofProduction;
	}

	public void setYearofProduction(String yearofProduction) {
		YearofProduction = yearofProduction;
	}

	public String getDownPayment() {
		return DownPayment;
	}

	public void setDownPayment(String downPayment) {
		DownPayment = downPayment;
	}

	public String getMonthlyPayment() {
		return MonthlyPayment;
	}

	public void setMonthlyPayment(String monthlyPayment) {
		MonthlyPayment = monthlyPayment;
	}

	public String getDuration_in_months() {
		return Duration_in_months;
	}

	public void setDuration_in_months(String duration_in_months) {
		Duration_in_months = duration_in_months;
	}

}
