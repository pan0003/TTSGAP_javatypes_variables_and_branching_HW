//Okay so this is my best attempt at the homework titled "Java Types, Variables, & Branching"//
public class JavaFieldsHw {
public static void main(String[] args) {
	int number = 1;
	String FirstTest = "andrew";
	System.out.print(FirstTest);
	System.out.print(number);
	}	
}
//Let me see what happens when I declare a field outside of the {} that belongs to public class JavaFieldsHw//
	//Okay so I got two errors: Error 1 said "Syntax error, insert "}" to complete ClassBody", and Error 2 said "Syntax err on token "}", delete this token"

//All right now I will declare a field inside the {} that belongs to public class JavaFieldsHw//	
	//I got no error when I did that. Nice! I guess that means I should declare my fields inside the {} of a class.//

//Let me see what happens when I don't type the data type before the field name inside the {}//
	//Okay so I get 2 errors. Error 1 reads “Syntax error, insert “)” to complete MethodDeclaration”, and Error 2 reads “Syntax error, insert “Identifier (“ to complete MethodHeaderName”//

//Let me see what happens when I put the type "string" the field name "test"//
	//Okay so I get 1 error that says "string cannot be resolved to a type. Let me go and capitalize the 'S' in "string" and see if that resolves the error.//
	//Okay so it looks like capitalizing the 'S' in "string" resolved the error. I guess I have to use a capital 'S' when I want to use the data type "String".//

//I wonder what happens when I duplicate a field two times.//
	//Okay so I get 2 errors that say "Duplicate field JavaFieldsHwd.test. Looks like I can't have two of the same fields."//

//Does anything happen if I capitalize the variable name 'test' to 'Test'?//
	//Nope. No errors were found when I did that. As long as I don't capitalize every word of a field name I should be okay because uppercase names are reserved for final constant variables//

//What if I put a number before the variable name 'test' to make it "1test"?//
	//Okay so I get 1 error that says "Syntax error on token "1", delete this token." I guess I can't start a name of a field with a number huh//

//What if I put a symbol like # or @ before 'test'?//
	//Okay so I get 1 error that says "Syntax error on token "Invalid Character", delete this token." Looks like I can't use special characters like # or @ huh//
	//I guess the only symbol that does work that I can put before the word 'test' is the $ because I got no errors when I put the $ before the word 'test'//

//What if I put some () between $ and 'test'?//
	//Wowzers, so I get 3 errors. Error 1 says “Syntax error, insert “… VariableDeclaratorId” to complete FormalParameterList”. Error 2 says, “Syntax error, insert “}” to complete ClassBody” Error 3 says, “Syntax error on token “}”, delete this token”. Looks I will not be using () in the field name.//

//Can my variable be two worded with a space in between? Let's find out//
	//So I changed the field name of 'test' to 'first test', and I got 1 error that says, "Syntax error on token "String", invalid Modifiers"//
	//Update: so as long as my two worded field name have an underscore, I am okay.//

//Okay now what would happen if I tried to print an uninitialized field?//
	//Well, it looks like it was important to have line 3 before I try to initialize anything//
	//Okay, now that I have added line 3 to the code, I will try to print Firsttest//
		//Oof, I get an error that says "The local variable number may not have been initialized//
		//Once I have assigned a value to the field name Firsttest, the error went away.//

//All right, I will now try to print my local variable 'number'
	//I get 1 error that says "the local variable number may not have been initialized"
		//This error is resolved when I initialize the local variable 'number' with 1.//
