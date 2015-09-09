package cmu.sgangwar.problems;

public class URLify {

	public static void main(String[] args) {
		System.out.println(getURLString("Mr John Smith    ".toCharArray(),13));
	}
	
	private static char[] getURLString(char[] inputString, int realLength){
		
		int spaceCount=0;
		int newLength=0;
		
		for(int i=0; i<realLength;i++){
			if(inputString[i]==' ')
				spaceCount++;
		}
		
		newLength = realLength + spaceCount*2;
		
		inputString[newLength-1]='\0';

		for(int i=realLength-1;i>=0;i--){
			if(inputString[i]!=' ')
			{
				inputString[--newLength]=inputString[i];
			}else{
				inputString[--newLength]='0';
				inputString[--newLength]='2';
				inputString[--newLength]='%';
			}
		}
		
		return inputString;
	}
}
