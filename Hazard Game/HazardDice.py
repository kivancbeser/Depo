#winlerde +1 tl ekleniyor balance
#loselarda balancede degisiklik olmuyor

import random

result_1 = 0

def roll_dice():
    dice_1 = random.randint(1,6)
    print("First dice :")
    print (dice_1)
    dice_2 = random.randint(1,6)
    print("Second dice :")
    print (dice_2)
    total = dice_1 + dice_2
    print("Total :")
    print (total)
    return total

def win(balance_1,counter_1):
    counter_1 = counter_1
    balance_1 = balance_1 + 1
    print("you win and getting 1 TL")
    print("now balance:")
    print(balance_1)
    play(balance_1,counter_1)
		
def lose(balance_1,counter_1):
    balance_1 = balance_1
    print("you lose")
    counter_1 = counter_1 + 1
    print (counter_1)
    print ("times")
    play(balance_1,counter_1)

def win_2(balance_2,counter_2):
    counter_2 = counter_2
    balance_2 = balance_2 + 1
    print("you win and getting 1 TL")
    print("now balance:")
    print(balance_2)
    playy(balance_2,counter_2)
		
def lose_2(balance_2,counter_2):
    balance_2 = balance_2
    print("you lose")
    counter_2 = counter_2 + 1
    print (counter_2)
    print ("times")
    playy(balance_2,counter_2)

def playy(balance_2,counter_2):
        if(counter_2 == 3):
            print("Second Player Game Over")
            print("Second Player Balance:")
            print(balance_2)
            compare(balance_1,balance_2)
        else:
            g_main = random.randint(5,9)
            print("main value")
            print(g_main)
            total = roll_dice()
            if(total == g_main):
                win_2(balance_2,counter_2)
            else:
                if(total == 2 or total == 3):
                    lose_2(balance_2,counter_2)
                elif(total == 11 or total == 12):
                    if(g_main == 5 or g_main ==9):
                        lose_2(balance_2,counter_2)
                    elif(g_main == 6 or g_main == 8):
                        if(total == 11):
                            lose_2(balance_2,counter_2)
                        elif(total == 12):
                            win_2(balance_2,counter_2)
                    elif(g_main == 7):
                        if(total == 11):
                            win_2(balance_2,counter_2)
                        elif(total == 12):
                             lose_2(balance_2,counter_2)
                else:
                    otherrule_2(total,balance_2,counter_2,g_main)

def play(balance_1,counter_1):
        
        if(counter_1 == 3):
            print("First Player Game Over")
            print("First Player Balance:")
            print(balance_1)
            global result_1
            result_1 = balance_1
            balance_2=0
            counter_2=0
            playy(balance_2,counter_2)
        else:
            g_main = random.randint(5,9)
            print("main value")
            print(g_main)
            total = roll_dice()
            if(total == g_main):
                win(balance_1,counter_1)
            else:
                if(total == 2 or total == 3):
                    lose(balance_1,counter_1)
                elif(total == 11 or total == 12):
                    if(g_main == 5 or g_main ==9):
                        lose(balance_1,counter_1)
                    elif(g_main == 6 or g_main == 8):
                        if(total == 11):
                            lose(balance_1,counter_1)
                        elif(total == 12):
                            win(balance_1,counter_1)
                    elif(g_main == 7):
                        if(total == 11):
                            win(balance_1,counter_1)
                        elif(total == 12):
                             lose(balance_1,counter_1)
                else:
                    otherrule(total,balance_1,counter_1,g_main)
                    
def otherrule(total,balance_1,counter_1,g_main):
    chance=total
    total = roll_dice()
    while(total != chance or total != g_main) :                                          
        if(total == chance):
            win(balance_1,counter_1)
        elif(total == g_main):
            lose(balance_1,counter_1)
        else:
            otherrule(total,balance_1,counter_1,g_main)
def otherrule_2(total,balance_2,counter_2,g_main):
    chance=total
    total = roll_dice()
    while(total != chance or total != g_main) :                                          
        if(total == chance):
            win_2(balance_2,counter_2)
        elif(total == g_main):
            lose_2(balance_2,counter_2)
        else:
            otherrule_2(total,balance_2,counter_2,g_main)

def compare(balance_1,balance_2):
    print("*********Result*******")
    print("First Player Balance:")
    print(result_1)
    print("Second Player Balance:")
    print(balance_2)
    if(result_1 > balance_2):
        print("First Player Win")
    elif(result_1 == balance_2):
        print("First Player And Second Player Equal")  
    else:
        print("Second Player Win")
    exit()
        
balance_1 = 0
balance_2 = 0
counter_1 = 0
counter_2 = 0
print ("First player playing")
print(play(balance_1,counter_1))
print ("Second player playing")
print(playy(balance_2,counter_2))
