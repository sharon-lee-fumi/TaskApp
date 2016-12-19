package taskapp;

/**
 *
 * @author Xiaowen Li
 */
public class RecurringTask extends Task
{
    private int numTimesCompleted;
    public RecurringTask(String description, int numTimesCompleted)
    {
        super(description);
        this.numTimesCompleted = numTimesCompleted;
    }

    public int getNumTimesCompleted()
    {
        return numTimesCompleted;
    }

    public void setNumTimesCompleted(int numTimesCompleted)
    {
        this.numTimesCompleted = numTimesCompleted;
    }

    
    public boolean completeTask()
    {
        return false;
    }
}
