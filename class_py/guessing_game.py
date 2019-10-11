from random import randint

r = randint(1,10)

while True:
    x = int(input("Guess the number (0 to exit) ---> "))
    
    if x == 0:
        break
    elif x == r:
        print("You have guessed correctly! ")
        break
    elif x > r:
        print("Your guess is greater than the target number, try again!")
    elif x < r:
        print("Your guess is lesser than the target number, try again!")