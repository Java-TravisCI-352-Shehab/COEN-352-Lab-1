class UseArgs{
	public static void main(String[] args){
		
		// Check how many arguments were passed in
		if(args.length == 0)
		{
			System.out.println("Proper Usage is: java [program_name] [String_name]");
			System.exit(0);
		}
		
		System.out.print("Hi ");
		System.out.print(args[0]);
		System.out.print(", ");
		System.out.println("Welcome in course COEN 352!");
	}
}