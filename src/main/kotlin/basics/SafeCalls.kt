package basics

/**
 * someThing?.otherThing does not throw an NPE if something is null.

 * Safe calls are useful in chain calls.  For example, an Employee
 * may be assigned to a department (or not).  That department may in
 * turn have another employee as a department head, who may or may not
 * have a name, which we want to print.
 */

/*
fun printDepartmentHead(employee: Employee) {
    println(employee.department?.head?.name)
}*/
