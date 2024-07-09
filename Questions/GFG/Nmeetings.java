import java.util.Arrays;
import java.util.Comparator;

public class Nmeetings {
    public static int Solve(int []start,int []end,int n)
    {
        //Step 1 create an array
        Meeting []meeting=new Meeting[n];
        for(int i=0;i<n;i++)
        {
            meeting[i]=new Meeting(start[i],end[i]);
        }

        //Sort array wrt to their end time
         Arrays.sort(meetings, new Comparator<Meeting>() {
            public int compare(Meeting a, Meeting b) {
                return a.end - b.end;
            }
        });
        
        //find the max meetings using greedy algo
        int count=0;
        int limit=0;
        for(int i=0;i<n;i++)
        {
            if(meeting[i].start>limit)
            {
                count++;
                limit=meeting[i].end;
            }
        }
        return count;
    }
    //inner class
    class Meeting
    {
        int start;
        int end;
        Meeting{
            this.start=start;
            this.end=end;
        }
    }
}

