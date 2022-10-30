# ATM
ATM software on java by CS21B060
-This project is an ATM interface which uses java
-In this project I am using a CSV file to store all the account numbers, acconunt PIN's, account holder names and account balances
-The csv file - "Database.csv" holds all the information
-I have written a reader and a writer object to read and write the csv file 
-The reader object has the method "reader" which takes as input the location of the csv file and the ArrayList in which it should load the data to and reads the csv file and loads all the data into a PRIVATE ArrayList called "data".
-This data ArrayList is used throughout the software to access account data using the get and set methods
-The writer object has a method "write", this method has two arguments - the location where to save the database and the Arrayist data from which it reads all the data and makes a csv file.
-I created a CSV file so that the account information doesnt need to be input again and again everytime the program is rerun.
-We have an ABSTRACT class "Change" which is ectended by classes which have the ability to change the terminal window, such as the clearscreen object which has a method which clears the screen of all terminals that support ANSI escape codes such as the linux/mac/bash terminals, this method unfortunately doesnt work on the IDE terminal and Command Prompt.
-There are many testcases we can use
	1)Account number - 70878, PIN - 7928
	2)Account number - 97387, PIN - 68273
	after entering these account numbers and pins, the system will ask the user for the action they want to do on the account which they can do by entering the appropriate number just like a real ATM.
-I would recommend running the program on Bash or IntelliJ terminal to not get any unwanted characters due to the clearscreen() method

