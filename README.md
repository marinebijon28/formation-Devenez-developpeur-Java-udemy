Environment Java :
first	JDK is Java Development Kit
second	JRE is Java Runtime Machine
third	JVM is Java Virtual Machine

The JVM create with the source code a .class which contain bytecode.

Bloc's instruction :
- Un instruction block contained by two braces and has an indentation of a tab.
- If a variable declaration is in sub instruction bloc is hidden in other 
instruction bloc superior. 
- If a variable is superior instruction bloc is
accessible in sub instruction bloc.

Cyclomatic complexity : it's the number of fit into condition
example : 
if () {
	if () {
	}
}
It's cyclomatic complexity of 2

Basic type :
In Java the convention is camel case and not use reserved words
The declaration of variable start with the type of the variable.
	type nameVariable

primitifs types:
The primitifs types start with lower case
	- int = integer of -2147483648 at 2147483647
	- long = long int 
	- short = short int of -32768 at 32767
	- byte = byte int of -128 at 127 

	- float = floating point number
	- double = floating number

	- char = one character

	- boolean = true or false equivalent 1 or 0

not primitifs types:
The not primitifs types start with upper case
	- Integer

	- String

The variables not start with number or upper character and the convention the 
name of the variable wild should writed in english

Error :
Once upon a Stack Tace for Error with error message

Debuguer :
- you should put a breakpoint next to line number for see your values' variables.
- For start the debugger mode click the icon next to play on the right int the 
corner right of editor (IntelliJ) or right click on your file and select debug
mode.
- once launched he stop at the breakpoint and you should see values' variables
- for see all step click on step over or step into for to go in the next step 
in your code
- for verify a instruction you selected the condition for see if your condition
is corrected :
	- you should right click and choice evaluate for see the condition is 
	corrected and the value's condition
	- you should right click and selected add watches for selected a one part 
	of code for see permanentely in your debug console
- for exit the debug mode click on resume program 

