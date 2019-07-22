print("hello python")
print("input number 1: ")
a = int(input())
print("input number 2: ")
b = int(input())
c = a+b
print("addition is " + str(c))
c=a/b
print("division is " + str(c))
if a<b:
    print(str(a) + " is less than " + str(b))
elif a==b:
    print(str(a) + " is equal to  " + str(b))
else:
    print(str(a) + " is greater than " + str(b))