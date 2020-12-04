def palindrome(string, sum):
    if len(string == 1):
        return 1
    for x in string:
        if string[:x] == string[:x:-1]:
            return sum+1
    sum += palindrome(string[1:],sum)
    if(string == string[::-1]):
        sum+= 1
    sum += len(string)
    return sum