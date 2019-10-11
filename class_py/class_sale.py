__author__ = "soskill"



class Invoice(object):
    def __init__(self,inv_no,sale_am,tax = 0.085):
        self.inv_no = inv_no
        self.sale_am = sale_am
        self.tax = tax
        self.tax_applied()
        
    def tax_applied(self):
        self.tax_am = self.tax*float(self.sale_am)
        
    
    def display(self):
        print()
        print ("Invoice Number:\t\t{}".format(self.inv_no))
        print ("Sale Amount:\t\t{}".format(self.sale_am))
        print ("Sales Tax:\t\t{}".format(self.tax_am))
        print()
        
        
a = 0
b = 0  
while True:
    a = int(input("Enter the invoice number ---> "))
    b = int(input("Enter the Sale Amount ---> "))
    if a in range(10001,20003) and b > 0:
        break
    else:
        print ("\nTry Again!\n")

        
inv = Invoice(inv_no=1,sale_am=b)

inv.display()
        