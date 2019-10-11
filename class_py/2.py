print ('Enter the weight and the number of days to be boarded seperated by space')
print ('>> ')
(weight,days) = input().split()
days = float(days)
weight = float(weight)

print ('The total cost = ',50*days*weight)
