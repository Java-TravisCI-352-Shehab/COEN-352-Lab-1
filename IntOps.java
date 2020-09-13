class IntOps{
	public static void main(String[] args){
		// Check how many arguments were passed in
		if(args.length == 0) // how we can improve it ?
		{
			System.out.println("Proper Usage is: java [program_name] [First_value] [Second_value]");
			System.exit(0);
		}
		
		// Convert from string to int
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// Do some math operations.
		int sum = a + b;
		int pro = a * b;
		int div = a / b;
		int rem = a % b;
		// Print the results.
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " * " + b + " = " + pro);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " % " + b + " = " + rem);
		
	}
}