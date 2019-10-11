print ('###############################################')
print ('########## Welcome to hotel booking ###########')
print ('###############################################')

print ('Enter the number of days and rooms seperated by space')
print ('-->')

(days,rooms) = input().split()
days = int(days)
rooms = int(rooms)
print ('Total expenses = ',days*rooms*2500)