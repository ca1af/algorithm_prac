def solution(n):
    answer = ''

    while n > 0:
        x = n % 3
        answer += str(x)
        n //= 3
        
    return int(answer, 3)
