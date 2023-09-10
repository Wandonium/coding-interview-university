with open('numbers.txt', 'r') as reader:
    # Read and print the entire file line by line
    line = reader.readline()
    count = 0
    while line != '':   # The EOF char is an empty string
        count += 1
        num = int(line) * count 
        print(num, end='\n')
        line = reader.readline()