import re

x = input("Enter the string : ")

while True:
    if re.findall(r'\w{4,}\d{4,}',x) == [] and re.findall(r'\d{4,}\w{4,}',x) == []:
        print("Invalid format !\n Please try again\n\n")
        x = input("Enter the string : ")
    else:
        break
    