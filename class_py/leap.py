print ('Enter the year')
print ('>> ',end='')
x = int(input())
print ("It is a leap year") if x%4==0 and x%400 == 0 else print ("It is not a leap year")