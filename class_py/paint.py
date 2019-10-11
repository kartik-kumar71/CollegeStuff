# -*- coding: utf-8 -*-
__author__ = "kartik"

def area(a,b,c):
    return 2*(b*c + c*a)
    
def q(u):
    return u/110
    
    
(x,y,z) = list(map(int,input("Enter length,breadth and height seperated by space :").split()))

quantity = q(area(x,y,z))

if int(quantity) < quantity:
    quantity = int(quantity) + 1
    
print ("Quantity of paint = {} liters".format(quantity))
print ("Total cost = {}".format(quantity*1000))
print ("COST = ₹" + str(quantity*1000))