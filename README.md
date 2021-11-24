# Spiker-ao3 redo

## Fixes for this resubmission

###### General:
>-less static methods, more object classes
>
>-all exercises now have a first commit of psuedocode, then code is added in subsequent commits

###### Exercise 24:
>Gradle test task now works for exercise 24

###### Exercise 28:
>re-did psuedocode, did not add a unit test because it's all just a main method. It literally
only contains one variable, one output statement, and one input statement. If I were to
restructure the code in order to make this exercise more testable, it would only make this
extremely simple program 10x more complicated than it needs to be.

###### Exercise 30:
>re-did psuedocode, did not add a unit test because it's all just a main method. It's just
a bunch of output in nested for loops, there's nothing to test.

###### Exercise 33:
>Separated the main method into two methods; the main method, and the eightBall method, which returns
a random string from an array of four. The main reason for doing this is so that I could make a unit test
for this exercise. This exercise also has a unit test now.

###### Exercise 35:
>Optimized method usage better; added unit testing for the method that randomly selects a winner

###### Exercise 37:
>Added a unit test for the createPassword method. Also fixed the create password method so that
it would properly generate a password if the number of special characters and numeric characters
was greater than half the minimum length (e.g. so there would always be at least as many letters
in the password as numeric and special characters combined)