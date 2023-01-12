def solution(my_str, n):
    answer = []
    while len(my_str) >= n :
        answer.append(my_str[:n])
        my_str = my_str[n:]

    if my_str != "":
        answer.append(my_str)
    return answer
