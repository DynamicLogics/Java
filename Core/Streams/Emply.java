package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emply {

	public static void main(String[] args) {
		
		List<Employee> getEmployeeDetails = Constants.getEmployeeDetails(); 
		
		//System.out.println(getEmployeeDetails);
		
		Long empCnt = getEmployeeDetails.stream().filter(e->e.getEmployeeSalary()>=70000).count();
		System.out.println(empCnt);
		
		
		List<String> empnames = getEmployeeDetails.stream().filter(e->e.getEmployeeSalary()>=70000)
								  .map(e->e.getEmployeeName()).collect(Collectors.toList());
		System.out.println(empnames);
		
		
		Map<Object, Long> vall =  getEmployeeDetails.stream().filter(e->e.getEmployeeAge()>=30)
		 .collect(Collectors.groupingBy(x->x.getEmployeeName(),Collectors.counting()));
		System.out.println(vall);
		
		
		getEmployeeDetails.stream().map(x->x.getEmployeeSalary()).reduce((x,y)->x+y)
		.ifPresent(x->System.out.println(x));
		
		
		String name = "applea";
		Stream<Character> rep = name.chars().mapToObj(x->(char)x);
		Map<Object, Long> repChars = rep.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(repChars);
		
		
		String nn = "Shubham is my Name";
		String revChars = "";
		String frwdChars = "";
		
		nn+=" ";
		
		for(int i=0;i<=nn.length()-1;i++) {
			if(nn.charAt(i)!=' ') {
				frwdChars+=nn.charAt(i);
			}else {
				for(int j=frwdChars.length()-1;j>=0;j--) {
					revChars+=frwdChars.charAt(j);
				}
				revChars+=' ';
				frwdChars=" ";
			}
		}
		
		System.out.println(revChars);
		
		
		Map<String,Integer> val = new HashMap<>();
		val.put("A", 13);
		val.put("B", 23);
		val.put("c", 9);
		val.put("d", 89);
		
		
		Map<String,Integer> sorted = 
				val.entrySet().stream().sorted(Map.Entry.comparingByValue())
				 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        			  (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		Iterator<Map.Entry<String, Integer>> it = sorted.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<String, Integer> pair = it.next();
		    System.out.println(pair.getKey() + pair.getValue());
		}
		
		
		List<Employee> getEmpDtls = Constants.getRepeatedEmployeeDetails(); 
		
		Map<String, List<Employee>> empVal = 
		getEmpDtls.stream()
		.collect(Collectors.groupingBy(Employee::getEmployeeName));
		
		Map<String, List<Employee>> empValA = empVal.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, 
						x -> x.getValue().stream()
						.sorted(Comparator.comparingInt(Employee::getEmployeeSalary))
						.collect(Collectors.toList())));
		
		System.out.println(empValA);
		
		empValA.forEach((x, y) -> {
            System.out.println(x);
            for(int i=0;i<=y.size()-1;i++) {
            	System.out.println(y.get(i).employeeSalary);
            }
        });
		
		
		
		
	}

}
