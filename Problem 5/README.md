For problem 5 the idea I had was to recursively iterate a list of lists and in each iteration check if the next pair works with the current head, if it doesn’t 
we remove that pair and pass again the same list of pairs, but if it does work we append the current head to a list to be returned later and also append the recursive 
call of the list, this way we can start forming a new list were our result is being stored, ignore the pairs that doesn’t work and return a finished new list of list.

The way I tackled this problem was by first understanding what prevented the current list to be a solution, there are some pairs that break the cycle so this need to be 
removed, the goal at the end of the problem is to have a continues list that follow the order, this by assuming the list is ordered beforehand. After that I tried to 
think on different approaches, my first approach was to create a 3d list of lists that was going to keep appending to different indexes the pairs to form multiple 
probable lists and then find the longest and test it but that resulted in great inefficiency and was the wrong approach, this was found when drafted the idea, also the 
recursive call would have needed too many things passed to it including current index of current list, the final list and the current list. Then after reading the 
problem in a more detailed way it was realized that the problem doesn’t say anything about changing the original list of pairs, so my approach was to remove elements 
that break the rule and keep giving a new version of the list with a different “head” to keep checking the next values but after doing this on paper it also showed a 
problem, how was it supposed to show the list at the end, so the solution that came to my mind was to create a new list where we append the pairs that don’t break the 
rule and we do this in a recursive way thus getting a better option to solve the problem.
