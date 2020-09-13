class Bit{
	public static void main(String[] args){
		int x = 0x16; 	// 22 d
		int y = 0x33;	// 51 d
		
		System.out.println(x & y); 	// 18
		System.out.println(x | y);	// 55
		System.out.println(x); 		// 22
		x &= 0xf; 					// 6
		System.out.println(x); 		// 6
		short s = 7; 				// 0000000000000111
		System.out.println(~s); // 11111111111111111111111111111000
	}
}