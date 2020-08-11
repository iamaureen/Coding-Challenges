package LeetCode;

//https://leetcode.com/problems/employee-importance/description/
//this solution got accepted in leetcode but gives stackoverflow error in ide
import java.util.*;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
    
    Employee(int id, int importance, List<Integer> subordinates){
    		this.id = id;
    		this.importance = importance;
    		this.subordinates = subordinates;
    }
}

public class p690_EmployeeImportance {
	
	public static int getImportance(List<Employee> employees, int id) {
		
        Map<Integer, Employee> empList = new HashMap<Integer, Employee> ();
        
        for (int i = 0; i < employees.size(); i++){
        		empList.put(employees.get(i).id, employees.get(i));
        }
        
        Employee head = empList.get(id);
        int impValue = 0;
        impValue = head.importance + importance(empList, head.subordinates);
        return impValue;
        
 }
        
	private static int importance(Map<Integer, Employee> empList, List<Integer> subordinates) {
		// TODO Auto-generated method stub
		int imp = 0;
		for (int i: subordinates) {
			Employee em = empList.get(i);
			imp = imp + em.importance + importance(empList, em.subordinates);
		}
		return imp;
	}

	public static void main(String[] args) {
		//create employee objects
		int subarray[] = {2,3};
		
		List<Integer> list = new ArrayList<>(subarray.length);

		for (int i : subarray) {
			list.add(Integer.valueOf(i));
		}

		int subarray1[] = {2,3};
		
		List<Integer> list1 = new ArrayList<>(subarray1.length);

		for (int i : subarray1) {
			list1.add(Integer.valueOf(i));
		}

		//[[1,5,[2,3]],[2,3,[4]],[3,4,[]],[4,1,[]]]
		
		Employee emp1 = new Employee(1,5,list);
		Employee emp2 = new Employee(2,3,list1);
		Employee emp3 = new Employee(3,4,Collections.<Integer>emptyList());
		Employee emp4 = new Employee(4,1,Collections.<Integer>emptyList());
		
		
		List<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		
		
		
		System.out.println(getImportance(emp,1));
	}
    
	

}
