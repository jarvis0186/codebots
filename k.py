f=open("try.txt", "r")
count=0
s=0
x=[]
c=f.read(1)
while True:
    while (count!=2):
        x.append(c)
        c=f.read(1)
        count=count+1
        if not c:
            break

    if not c:
        break
