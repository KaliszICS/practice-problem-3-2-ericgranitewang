public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int towerOfHanoi (int num) {
		if (num < 3) {
			return -1;
		}
		return realTowerOfHanoi(num);
	}
	
	public static int realTowerOfHanoi (int num) {
		if (num == 1) {
			return 1;
		}
		return 1 + 2*realTowerOfHanoi(num-1);
	}

}
