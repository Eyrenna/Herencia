package org.lasencinas;

public class UpcastTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ken Wood");

        Manager mgr = new Manager();
        mgr.setName("Ken Furr"); // Inheritance of setName() at work

        // Print names
        EmpUtil.printName(emp);
        EmpUtil.printName(mgr); // Upcasting at work /*Se realiza un upcasting implícicto*/

        //isEquals
        System.out.println(mgr.equals(emp)); // prints true /*en ese ejemplo no porque los nombres son diferentes*/
        System.out.println(emp.equals(mgr)); // prints true /*en ese ejemplo no porque los nombres son diferentes*/
        System.out.println(emp.equals("John Jacobs")); // prints false

    }
}

