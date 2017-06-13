package looptest;

//This java file is inside package named looptest inside src folder.

public class Looptest             //class declaration.
{
	public static void main(String[] args)         // main function declaration. and because it is static, program execution starts from main function.
	{
		int character;    //declaring variable to store ASCII value of alphabetic character.
		int space;        //integer variable space is declared to store spaces required before appearance of first character in each row. 
		
		
		space=2;        //initialization of space variable as 2 because in first row space needed before first character is 2.
		
		character=97;   //initializing  character variable with value 97 which is the ASCII value of character 'a'.
		
		
		//ASCII value of 'a' is 97.
		//ASCII value of 'b' is 98.
		//ASCII value of 'c' is 99.
		
		
		
		//THIS LOOP IS PRINTING FIRST THREE ROWS OF OUTPUT.
		for(int row=1;row<=3;row++)          //This loop is for writing characters in row with decreasing spaces. Means 1st,2nd and 3rd row.
		{
			
			int j;            //Declaring variable j just for iteration of loops.
			
			
			for(j=space;j>=1;j--)     //Creating first Nested loop for printing spaces before first character.
			{
				System.out.print(" ");
			}
			
			//Spaces will be printed different for different rows because in first three rows number of spaces are decreasing. 
			
			
			for(j = character ; j < character + row ; j++)    //Nested for loop for printing characters in increasing order after space.
			{
				System.out.print((char)j);   //printing character by typecasting the integer variable j.
			}
			//Above loop will print characters from 'a' to character which has ASCII value (character + row - 1). 
			
			
			
			for(int k=j-2;k>=character;k--)    //Nested for loop for printing characters in decreasing order after printing of increasing ordered characters.
			{
				System.out.print((char)k);     //printing character by typecasting the integer variable k.
			}
			/*
			 Above loop will print characters from second highest ASCII value character in before loop till character 'a'. For example if highest 
			 ASCII value character in before loop is 'c' then this loop will start from character 'b' till character 'a'.
			 */
			
			
			space--;     //In each next row number of space is decreasing for first three rows. So, we are decreasing the space value for printing next row.
			
			System.out.print("\n");   //printing \n for writing in next line of console.
		}
		
		
		
		
		space=1;    //Again initalizing space variable as 1 because we have already printed three lines by above loop and 4th line has onne space needed.
		
		
		
		
		//THIS LOOP IS PRINTING LAST TWO ROWS OF OUTPUT. 
		for(int row=2;row>=1;row--)        //This loop is for writing characters in row with increasing spaces. Means 4th and 5th row.
		{   
			
			int j;           //Declaring variable j just for iteration of loops.
			
			
			for(j=space;j>=1;j--)          //Creating first Nested loop for printing spaces before first character.
			{
				System.out.print(" ");
			}
			
			//Spaces will be printed different for different rows because in first three rows number of spaces are decreasing.
			
			
			for(j = character ; j < character + row ; j++)      //Nested for loop for printing characters in increasing order after space.  
			{
				System.out.print((char)j);       //printing character by typecasting the integer variable j.
			}
			//Above loop will print characters from 'a' to character which has ASCII value (character + row - 1).
			
			
			
			for(int k=j-2;k>=character;k--)     //Nested for loop for printing characters in decreasing order after printing of increasing ordered characters.
			{
				System.out.print((char)k);      //printing character by typecasting the integer variable k.
			}
			/*
			 Above loop will print characters from second highest ASCII value character in before loop till character 'a'. For example if highest 
			 ASCII value character in before loop is 'c' then this loop will start from character 'b' till character 'a'.
			 */
			
			
			space++;     //In each next row number of space is increasing for last two rows. So, we are increasing the space value for printing next row.
			System.out.print("\n");      //printing \n for writing in next line of console.
		}
	}
}
