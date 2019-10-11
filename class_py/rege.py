import re

a = re.compile(r"[0-9]")
b = re.compile(r"[a-z]")
c = re.compile(r"\W")
d = re.compile(r"[A-Z]")

u = input("Enter the password : ")
while True:
    if len(u) >= 6 and len(u) <= 25 and a.search(u) and b.search(u) and c.search(u) and d.search(u):
        print("Password is correct!")
        break
    else:
        print("Invalid password!\n\n")
        u = input("Enter the password : ")