import random;
import math;

Answer=random.randint(1,100)
print("Welcome to the Guessing Game!")
byuesr=int(input("Enter a number between 1 and 100 : "))
atempt=1
while byuesr!=Answer:
    if byuesr<Answer:
        print("Too low!")
    else:
        print("Too high!")
    
    atempt+=1
    byuesr=int(input("Guess again: "))
print("You found the number in", atempt, "attempts")


