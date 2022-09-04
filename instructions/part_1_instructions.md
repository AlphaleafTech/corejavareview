
<div style="text-align: center; color:gray;">
<h1>Core Java Review Part 1</h1>
</div>

<br>
<br>



## 📑`echo`
Write a program to the following String to the console You can only use the `System.out.print()` method. Make sure that output format is exactly the same as the following sample output:

**Sample Output:**
```text
Row, row, row your boat

Gently down the stream!!!
```
<br>
<br>



## 📑`neon`
Write a program to the following String to the console.  Make sure that output format is exactly the same as the following sample output:

**Sample Output:**
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

Given the following incomplete code, uncomment the code and replace the `?` placeholder and add the correct data type for the variable creation code. 

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


<br>
<br>


## 📑`createVariables`
Given the following sample profile picture, please create seven variables containing all seven pieces of information about this user. Upon creating the variables, please print them on the console.

<br>

<div style="zoom:70%">
<img src="https://firebasestorage.googleapis.com/v0/b/alphaleaf-login.appspot.com/o/shared-files%2FAlphaleaf%2Fjava_review%2Fvariable_profile.jpg?alt=media&token=39f53e33-cee4-4ef3-8ff0-73473fa3247f">
</div>

Make sure that the output format is the same as the sample output.

**Sample Output:**
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
When the following method is invoked, it will throw an error.  Uncomment and fix the faulty code using the **type casting** to get the desired output.  Do not make any other code change besides type casting.

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

**Explected Output:**
```text
$ 9234
```

<br>
<br>



## 📑`swap`

Given two integer variables, `a` and `x`, write three lines of code that swap these variables' content. Note that the value of `a` and `x` will be randomized.


**Sample Output**
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


## 📑`UserInputs`
Go to Java document `challenge.UserInputs.java`, and complete the `main` method so that it asks for the user all these test execution-related info and produces an output, as you can see from the image below.

<div style="zoom:80%">
<img src="https://firebasestorage.googleapis.com/v0/b/alphaleaf-login.appspot.com/o/shared-files%2FAlphaleaf%2Fjava_review%2Fuser_inputs.jpg?alt=media&token=f1e7c7d9-b3fc-4eeb-bd8e-76bc826e9ac0">
</div>


<br>
<br>


## 📑`basicCalculations`
Given two integer `a` and `b`,  complete the meothod so that it prints their **sum**, **difference**, **product**, **quotient** and **modulus** excatly as you see from the following 2 example outputs.  Note that integer `a` and `b` is generated randomly for you. 

**Example Output 1:** 
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

**Example Output 2:**
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

<br>
<br>

## 📑`printBigger`

Given two randomly generated integer numbers `a` and `b`, complete the method where it always prints the bigger one to the console using the **control flow** statement.

**Sample Output:**
```text
a is 56
b is 17

a is bigger
```

<br>
<br>


## 📑`compareThreeNum`

Given three numbers `a`, `b`, and `c`, where each of them is generated randomly, print the bigger one to the console using the **control flow** statement. 

**Sample Output:**
```text
a is 67
b is 34
c is 87

c is bigger
```

<br>
<br>

## 📑`VotingMachine`
Go to `challenge.VotingMachine.java` and complete the `main` method. It asks you to write a code where it asks for the user's age and determines whether they can vote or not using the following constraints. 



**Constraints:**
* If the user's age is less the `16` then print `You are too young to vote!`.
* If the user's age is between `17` and `52` then print `You must vote, pay fine otherwise.`.
* If the user's age is more than `52` but less than `65` then print `It's optional to vote, we recommend you vote.`
* All the other case, just print `You are too senior to vote!`.

<br>

Make sure that output format is exactly the same as the following sample output:

**Sample Output:**
```text
This program determines whether you must vote or not.
-----------------------------------------------------
Enter you age: 53

It's optional to vote, we recommend you vote.
```

<br>
<br>




## 📑`averageOfThreeNumber`

Given three random decimal numbers, `a`, `b`, and `c`, calculate and print its average. Make sure that your output has the identical format as the following sample output


**Sample Output:**
```text
===OUTPUT===
a = 60.695
b = 25.662
c = 89.548

Average: 58.635
```

<br>
<br>


