def arithmetic(diff, list):
    if len(list) == 1:
        return True
    if (list[0]+diff) == list[1]:
        return arithmetic(diff, list[1:])
    return False