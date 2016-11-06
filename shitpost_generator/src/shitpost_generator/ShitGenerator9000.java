package shitpost_generator;

public class ShitGenerator9000 {

	private static String wordForwards, wordBackwards;
	
	public static void main(String[] args) {
		drawShitpost("WEWLAD", 12, 3);
		
	}
	
	public static void drawShitpost(String word, int width, int height){
		wordForwards = word.toUpperCase();
		wordBackwards = (new StringBuilder(word.toUpperCase())).reverse().toString();
		
		boolean forwards = true;
		for (int i = 0; i < height; i++){
			drawMain(width, forwards);
			drawMiddle(width, forwards);
			
			forwards = !forwards;
		}
		drawMain(width, forwards);		
	}
	
	public static void drawMain(int width, boolean forwards){
		StringBuilder st = new StringBuilder(width * (wordForwards.length()-1)+1);
		
		for(int i = 0; i < width; i++){
			if ((i % 2 == 0 ) == forwards){
				st.replace(i * (wordForwards.length()-1), (i+1) * (wordForwards.length()-1), wordForwards);
			}else{
					st.replace(i * (wordForwards.length()-1), (i+1) * (wordForwards.length()-1), wordBackwards);
				}
			}	
	System.out.println(st.toString());
	}
	
	public static void drawMiddle(int width, boolean forwards){
		for (int line = 1; line <wordForwards.length()-1; line++ ){
			for (int i = 0; i<=width; i++){
				if((i % 2 == 0) == forwards){
					System.out.print(wordForwards.charAt(line));
				}	else {
					System.out.print(wordBackwards.charAt(line));
				}
				for (int j = 0; j<(wordForwards.length()-2); j++)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
