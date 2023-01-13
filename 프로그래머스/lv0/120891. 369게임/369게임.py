def solution(order):
    string = str(order)
    count = 0
    for i in string:
        if i == '3' or i == '6' or i == '9':
            count += 1
    return count
