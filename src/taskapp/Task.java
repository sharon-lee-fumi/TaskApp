package taskapp;

/**
 *
 * @author Xiaowen Li
 */
public class Task 
{
    private String description;

    public Task(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
      
    public boolean completeTask()
    {
        return true;
    }
}
