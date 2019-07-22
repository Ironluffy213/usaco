import random
mon = 10
while(True):
    bet = input("Input bet money between $1 and $4: ")
    if bet > 4 or bet < 0:
        print("Error! Please input an amount between $1 and $4!")
        continue
    if bet > mon:
        print("Insufficient amount of money")
        continue
    if bet == 0:
        break
    d1 = random.randint(1,6)
    d2 = random.randint(1,6)
    d3 = random.randint(1,6)
    print("Die 1: " + str(d1))
    print("Die 2: " + str(d2))
    print("Die 3: " + str(d3))
    if d1 == d2 and d2 == d3:
        bet = bet * 10
        print("All dice are the same! You got 10 times the bet! $" + str(bet)) 
    elif d1 == d2 or d1 == d3 or d2 == d3:
        bet = bet * 7
        print("2 dice are the same! You got 7 times the bet! $" + str(bet))
    elif d1%2 == 0 and d2%2 == 0 and d3%2 == 0:
        bet = bet*5
        print("All dice are even! You got 5 times the bet! $" + str(bet))
    elif  d1%2 == 1 and d2%2 == 1 and d3%2 == 1:
        bet = bet*5
        print("All dice are odd! You got 5 times the bet! $" + str(bet))
    else:
        bet = bet * -1
        print("All dice are different! You lost the bet! $" + str(bet)) 
    mon += bet
    print(mon)
    if mon == 0:
        break
print("You fold this game")
print("You have $" + str(mon))