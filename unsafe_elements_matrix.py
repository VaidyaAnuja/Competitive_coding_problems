
#See the problem statement from below link
#https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/kshitiz-and-matrix-7ddc9719/

li = []
T = int(input())
for i in range(T):
    N, M = input().split()
    for j in range(int(N)):
        ll = [int(ll) for ll in input().split()]
        for k in range(0, len(ll) - int(M)):
            ll.pop()
        li.append(ll)

    small = li[0][0]
    high = li[0][0]

    for i in range(int(N)):
        for j in range(int(M)):
            if li[i][j]<small:
                small = li[i][j]
            if li[i][j]>high:
                high = li[i][j]

    r_counter = []
    c_counter = []

    for i in range(int(N)):
        for j in range(int(M)):
            if li[i][j] == small or li[i][j] == high:
                if i not in r_counter:
                    r_counter.append(i)
                if j not in c_counter:
                    c_counter.append(j)
    out = (int(N)-len(r_counter)) * (int(M)-len(c_counter))
    print(out)
    li.clear()

