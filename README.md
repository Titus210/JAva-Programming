#   Java Programming Language
***
## Introduction

## Variables

## Datatypes
Data types specify type of data that can be stored in a variable <br/>
Java is a statically-typed languag; All variables must be declared before they can be used.
There are `8` primitive data types in Java
1. __Boolean__ <br/>
This has two possible values`true` and `false`, where the default is always `false`. <br/>
__example__:
```
class Main{
    public static void main(String[] args){
        boolean name = true;
        System.out.println(name); // true
    }
}
```
2. __byte type__ <br/>
This have the values from `-128` to `127` (8-bit signed two's complement integer), the default is always 0.
```
class Main{
    public static void main(String[] args){
        byte = range;
        range = 122;
        System.out.println(range); // true
    }
}
```
3. __Short type__: <br/>
This datatype has values from `-32768` to `32767` (16-bit signed two's complement integer), the default is always 0)
```
class Main{
    public static void main(String[] args){
        short = range;
        range = -3334;
        System.out.println(range); // true
    }
}
```

4. __int type__: <br/>
This datatype has values from `2^21` to `2^21 - 1` (32-bit signed two's complement integer), the default is always 0)
```
class Main {
  public static void main(String[] args) {
    	
    int range = -450000;
    System.out.println(range);  
  }
}
```

5. __Long type__: <br/>
This datatype has values from `2^63` to `2^63- 1` (32-bit signed two's complement integer), the default is always 0
```
class Main {
  public static void main(String[] args) {
    	
    int range = -444450000L;
    System.out.println(range); 
}
```   
6. __float type__: <br/>
This datatype has single precision 54-bit floating point the default is always 0.00 <br/>
```
class Main {
  public static void main(String[] args) {
    	
    float range = 42.45f;
    System.out.println(range);  
  }
}
```   

7. __Double type__: <br/>
This datatype has double precision 54-bit floating point the default is always 0.00 <br/>
```
class Main {
  public static void main(String[] args) {
	
    double range = -4.10;
    System.out.println(range);  
  }
}
```   

8. __Char type__: <br/>
This datatype is a 16-bit Unicode character with minimum and maximum values of `\u0000`(default) and `\uffff`
```
class Main {
  public static void main(String[] args) {
	
    char letter = "\u0051';
    System.out.println(letter);  // prints Q
  }
}
```   
__String__ <br/>
This is not a primitive data type, its an Object from `java.lang.String` class.
```
class Main {
  public static void main(String[] args) {
	
    char myString = "Learning Java';
    System.out.println(myString);  // prints Q
  }
}
```   