# Environment Java :
first	JDK is Java Development Kit
second	JRE is Java Runtime Machine
third	JVM is Java Virtual Machine

The JVM create with the source code a .class which contain bytecode.

# class System
- not needs to instantiate this class.
example use System:
System.outputs/inn.function(param)
	outputs :
		- out : this standard output : 1
		- err : this error output : 2
	entry:
		- in : standard entry : 0

The function exit take an integer which return value's program :
- if program return value 0 went well
- if program return value 1 this program stop in error
example :
	system.exit(integer)

The function getProperties() containt the propertys of your PC

The function getenv() containt the propertys environment of your PC
The function getenv(nameVariableEnvironment) containt this variable environment of your PC

# container and wrapper
container designates primitf type. Wrapper designates primitif type form Object.
- For transform a variable in Wrapper. You should instantiate in Wrapper.
Example : 
	Float f = new Float(12.6f)
	Float f1 = new Float("12.6")

- For transform a variable in Container. You should use method for transorm in Container
example : 
	float f2 = f.floatValue();

- for transform a type in other type. You should use static method : parseType().
float f3 = Float.parseFloat("14.5");


# class Scanner
import java.util.scanner;

You should import this class and instantiate this class wtih param input stream.
example :
	Scanner scan = new Scanner(Sytem.in)
For use scanner you should know the type of value enter your terminal
example :
	String nextLine = cs.nextLine();
	int nextInt = cs.nextInt();


# interface
- the term interface is wrongly called multiple inheritance.
The interface represents a given capability to a class. That's why
that interfaces end with able.
- A class can be implemented from several interfaces.
- one interface can inherit from several other interfaces
- It is allowed to define interfaces that do not benefit from any
method. It's interface are created to denote a capacity. In
some cases the simple fact of knowing that a class benefits from this
capacity is sufficient. This is called the flag interface.
example:
	Serializable

- An interface can have properties but these must have a
 value from the declaration and this value can never be modified

# covariance (since java 5)
-  It is a rewrite of a method of the parent class by changing
 the type of method

# keyword static variable
- A static property is a property defined by the class, it is also called
a variable of class. A class variable is a value common to all instances.
The content may differ depending on the objects.
- When you're declare une static property, you should a value for default
example :
	static int numberOfWheels = 4;

- You're should have display the static variable with the name's class dot
the name's property.
example:
	System.out.println(Voiture.numberOfWheels);

- You're should have access the static variable with the name's class dot
the name's property and modificate the value's startic property.
example:
	Voiture.numberOfWheels = 5;

- You're should have display the static function with the name's class dot
the name's property.

# cast
if you cast a variable an other type :
	- You should possibility de save the new type in an other variable of type's cast
	- Else you should use transtype is not affect a new variable
	example :
		(newType)nameVariable)

# keyword static methode
- A method with the static keyword which does not involve any instance attribute,
it may possibly involve instance property if it's declared static instance 
attribute.
- It is also called a class method, it also relates to the class and not to a 
particular instance
example:
static void klaxonner()

- Or with instanciate variable followed by a dot and the
name's method


# Java is language object oriented language : class == Object
- the class is new type we're created
- the class name start with upper char
- where instiate the class he create a type object with the class' name
example :
Car is class
Car tesla = new Car();
tesla is pointer's on memory address of type Car object 
- if you copied a object is reference copy. It copy the moteur but if you modificate
before change a one object, other is modificate

- property / attribute / instantiate variable :
	- is une variable's class and respect the way of writing in camel case 
	- if property is not defined and primitive type :
		- the default value is assigned a value of type :
			- int is 0
			- boolean is false
			- char is without value in the unicode \u0000
	- else if property is Object type :
		- String is null	
- For access a property in a class he has instantiate variable and write the variable
name followed by dot and the property's name
example :
tesla.propertyName 

- the name of functions in the class is methods and respect the way of writing is camel
case
- For call a method he has instantiate variable and write the variable
name followed by dot and the method's name

# function or methods
for declare a function or methods, you are need :
	- first the type of function if void you're not need return the end file
	- second the name's function or method next two braces
	- third between braces you're params or not of the function or methods
	- For param you're need type and name's param
example :
int add(int nb1, int nb2)
return ((nb1 + nb2))

# the keyword this
- if two variables it's same name in the class:
	- one of class a attribute / property / intantiate variable
	- other a param of function
The priority going the param for remove an ambiguity we use this with the name of the 
variable class
Java does not handle this error

# Surcharge of method
it's redeclaration a function with different params or type and with the same name

# Specificity Java 
If we want to compare two String, it must not be instantiated (new keyword) otherwise we 
compare two memory locations
it is preferable to use the function equal
example:
string1.equal(string2)

# Bloc's instruction :
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

# Basic type :
In Java the convention is camel case and not use reserved words
The declaration of variable start with the type of the variable.
	type nameVariable

# primitives types:
The primitives types start with lower case
	- int = integer of -2147483648 at 2147483647
	- long = long int 
	- short = short int of -32768 at 32767
	- byte = byte int of -128 at 127 

	- float = floating point number
	- double = floating number

	- char = one character

	- boolean = true or false equivalent 1 or 0

	- void

not primitives types:
The not primitives types start with upper case
	- Integer
	- Short
	- Long
	- Byte

	- Float
	- Double

	- Boolean

	- Character
	- String

The variables not start with number or upper character and the convention the 
name of the variable wild should writed in english

# Error :
Once upon a Stack Tace for Error with error message

# Debuguer :
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

