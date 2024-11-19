package day_11_array;

public class CharArray {

	public static void main(String[] args) {
		String name = "kimsunwoo";
		System.out.println("name:"+name);
		//char[] nameArr = {'A','B'};
		char[] nameArr2 = {'A','B','C'};
		char[] nameArr = name.toCharArray();
		for(int i =0;i<nameArr.length; i++) {
			System.out.println(nameArr[i]);
		}
	}

}
