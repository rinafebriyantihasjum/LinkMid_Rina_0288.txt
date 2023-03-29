RINA FEBRIYANTI HASJUM 13020210288
interface A{ public void aaa(); }
interface B extends A{
	public void aaa();
}
	class Central implements A,B{
	public void aaa(){
System.out.println("aaa");
}
	public static void main(String arg[]){
System.out.println("main");
this.aaa();
}
}