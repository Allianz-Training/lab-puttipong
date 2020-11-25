package com.allianz.helloWorld;

public class Driver {
	public static void main(String args[]) {
		Circle circle = new Circle();
		Circle circle2 = new Circle(2.5);
		
		System.out.println("Hw5-6 OOP1 ==================");
		System.out.println(circle);
		System.out.println("Circle area: " + circle.getArea());
		System.out.println("Circle circumference: " + circle.getCircumference());
		System.out.println(circle2);
		System.out.println("Circle area: " + circle2.getArea());
		System.out.println("Circle circumference: " + circle2.getCircumference());

		System.out.println("\n\nHw7 OOP1 ==================");
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle(5, 8);
		System.out.println(rectangle);
		System.out.println("Rectangle area: " + rectangle.getArea());
		System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
		System.out.println(rectangle2);
		System.out.println("Rectangle area: " + rectangle2.getArea());
		System.out.println("Rectangle perimeter: " + rectangle2.getPerimeter());

		System.out.println("\n\nHw8 OOP1 ==================");
		Employee employee = new Employee(1, "John", "Doe", 10000);
		System.out.println(employee);
		System.out.println("Annual Salary: " + employee.getAnnualSalary());
		System.out.println("Raise Salary from " + employee.getSalary() + " to: " + employee.raiseSalary(50));

		System.out.println("\n\nHw1 OOP2 ==================");
		MovableCircle moveableCircle = new MovableCircle(1, 1, 5, 5, 8);
		System.out.println(moveableCircle);
		moveableCircle.moveDown();
		System.out.println(moveableCircle);
		System.out.println("\n\nHw2 OOP2 ==================");
		MovableRectangle movableRectangle = new MovableRectangle(1, 1, 2, 2, 6, 6);
		System.out.println(movableRectangle);
		movableRectangle.moveLeft();
		System.out.println(movableRectangle);

		System.out.println("\n\nHw3 OOP2 ==================");
		DiscountRate discountRate = new DiscountRate();
		System.out.println("Premium Service Discount Rate: " + discountRate.getServiceDiscountRate("Premium"));
		System.out.println("Gold Service Discount Rate: " + discountRate.getServiceDiscountRate("Gold"));
		System.out.println("Silver Service Discount Rate: " + discountRate.getServiceDiscountRate("Silver"));

		Visit visitPremium = new Visit("PK", null);
		visitPremium.getCustomer().setMember(true);
		visitPremium.getCustomer().setMemberType("Premium");
		visitPremium.setServiceExpense(150);
		visitPremium.setProductExpense(100);
		System.out.println(visitPremium);
		System.out.println("Total Expense: " + visitPremium.getTotalExpense());

		Visit visitGold = new Visit("Time", null);
		visitGold.getCustomer().setMember(true);
		visitGold.getCustomer().setMemberType("Gold");
		visitGold.setServiceExpense(150);
		visitGold.setProductExpense(100);
		System.out.println(visitGold);
		System.out.println("Total Expense: " + visitGold.getTotalExpense());

		Visit visitSilver = new Visit("KP", null);
		visitSilver.getCustomer().setMember(true);
		visitSilver.getCustomer().setMemberType("Silver");
		visitSilver.setServiceExpense(150);
		visitSilver.setProductExpense(100);
		System.out.println(visitSilver);
		System.out.println("Total Expense: " + visitSilver.getTotalExpense());

		Visit visiter = new Visit("emiT", null);
		visiter.setServiceExpense(150);
		visiter.setProductExpense(100);
		System.out.println(visiter);
		System.out.println("Total Expense: " + visiter.getTotalExpense());
	}
}

//Employee em1 = new Employee("John","Doe",50000,"Manager");
//Employee em2 = new Employee("Somhin","Fuckinghin",1234567890,"Beyond Janister");
//em1.hello();
//em1.checkPosition();
//System.out.println("Full name is "+ em1.getFullName());
//em2.hello();
//em2.checkPosition();
//System.out.println("Full name is "+ em2.getFullName());
//Employee[] employees = new Employee[3];
//for(int i =0;i<employees.length;i++) {
//	employees[i] = new Employee("John"+i, "Doe"+i, 30000*i, "CEO"+i);
//}
//System.out.println(employees[0].firstName);
//System.out.println(employees[1].firstName);
//System.out.println(employees[2].firstName);
//System.out.println(Employee.getLeaveDay());	
//Employee.setLeaveDay(20);
//System.out.println(Employee.getLeaveDay());
//Employee.plusLeaveDay(5);
//System.out.println(Employee.getLeaveDay());
//EmployeeSpecial es1 = new EmployeeSpecial("Bas", "zaza", 1000000, "X-Men");
//
//es1.getSkill();
//es1.changeSkill("Fly");
//es1.getSkill();


//Circle c1 = new Circle();
//c1.setRadius(5);
//System.out.println(c1);
//
//Rectangle r1 = new Rectangle();
//r1.setLength(10);
//r1.setWidth(5);
//System.out.println(r1);
//
//Employee e1 = new Employee(1,"Bas","Za",20000);
//System.out.println(e1);
//System.out.println("raise salary = " + e1.raiseSalary(20));

//MovableCircle m1 = new MovableCircle(1,1,10,10,5);
//m1.moveUp();
//MovableRectangle r1 = new MovableRectangle(2,3,2,3,5,5);
//r1.moveUp();
