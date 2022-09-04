<div style="text-align: center; color:gray;">
<h1>Core Java Review Part 2</h1>
</div>

<br>
<br>



## 📑`gradePoints`
The table below describes how the grade for a particular course is determined. Write a program that gives a course grade according to the provided table.

| Points      | Grade       |
|-------------|-------------|
| < 0	        | impossible! |
| 0-49	       | failed      |
| 50-59	      | 1           |
| 60-69	      | 2           |
| 70-79	      | 3           |
| 80-89	      | 4           |
| 90-100	     | 5           |
| > 100	      | incredible! |


Hint: 
Use chained `if-else` statement. 

**Sample Output:**
```text
Random points:  75

Grade:  3
```

<br>
<br>


## 📑`counting`
Given the randomly generated number between `10 ~ 34`, print numbers from 0 to the generated random number `a`.   

**Sample Output:**
```text
Generated number: 13

0
1
2
3
4
5
6
7
8
9
10
11
12
13
```


<br>
<br>


## 📑`randomStop`
Write a code that prints number from `1 ~ 50`. Once that code is complete, now modify the code such that as it prints from `1 ~ 50`, it abruptly stops the printing when the randomly generated number is encountered in the printing process. 

**Sample Output:** 

```text
Stop at: 10

printing up to 50
-----------------
0
1
2
3
4
5
6
7
8
9
10
```


## 📑`randomSkip`
Write a code that prints number from `1 ~ 20`. Once that code is complete, modify the code such that as it prints from `1 ~ 20`, it skips the printing of number that matches with randomly generated number `a` and `b`.

**Sample Output:** 

```text
Should skip at: 8 and 13

printing up to 20
-----------------
0
1
2
3
4
5
6
7
Skipping!
9
10
11
12
Skipping!
14
15
16
17
18
19
20
```

<br>
<br>


## 📑`countDown`
Write a code that counts down from randomly generated integer `a` to the `0`. Please make use of `while` loop for this task.  Any other loop mechanisim is not allowed. 

**Sample Output:** 
```text
Counting down from: 14
----------------------
14
13
12
11
10
9
8
7
6
5
4
3
2
1
0
```

<br>
<br>


## 📑`fixArrayCode`

When you run the following code, you will get programming error.  Please make a necessary code change to so that extracting the last item will succeed. 

Faulty Code:
```java
public void fixArrayCode() {
    //                   1         2         3        4         5
    String[] fruits = {"apple", "orange", "grape", "tomato", "melon"};
    int idx = 5;
    String extracted = fruits[idx];
    System.out.println("Fetched Item: " + extracted);
}
```

Expected Output: 
```text
Fetched Item: melon
```


<br>
<br>


## 📑`sumOfArray`
Given the random integer array `scores`, use `while` loop to calculate the sum of all number elements it contains and
display to the console. 

**Sample Output:**
```text
scores: [157, 165, 117, 78, 146, 129, 36, 48, 194, 125]
Sum: 1195
```

