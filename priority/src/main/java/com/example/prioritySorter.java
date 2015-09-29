//This program prioritizes your to do list based on Stephen Covey's matrix
package com.example;

public class prioritySorter
{
    static public void main(String args[])
    {
        //This array holds your tasks
        String item[] = {"Java Homework", "iOS Homework", "Work on College Apps", "Watch TV",
                         "Watch strange birds of prey circle the house", "Work on scholarship app",
                         "Check email", "Read dumb texts from friends"};

       //This array parallels the item array and holds Boolean value for urgency
        boolean isUrgent[] = {true, true, false, false, true, false, true, true};

        //This array parallels other two and holds Boolean value for importancec
        boolean isImportant[] = {true, true, true, false, false, true, false, false};

        int caseNum = 0;                //Holds the case number for the switch statement
        int priorityCounter = 0;        //Holds index number for populating priority array
        int secondPriorityCounter = 0;
        int thirdPriorityCounter = 0;
        int unimportantCounter = 0;

        //These next arrays are used to list items in order of importance
        String topPriorityArray[] = new String[10];
        String secondPriorityArray[] = new String[10];
        String thirdPriorityArray[] = new String [10];
        String doNotDoArray[] = new String[10];

        //This section with the for loop is mostly here in place of user input
        System.out.println("Here are the items on your unsorted list: ");
        for (int i = 0; i < 8; i++)
        {
            System.out.println(item[i]);
            if (isUrgent[i])
            {
                System.out.println("This is urgent");
            }
            else
                System.out.println("This is not urgent");

            if (isImportant[i])
            {
                System.out.println("This is important");
            }
            else
                System.out.println("This is not important");
            System.out.println("");

            //This section assigns each item to a case based on urgency and importance
            if (isUrgent[i] && isImportant[i])
            {
                caseNum = 0;
            }
            else if (isUrgent[i] && !isImportant[i])
            {
                caseNum = 1;
            }
            else if (!isUrgent[i] && isImportant[i])
            {
                caseNum = 2;
            }
            else
            {
                caseNum = 3;
            }

            //Switch statement to populate priority arrays
            switch (caseNum)
            {
                case 0:
                {
                    topPriorityArray[priorityCounter] = item[i];
                    priorityCounter++;
                    break;
                }
                case 1:
                {
                    thirdPriorityArray[thirdPriorityCounter] = item[i];
                    thirdPriorityCounter++;
                    break;
                }
                case 2:
                {
                    secondPriorityArray[secondPriorityCounter] = item[i];
                    secondPriorityCounter++;
                    break;
                }
                case 3:
                {
                    doNotDoArray[unimportantCounter] = item[i];
                    unimportantCounter++;
                    break;
                }
                default:
                    System.out.println("This is an incomplete entry");
            }



        }
        //This section displays the results
        System.out.println("Do these things first: ");
        for (int x = 0; x < 2; x++)
        {
            System.out.println(topPriorityArray[x]);
        }
        System.out.println("");
        System.out.println("Then do these: ");
        for (int i = 0; i < 2; i++)
        {
            System.out.println(secondPriorityArray[i]);
        }
        System.out.println("");
        System.out.println("Then you can worry about these: ");
        for (int num = 0; num < 3; num++)
        {
            System.out.println(thirdPriorityArray[num]);
        }
        System.out.println("");
        System.out.println("Don't even do these: ");

        for (int x = 0; x < 1; x++)
        {
            System.out.println(doNotDoArray[x]);
        }
    }
}
