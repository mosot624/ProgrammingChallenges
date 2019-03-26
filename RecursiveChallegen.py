# -*- coding: utf-8 -*-
"""
Created on Mon Mar 25 10:15:33 2019

@author: Michael
"""

#http://www1.udel.edu/CIS/181/pconrad/05S/examples/recursion/recursion.problems


def changetoString(var,n,counter):
    if n == 1:
        var = int(var[0])
        return var
    elif counter == len(var):
        var = var[0]
        return var
    else:
        var[0] += var[counter]
        counter +=1
        return changetoString(var,n,counter)



if __name__ == "__main__":
    vad = 888
    val = []
    vas = list(str(vad))
    val = []
    for i in vas:
        val.append(int(i))
        
    print(changetoString(val,len(val),1))
    