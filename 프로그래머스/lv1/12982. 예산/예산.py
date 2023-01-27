def solution(d, budget):
    answer = 0
    arr = sorted(d)
    for i in arr:
        if budget-i >= 0:
            budget -= i
            answer += 1
        else:
            break

    return answer