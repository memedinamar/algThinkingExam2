For this problem I would make the recursive call to get two strings, my base case would be when the one of the strings is empty or if the strings are the same then 
return 0, this ending the recursive call. Before we can think on the recursive call, we need to make sure of things we change to the string before we pass it. First 
we need to find which string is longer or if they have the same length, this will check from which string to delete the char and if we need to delete the char, if str1 
is longer or equal than str2 then we are editing str2, if not we edit str2. Then we check if the first character of the string we are editing is equal to the first 
character of our second string, if not we need to check if the char appears on the second string to know if we´re going to keep it or not, if we don’t keep it we 
make a recursive call adding to sum the ascii value of the letter we took of + the recursive call passing the substring starting at 1 of our edited string and our 
unedited string.

The way I’m keeping track of the solution and the subproblems is storing the ascii value of the removed letter + the recursive call using the new strings, this way 
we make sure of keep track of the values of removed letters while recursively getting the answer until the strings are the same or we moved through the entire strings.

For this problem the way I approached it was first to find what was the issue, in this case that 2 strings weren’t the same, after that my goal was to count the value 
of the characters that needed to be removed to get this strings to be the same. Having the limitation of a recursive dynamic solution I asked myself what thing I can 
pass to the recursive call to solve this problem, I was thinking passing the 2 strings and maybe a counter of the current char that was being analyzed but that wouldn’t 
be really effective in the recursive call so I thought of passing a substring of the strings while “deleting” chars. This last option is the solution I approached so I
did a draft on how it would look, what things were needed to consider and how to make progress with the recursive call. While testing a bit on paper I realized there were 
some things I needed to check to be able to eliminate chars, which string I was checking, how long it was, if the character appeared later on the second string or 
not, this extra stuff helped mold a bit more my solution. Each recursive call and test was a sub version of the problem. 
