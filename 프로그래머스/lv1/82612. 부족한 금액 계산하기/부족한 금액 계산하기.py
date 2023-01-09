def solution(price, money, count):
    money2 = 0

    for i in range(1, count+1):
        money2 += price*i
        
    if money2 - money < 0:
        return 0
    else:
        return money2 - money
