Java Thread Example
This is a simple Java program that demonstrates how to create a thread and use some of its various methods. The program creates a ThreadExample class that extends Thread and overrides its run method to print out a message saying that the thread is running. The program then creates an instance of this class, starts the thread running, and waits for it to complete.

The program then uses various methods to get information about the thread and manipulate its behavior. These methods include:

isAlive: Checks if the thread is still running.
setPriority and getPriority: Sets and gets the thread's priority.
setName and getName: Sets and gets the thread's name.
getId: Gets the thread's ID.
getState: Gets the thread's current state.
isDaemon and setDaemon: Sets and gets whether the thread is a daemon thread.
The program outputs the results of calling these methods to the console.

How to Run the Program
To run the program, you need to have Java installed on your computer. You can then compile and run the program using the following commands in a terminal or command prompt:

sh
Copy code
$ javac ThreadExample.java
$ java ThreadExample
You should see the message "Thread is running." printed to the console, followed by information about the thread's state, priority, name, ID, and whether it is a daemon thread.
