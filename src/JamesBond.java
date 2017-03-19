
public class JamesBond {

	public void findCode(Vault v) {
		boolean found = false;
		for (int i = 0; i < 10000000; i++) {
			if (v.tryCode(i) == true) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println(-1);
		}

	}

	public static void main(String[] args) {
		JamesBond bond = new JamesBond();
		bond.findCode(new Vault(11113));
	}

}
