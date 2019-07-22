"""
ID: syk
LANG: PYTHON3
TASK: ride
"""
fin = open("ride.in", 'r')
f = open("ride.out", 'w')
a = fin.readline()
b = fin.readline()
ans = 1
for x in a:
    ans *= (ord(x)-64)
an = 1
for x in b:
    an *= (ord(x)-64)
if ans%47 == an%47:
    f.write("GO\n")
else:
    f.write("STAY\n")
