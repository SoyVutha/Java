while(True):

        num1=int(input("Enter the first number: "));
        num2=int(input("Enter the second number: "));
        print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        choice=int(input("Enter your choice: "));
        if choice==1:
            print(num1+num2);      
    
        elif choice==2:
            print(num1-num2);

        elif choice==3:
            print(num1*num2);

        elif choice==4:
            if(num2!=0):     
                print(num1/num2);
            else:
                print("Error! Division by zero is not allowed.");

        print("-----------------");
        cont=input("Do you want to continue (Y/N)");
        if cont=='N' or cont=='n':
             break;