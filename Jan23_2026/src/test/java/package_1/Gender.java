package package_1;

public enum Gender {
	M,F;
	
	public static Gender imp(String input) {
		if(input == null || input.isEmpty()) return null;
		char c = Character.toUpperCase(input.trim().charAt(0));
		if( c == 'M') return M;
		if(c == 'F') return F;
		
		return null;
		
	}
}
