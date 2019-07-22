"""
ID: syk
LANG: PYTHON3
TASK: friday
"""
import datetime
fin = open("friday.in", "r")
f = open("friday.out", "w")
n = int(fin.readline())
date = [0,0,0,0,0,0,0]
for i in range(1900, 1900+n):
    for j in range(1, 13):
        x = datetime.datetime(i, j, 13)
        index = int(x.strftime("%w"))
        date[index] += 1
ans = str(date[6])
for i in range(6):
    ans += " " + str(date[i])
f.write(ans+"\n")
fin.close()
f.close()