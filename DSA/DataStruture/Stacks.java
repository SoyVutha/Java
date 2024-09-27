package DSA.DataStruture;

import java.util.Stack;
public class Stacks {
    // Stack = a data structure, First in , Last out
    // Stack = stores values like a tower from bottom to the top
    //push() = add items from the last
    //pop()  = delete item from the last 
    public static void main(String[] args) {
        Stack<String> game = new Stack<String>();

        game.push("Minecraft");
        game.push("Fortnite");
        game.push("Call of Duty");

        System.out.println(game.empty());//game.empty = check if the stack is emtpy or not
        System.out.println("The top element: "+game.peek());//game.peek = check the top element of the stack without removing it
        System.out.println("All element: "+game);
        System.out.println(game.size());// check thee size
    }
}
