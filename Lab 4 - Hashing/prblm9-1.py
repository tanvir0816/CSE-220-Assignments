x=str(input("enter a word:"))
count=0
for i in range(0,len(x)-1,1):
    if x[i] in "aeiou":
        count=count+1
print(count)
        