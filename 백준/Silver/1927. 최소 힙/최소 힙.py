import sys
import heapq

n = int(sys.stdin.readline())
heap = [] # 배열

# 연산의 개수만큼 반복한다.
for i in range(n):
    x = int(sys.stdin.readline())

    # x가 0이라면 배열에서 가장 작은 값을 출력한다.
    if x == 0:

        # 배열이 비어 있으면 0을 출력한다.
        if heap:
            print(heapq.heappop(heap))
        else:
            print(0)

    # x가 0이 아니라면 배열에 x를 힙 푸시한다.
    else:
        heapq.heappush(heap, x)