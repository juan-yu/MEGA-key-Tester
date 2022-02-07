package packageone;

public class Main {
	private static boolean found = false;

	public static void setFound(boolean found) {
		Main.found = found;
	}

	public static boolean getFound() {
		return found;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url1 = "folderURL";
		String url2 = "key1";
		String url3 = "key2";
		String url4 = "key3";

		boolean AA = true;
		boolean Aa = true;
		boolean AN = true;
		boolean aA = true;
		boolean aa = true;
		boolean aN = true;
		boolean NA = true;
		boolean Na = true;
		boolean NN = true;

		Solve1 s1 = new Solve1(url1, url2, url3, url4, AA, Aa, AN, aA, aa, aN, NA, Na, NN);
		Solve2 s2 = new Solve2(url1, url2, url3, url4, AA, Aa, AN, aA, aa, aN, NA, Na, NN);
		Solve3 s3 = new Solve3(url1, url2, url3, url4, AA, Aa, AN, aA, aa, aN, NA, Na, NN);
		Solve4 s4 = new Solve4(url1, url2, url3, url4, AA, Aa, AN, aA, aa, aN, NA, Na, NN);
		Solve5 s5 = new Solve5(url1, url2, url3, url4, AA, Aa, AN, aA, aa, aN, NA, Na, NN);
		System.out.print("N: ");

		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		while (!found) {
		}
		System.out.print("done");
	}

}
