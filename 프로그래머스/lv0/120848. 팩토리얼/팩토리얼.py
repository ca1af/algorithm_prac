import math

def solution(n):
    answer = 0
    for i in range(1, 12):
        if n < math.factorial(i):
            return i - 1
    return answer