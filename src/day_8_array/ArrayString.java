package day_8_array;

public class ArrayString {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.print("게임이름:");
		String[] games = {"starcraft,리니지,ongames"};
		for (int i=0; i<games.length; i++) {
			System.out.print(games[i]+" ");
		}
		System.out.println(" ");
		System.out.print("등   수");
		for(int i =0; i<arr.length; i++) {
			System.out.print("    "+arr[i]+  "   ");
		}
	}

}
