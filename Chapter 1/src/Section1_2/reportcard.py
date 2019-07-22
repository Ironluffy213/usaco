a=input("What is your name? ")
b=int(input("What is your grade? "))
c=int(input("What is your English score? "))
d=int(input("What is your Math score? "))
e=int(input("What is your Science score? "))
f = (c+d+e)/3
print("---------------")
print("REPORT CARD")
print("---------------")
print("NAME: " + str(a))
print("Grade: " + str(b))
print("English Score: " + str(c))
print("Math Score: " + str(d))
print("Science Score: " + str(e))
print("---------------")
print("Average: " + str(f))
if f >=90:
    print("A")
elif f>=80:
    print("B")
elif f>=70:
    print("C")
elif f >=60:
    print("D")
else:
    print("F")