package week3.day1;

public class Sports {
      public void Acheiver(String name, int medalCount) {
		System.out.println(name+" "+medalCount);
	}
      public void Acheiver(String country, String sportName, int rank) {
		System.out.println(country+" "+sportName+" "+rank);
	}
      public void Acheiver(float weight, int height, long contactNo) {
		System.out.println(weight+" "+height+" "+contactNo);
	}
      public void Acheiver(String tournamentName, long prizeMoney) {
		System.out.println(tournamentName+" "+prizeMoney);
	}
      public static void main(String[] args) {
		Sports type=new Sports();
		type.Acheiver("Chennai", 3);
		type.Acheiver("India", "Football", 3);
		type.Acheiver(60, 175, 9884280689L);
		type.Acheiver("TATA", 1000);
	}
}
