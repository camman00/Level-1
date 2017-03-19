
public class Vault {
	private int code;

	public Vault(int code) {
		this.setCode(code);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public boolean tryCode(int code) {
		if (this.code == code) {
			return true;
		}
		return false;
	}
}
