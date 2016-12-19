package taskapp;

import java.util.Date;

/**
 *
 * @author Xiaowen Li
 */
public class TaskWithDeadline extends Task
{
    private Date dueDate;

    public TaskWithDeadline(String description)
    {
        super(description);
        this.dueDate = new Date();
    }

    public Date getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(Date dueDate)
    {
        this.dueDate = dueDate;
    }
   
    
}
