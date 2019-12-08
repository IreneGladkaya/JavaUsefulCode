import java.util.Scanner;

class RightRotation {
    public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			String inp = scanner.nextLine();
			String[] inpar = inp.split(" ",0);
			int rr = scanner.nextInt()%inpar.length;

			String[] inparn = new String[inpar.length];
			for (int i=0; i<inpar.length;i++) {
				inparn[i] = inpar[(Math.abs(inpar.length+i-rr))%inpar.length];
			}
		System.out.println(String.join(" ",inparn));
		}
}