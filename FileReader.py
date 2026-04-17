#File reading program

def readFile(file):
    lines = []
    with open(file, "r"):
        for line in file:
            lines.append(line)