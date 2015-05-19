public enum enum_const {
	//Kind of array of objects
	
	gera("MBRSK","31"),
	begma("MB","25"),
	maloy("M","21"),
	jonson("MBS","25"),
	nesa("BSR","25");

	private final String name;
	private final String year;
	
	enum_const(String nickname, String age){
		name = nickname;
		year = age;
	}
	
	public String printAll(){
		return String.format("%s\t%s", name, year);
	}
}
