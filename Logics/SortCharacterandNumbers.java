package code;

public class SortCharacterandNumbers {

	public static Character temp;
	public static int counter=0;
	public static Character strArr[];
	public static Character sortedArr[];
	
	public static Character[] arrGenerator(Character[]arr, String values) {
		if(counter>arr.length-1) {
			return null;
		}else {
			arr[counter] = values.charAt(counter);
			counter+=1;
			arrGenerator(arr,values);
		}
		return arr;
	}
	
	public static Character[] arrSorter(Character[]arr) {
		if(counter>arr.length-1) {
			return null;
		}else {
			if(counter>0) {
				if(arr[counter-1]<arr[counter]){
					temp = arr[counter-1];
					arr[counter-1] = arr[counter];
					arr[counter] = temp;
					counter+=1;
					arrSorter(arr);
				}
			}else {
				arrSorter(arr);
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		String str = "hfjsk6485lop";
		
		counter = 0;
		
		strArr = new Character[str.length()];
		
		strArr = arrGenerator(strArr,str);
		//System.out.println(strArr.length);
		
		sortedArr = new Character[strArr.length];
		
		sortedArr = arrSorter(strArr);
		
		for(int i=0;i<=sortedArr.length-1;i++) {
			System.out.println(sortedArr[i]);
		}
		
	}

}
