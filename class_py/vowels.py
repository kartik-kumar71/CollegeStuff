__author__ = "kartik"

x = input("Enter the string :")
vowels = "aeiouAEIOU"
total = 0
for i in x:
    if i in vowels:
        total += 1
        
print ("No. of vowels = {}".format(total))