n1=int(input("enter the number"))
n2=int(input("enter the number"))
operation=input("enter the operation ")

if operation == '+':
    result = n1+n2
    print(result)
elif operation == '-':
    result = n1-n2
    print(result)
elif operation == '/':
    result = n1/n2
    print(result)
elif operation  == '*':
    result = n1*n2
    print(result)
else:
    Print(" invalid operation")
