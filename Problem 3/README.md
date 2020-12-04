For this problem I realized that the return type of this problem is a Boolean and my recursive call would be using an or operand. By getting the difference between 
the first 2 numbers and passing that to the call plus a new version of the list without the first element we can use an or operand to check it at any moment the 
problem fails. Two base cases will be on place, the first one in the case that we reached the last two numbers from the list we would return true, making all our 
previous iterations be all true so our or operation will return true at the end, the second base case would be to return false if at any moment the difference between
two numbers is not the same one as the previous, thus returning one false that with the or operand will make the whole thing be false.

My way of storing the solution is on a single variable storing a Boolean attribute that will remain true if the recursive call remains true and will change if at 
any moment the iterations fails.

For the way I tackled this problem first the main thing to do was to understand the problem, in this case was to find if a sequence of numbers is arithmetic, 
and the goal was to analyze all of them to find if the difference between each of them is the same always so in our recursive call we never change the value of 
the variable with the difference. One of the solutions I though was to get the length of the list and subtract the previous number to the new one and see if it was 
the same as the difference but this was a bit too complicated, later the realization of the use of Booleans was the one that helped reached the current implementation.
After an implementation was decided for testing again drafts were made on paper to test this implementation, based on some trials it was clear to me that the 
main issue was to get the difference for the very first iteration, setting the first call from the main to 0 and calculating the difference for the next call was 
problematic and at the end the best way to avoid this problem was for the difference to be calculated before the method was called the first time in the main, 
this served as the path to solve the problem.
