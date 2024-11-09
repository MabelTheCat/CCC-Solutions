count = int(input())

values: list[int] = []
for i in range(count):
    v = int(input())
    values.append(v)


values.sort()
values.reverse()


v = values[0]
values = values[values.count(v):]

v = values[0]


print(f"{v} {values.count(v)}")