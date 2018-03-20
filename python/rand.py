import random
import math

def rand_bit():
	return random.randint(0,1)
a=1
b=1024
sum=0
randList=[]
for i in range(a.bit_length(),b.bit_length()):
	randList.append(rand_bit())



for j in range(0, len(randList)):
	if randList[j]==1:
		sum=sum+pow(2, (len(randList)-(j+1)))

print sum+1
