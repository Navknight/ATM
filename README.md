ATM
ATM software on java by CS21B060 
-This project is an ATM interface which uses java -In this project, I am using a CSV file to store all the account numbers, account PINs, account holder names and account balances 
-The CSV file - "Database.csv" holds all the information -I have written a reader and a writer object to read and write the CSV file 
-The reader object has the method "reader" which takes as input the location of the CSV file and the ArrayList in which it should load the data and reads the CSV file and loads all the data into a PRIVATE ArrayList called "data". 
-This data ArrayList is used throughout the software to access account data using the get and set methods 
-The writer object has a method "write", this method has two arguments - the location where to save the database and the ArrayList data from which it reads all the data and makes a CSV file. 
-I created a CSV file so that the account information doesn’t need to be input, again and again, every time the program is rerun. 
-We have an ABSTRACT class "Change" which is extended by classes which can change the terminal window, such as the clearscreen object which has a method which clears the screen of all terminals that support ANSI escape codes such as the Linux/mac/bash terminals, this method, unfortunately, doesn’t work on the IDE terminal and Command Prompt.
 -There are many test cases we can use
 1)Account number - 70878, PIN - 7928 
 2)Account number - 97387, PIN - 68273 
after entering these account numbers and pins, the system will ask the user for the action they want to do on the account which they can do by entering the appropriate number just like a real ATM.
 -I would recommend running the program on Bash or IntelliJ terminal to not get any unwanted characters due to the clearscreen() method

