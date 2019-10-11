__author__ = "soskill"


from tkinter import *
from tkinter import messagebox

window = Tk()
h = StringVar()
v = StringVar()
k = StringVar()
window.configure(background = "cyan")

window.geometry("300x300")
window.title("Payroll Calculator")

def disp():
    myDict = {1:150,2:200,3:250}
    hours = int(h.get())
    skill = int(v.get())
    rate = int(k.get())
    grossPay = hours*myDict[skill]
    incomeTax = grossPay*float(rate/100)
    netPay = grossPay - incomeTax
    messagebox.showinfo("Result","Gross Pay = {}\nIncome Tax = {}\nNet Pay = {}\n".format(grossPay,incomeTax,netPay))



Label(window,text="Working hours").grid(row=0,column=0)
Entry(window,textvariable = h).grid(row=1,column=0)

Label(window,text="---------------------------------------------").grid(row=2,column=0)
Label(window,text="Skill Level").grid(row=3,column=0)
Radiobutton(window,text="1",variable=v,value="1").grid(row=4,column=0)
Radiobutton(window,text="2",variable=v,value="2").grid(row=5,column=0)
Radiobutton(window,text="3",variable=v,value="3").grid(row=6,column=0)

Label(window,text="---------------------------------------------").grid(row=7,column=0)
Label(window,text="Tax Rate").grid(row=8,column=0)
Radiobutton(window,text="Single rate (18%)",variable=k,value="18").grid(row=9,column=0)
Radiobutton(window,text="Family rate (15%)",variable=k,value="15").grid(row=10,column=0)

Button(window,text="Calculate",command=disp).grid(row=11,column=0)

window.mainloop()
