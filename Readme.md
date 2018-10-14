****Palindrome-finder****


The application finds the 3 longest unique palindromes in a supplied string. For the 3 longest palindromes, it reports the palindrome, start index and length, in descending order of length.

As an example, the outcome will look like below:

```
Text: hijkllkjih, Index: 23, Length: 10
Text: defggfed, Index: 13, Length: 8
Text: abccba, Index: 5 Length: 6

````

***Application build***

````
./gradlew clean build
````
_*Jacoco Report* (Can be run separately)_
````
./gradlew jacocoTestReport
````

***Run Application***
````
cd ~/palindrome-finder

java -jar build/libs/palindrome-finder-1.0-SNAPSHOT.jar
````



***Build.gradle***

_Dependencies used_: 
` JUnit 4.12`
