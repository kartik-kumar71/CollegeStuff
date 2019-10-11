lst = list(map(float,input("Enter the weight loss seperated by space ---> ").split()))
while min(lst) <= 0:
    print ("Invalid input (weights should be greater than 0)")
    lst = list(map(float,input("Enter the weight loss seperated by space ---> ").split()))
print ('The average weight loss is {}'.format(sum(lst)/len(lst)))