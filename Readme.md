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


In order to run the application you will require **gradle**. 
The command will do the following things:
- compile and build the entire project
- run all tests
- show the outcome of each test e.g. Passed, Failed or Skipped)
- generate a test report in `../palindrome-finder/build/reports/unit-tests/index.html`
- generate a jacoco test coverage report in   ``../palindrome-finder/build/reports/coverage/test/index.html``

````
./gradlew clean build

````
Use your preferred browser to look at unit test and test coverage reports.


*Jacoco Report* (Can run separately)

````
./gradlew jacocoTestReport
````


***Run Application***
-


````
- cd ~/palindrome-finder
- ./gradlew clean build
- java -jar build/libs/palindrome-finder-1.0-SNAPSHOT.jar
````


***Build.gradle***


_Dependencies used_: 
- JUnit 4.12


***Assumptions***
-
- A single character can be a palindrome of itself.
- A space cannot be a palindrome.