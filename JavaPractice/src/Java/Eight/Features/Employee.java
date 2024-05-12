package Java.Eight.Features;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	
	private String name;
	private double percentage;
	private double salary;
	private String DOJ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name, double percentage, double salary, String dOJ) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.salary = salary;
		DOJ = dOJ;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public static void main(String args[]) {
		List<Employee> l=new ArrayList<Employee>();
		
		l.add(new Employee("Yogesh", 85.30,25000.00,"05/06/2023"));
		l.add(new Employee("chaitanya", 80.30,35000.00,"12/06/2019"));
		l.add(new Employee("dhano", 95.30,45000.00,"22/06/2024"));
		l.add(new Employee("anil", 35.30,96880.50,"22/09/2023"));
		l.add(new Employee("Akshay", 60.30,23009.46,"12/06/2019"));
		
		/*
		 * List<Double> list=l.stream().filter(o->
		 * o.getPercentage()>75.00).map(p->p.getPercentage())
		 * .collect(Collectors.toList()); System.out.println(list);
		 */
		List<String> str= l.stream().map(d->d.getDOJ()).collect(Collectors.toList());
		List<Double> sal= l.stream().filter(e-> e.getSalary()>30000).map(s->s.getSalary()).collect(Collectors.toList());
		sal.forEach(System.out::println);
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<LocalDate> dates = str.stream()
                .map(s -> LocalDate.parse(s, formatter))
                .toList(); 
        dates.forEach(System.out::println);
     
		for(int i=0;i<l.size();i++) {
		}
	}

		
	

}
