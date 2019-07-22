fin = open("gift1.in", "r")
fout = open("gift1.out", "w")
n = int(fin.readline())

name = list()
mon = list()
for i in range(n):
    name.append(fin.readline())
    mon.append(0)
for i in range(n):
    giver = fin.readline()
    gi = name.index(giver)
    gift, ppl= map(int, fin .readline().split(" "))
    if ppl == 0:
        continue
    gm = gift//ppl
    mon[gi] = mon[gi] - gift + gift%ppl
    for j in range(ppl):
        rcvr = fin.readline()
        ri = name.index(rcvr)
        mon[ri] += gm
for i in range(n):
    fout.write(name[i][:-1] + " " + str(mon[i]) + "\n")
fin.close()
fout.close()