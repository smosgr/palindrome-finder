****PalindromeFinder-finder****
-


The application finds the 3 longest unique palindromes in a supplied string. For the 3 longest palindromes, it reports the palindrome, start index and length, in descending order of length.

As an example, the outcome will look like below:

```
Text: hijkllkjih, Index: 23, Length: 10
Text: defggfed, Index: 13, Length: 8
Text: abccba, Index: 5 Length: 6

````

***Application build***


In order to run the application you will required *gradle*. 
The following command will compile and  build the entire project. It will also run all tests, show each result seperately e.g. Passed, Failed or Skipped)
 and will generate a report in `../palindrome-finder/build/reports/unit-tests/index.html`  

````
./gradlew clean build

````
Then use your preferred browser to look at unit test report.


***Jacoco Report*** (Can be run separately)

Generates a test coverage report in ``../palindrome-finder/build/reports/coverage/test/index.html``.
````
./gradlew jacocoTestReport
````
Then use your preferred browser to look at the test coverage report.


***Run Application***

````
- cd ~/palindrome-finder


- java -jar build/libs/palindrome-finder-1.0-SNAPSHOT.jar
````


***Build.gradle***


_Dependencies used_: 
- JUnit 4.12


***Assumptions***
- A single character can be a palindrome of itself.
- A space cannot be a palindrome.