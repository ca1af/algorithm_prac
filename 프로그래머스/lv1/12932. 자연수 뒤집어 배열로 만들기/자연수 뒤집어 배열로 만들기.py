def solution(n):
    return list(map(int, reversed(str(n))))
    # return [int(i) for i in reversed(str(n))]