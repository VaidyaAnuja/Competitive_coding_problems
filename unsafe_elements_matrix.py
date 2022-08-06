
#See the problem statement from below link
#https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/kshitiz-and-matrix-7ddc9719/

li = []
no = int(input("Enter the number of cases"))
for i in range(no):
    nm = input("Enter N and M")
    l = list(nm)
    l.remove(" ")
    for j in range(int(l[0])):
        ll = [int(ll) for ll in input("Enter multiple values: ").split()]
        for k in range(0, len(ll) - int(l[1])):
            ll.pop()
        li.append(ll)
    print(li)

small = li[0][0]
high = li[0][0]

for i in range(int(l[0])):
    for j in range(int(l[1])):
        if li[i][j]<small:
            small = li[i][j]
        if li[i][j]>high:
            high = li[i][j]

r_counter = []
c_counter = []

for i in range(int(l[0])):
    for j in range(int(l[1])):
        if li[i][j] == small or li[i][j] == high:
            if i not in r_counter:
                r_counter.append(i)
            if j not in c_counter:
                c_counter.append(j)
                
out = (int(l[0])-len(r_counter)) * (int(l[1])-len(c_counter))
print(out)
