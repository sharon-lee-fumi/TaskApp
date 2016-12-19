package taskapp;

import java.util.ArrayList;

/**
 *
 * @author Xiaowen Li
 */
public class TaskApp 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Task> tasks = new ArrayList<>();
        
        String task1 = "task1"; 
        tasks.add(new Task(task1));
        
        tasks.add(new RecurringTask("t3", 5));
        
        String task2 = "task2"; 
        tasks.add(new TaskWithDeadline(task2));
        
        String task3 = "task3"; 
        int numTimesCompleted = 3;
        tasks.add(new RecurringTask(task3, numTimesCompleted));
        System.out.println("befor remove");
        for (Task a : tasks)
        {
            System.out.println(a.getDescription());          
        }
/**
        for(int j = 0; j < tasks.size(); j++)
        {
            Task obj = tasks.get(j);
            if(obj.completeTask()==true)
            {
               //found, delete.
                tasks.remove(j);   
                j=j-1;
            }
        }
*/
        int x=0;
        while (x < tasks.size())
        {
            Task obj = tasks.get(x);
            
            if(obj.completeTask()==true)
            {
               //found, delete.
                tasks.remove(x);
            }
            else
            {
                x=x+1;
            }
        }
        
        System.out.println("after remove");
        for (Task a : tasks)
        {             
            System.out.println(a.getDescription());
        }
    }
}
