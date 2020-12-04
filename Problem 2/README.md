For this problem the main issue is how we´re going to check for palindromes through different substring of the string, the goal is to in the end be able to calculate 
how many palindromes there is. My approach was to use a recursive call passing a new version of the string removing the first character and in every iteration to use a 
for loop to check the substrings from start to an specific value if it matched its version in reverse, this might make a lot of extra work but was the best idea I could 
come out using recursion. At the end we add the length of the string to count each character as a palindrome and add if the whole string is a palindrome, we also add 
one more thus counting each possibility.
My first approach to how to solve this was to think which language deals better with strings, python was my choice as it can reverse strings pretty easily, then I 
needed to find how to separate into different substrings to be able to check all of them if they were palindrome in a recursive way. After finally thinking on a 
sum and substring recursive call it was a matter of testing it on paper, the testing on paper got a bit confusing as a bit larger test cases had to be done to check 
if everything was correct, and the few palindromes I knew were a bit long. After  the test made more sense and looked right it was ready to be coded.
