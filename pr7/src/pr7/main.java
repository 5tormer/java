package pr7;

import java.util.*;

public class main
{
    public static void main(String[] args)
    {
        int temp = 0;
        Scanner in = new Scanner(System.in);
        Deque<Integer> deck1 = new ArrayDeque<>();
        Deque<Integer> deck2 = new ArrayDeque<>();
        for(int i=0; i<=4; i++)
            deck1.offer(in.nextInt());
        for(int i=0; i<=4; i++)
            deck2.offer(in.nextInt());
        for(int i=0; i<=106; i++)
        {
            temp = i;
            if (deck1.peek()!=null & deck2.peek()!=null)
            {
                if(deck2.peek()==0 & deck1.peek()==9)
                {
                    deck2.offer(deck1.poll());
                    deck2.offer(deck2.poll());
                }
                else if(deck1.peek()==0 & deck2.peek()==9)
                {
                    deck1.offer(deck1.poll());
                    deck1.offer(deck2.poll());
                }
                else if (deck1.peek() > deck2.peek())
                {
                    deck1.offer(deck1.poll());
                    deck1.offer(deck2.poll());
                }
                else if (deck2.peek() > deck1.peek())
                {
                    deck2.offer(deck1.poll());
                    deck2.offer(deck2.poll());
                }
            }
            else if (deck2.peek()==null)
            {System.out.println("first player wins! "+i); break;}
            else if (deck1.peek()==null)
            {System.out.println("second player wins! "+i); break;}
        }
        if(temp == 106)
            System.out.println("botva");
    }
}
