__author__ = "Kartik"

(years,amount) = list(map(int,input("Enter the years and amount seperated by space ---> ").split()))
while years == 0 or amount == 0:
  print ("Incorrect values")
  (years,amount) = list(map(int,input("Enter the years and amount seperated by space ---> ").split()))
  

  
print (years*amount)
