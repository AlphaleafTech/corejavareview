
<div style="text-align: center; color:gray;">
<h1>Core Java Review Challenges</h1>
</div>

<br>
<br>



## 📑`echo`
Write a program to display below String to the console. You can only use the `System.out.print()` method. Make sure that output format is exactly the same as the following:

**Output:**
```text
Row, row, row your boat

Gently down the stream!!!
```
<br>
<br>



## 📑`neon`
Write a program to display below String to the console.

Output
```text
**        ***    **********      **             *             **
**      ***      **        **     **           ***           **
**    ***        **         **     **         ** **         **
**  ***          **          **     **       **   **       **
*****            **          **      **     **     **     **
**  ***          **          **       **   **       **   **
**    ***        **         **         ** **         ** **
**      ***      **        **           ***           ***
**        ***    **********              *             *
```


<br>
<br>

## 📑`fillTheDataType`

Given the following incomplete code, replace the `?` placeholder and add the correct data type for the following variables. 

```java
public void fillTheDataType() {
    ? age = 29;
    ? score = 8.99;
    ? grade = 'A';
    ? isActive = false;
    ? message = "Hello World";

    System.out.println(age);
    System.out.println(score);
    System.out.println(grade);
    System.out.println(isActive);
    System.out.println(message);
}
```

**Instructions**:
 1. Uncomment the code block 
 2. Looking at the data value, add the data type for the variable
 3. Make sure that test passes 
```shell
mvn test -Dgroups=fillTheDataType
```

<br>
<br>


## 📑`createVariables`
Looking at the following sample profile picture, please create a seven variable that contains all of the 7 information about this user.  Upon creating the variable, please print them to the screen.

<br>

<div style="zoom:70%">
<img src="https://firebasestorage.googleapis.com/v0/b/alphaleaf-login.appspot.com/o/shared-files%2FAlphaleaf%2Fjava_review%2Fvariable_profile.jpg?alt=media&token=39f53e33-cee4-4ef3-8ff0-73473fa3247f">
</div>


**Expected Output:**
```text
Full Name is  : Albert Einstein
Birth Year is : 1878
Username is   : einAlbert
Password is   : physics4ever!
Now online    : false
# of followers: 1664531
IQ Test Score : 159.86
```


<br>
<br>



## 📑`conversion`
If the following method is executed, it will throw an error.  Please fix this method using the **type casting** to get the desired output. Do not make any other code change besides type casting. 

**Faulty Code:** 
```java
public void conversion() {
    double balance = 9234.78;
    int symbol = 36;

    int whole = balance;
    char dollar = symbol;

    System.out.println(dollar + " " + whole);
}
```

**Desired Output:**
```text
$ 9234
```

**Instructions**:
1. Uncomment the code block
2. Fix the code using type casting
3. Make sure that test passes
```shell
mvn test -Dgroups=conversion
```

<br>
<br>



## 📑`swap`
Given two integer variables `a` and `x`, write a 3 lines of code that swaps the content of these variables.  Note that value of `a` and `x` will be randomized. 

**Sample Expected Rum**
```text
Before swap
-------------
a = 135
x = 65

After swap
-------------
a = 65
x = 135
```

<br>
<br>


## 📑`userInput`
Go to Java class `challenge.UserInputs.java` and please complete the `main` method so that it asks for user all these test execution related info, and produces an output as you can see from the image below. 

<div style="zoom:80%">
<img src="https://firebasestorage.googleapis.com/v0/b/alphaleaf-login.appspot.com/o/shared-files%2FAlphaleaf%2Fjava_review%2Fuser_inputs.jpg?alt=media&token=f1e7c7d9-b3fc-4eeb-bd8e-76bc826e9ac0">
</div>


<br>
<br>


## 📑`baseArithmetics`
Given two integer `a` and `b`,  complete the meothod so that it prints their **sum**, **difference**, **product**, **quotient** and **modulus** excatly as you see from the following 2 example.  Note that integer `a` and `b` is generated randomly. 

**Example 1:** 
```text
Value of a: 8
Value of b: 2

===OUTPUT===
8 + 2 = 10
8 - 2 = 6
8 * 2 = 16
8 / 2 = 4.0
8 % 2 = 0
```

**Example 2:**
```text
Value of a: 9
Value of b: 2

===OUTPUT===
9 + 2 = 11
9 - 2 = 7
9 * 2 = 18
9 / 2 = 4.5
9 % 2 = 1
```

