# -*- coding: utf-8 -*-
"""
Created on Sat Mar 23 08:22:40 2019

@author: Michael
"""

def reverseFactorila(fact):
    number = 2
    while(True):
        if(fact==1):
            number-=1
            return number
        if(fact%number!=0):
            return "Null"
        elif(fact%number==0):
            fact /=number
            number+=1
        



#Recusive version of reverse factorial
def revFactorial(val,number):
    if val <= 1 and number == 2:
        return 1
    if val <=1 and number >=2:
        if (val).is_integer():
            return number -1
        else:
            return "Null"
    else:
        return revFactorial(val/number,number+1)

if __name__ == "__main__":
    print(revFactorial(7,2))