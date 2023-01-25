def solution(food):
    list =[food[i]//2 for i in range(1, len(food))]

    res = ''
    for number, remainder in enumerate(list,start=1):
        print(number,remainder)
        if remainder == 0:
            pass
        else:
            res += str(number) * remainder
    print(res)
    return res + '0' + res[::-1]