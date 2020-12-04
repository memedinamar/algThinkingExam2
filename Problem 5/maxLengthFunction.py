def maxLength(list):
    listA = []
    if len(list) == 1:
        listA.append(list)
    if list[0][1] >= list[1][0]:
        del list[1]
        listA.append(maxLength(list))
    else:
        listA.append(maxLength(list[1:]))
    return listA