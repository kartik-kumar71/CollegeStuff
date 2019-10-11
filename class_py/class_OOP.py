class Account(object):
    def __init__(self,account_number,firstname,lastname,account_balance):
        self.firstname = firstname
        self.lastname = lastname
        self.account_balance = account_balance if account_balance > 0 else 0
        self.account_number = account_number if account_number > 100001 else 0
    def display(self):
        print (self.firstname)
        print (self.lastname)
        print (self.account_balance)
        print (self.account_number)
        

ob = Account(100,"kartik","kumar",32132)
ob.display()