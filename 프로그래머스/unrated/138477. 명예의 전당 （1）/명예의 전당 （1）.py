def solution(k, score):
    answer = []
    arr = []
    for i in score:
        arr.append(i)
        if len(arr) > k:
            arr.remove(min(arr))
        answer.append(min(arr))
    return answer
