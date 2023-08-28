class logs{
    String username,task;
    int year;
    //default constructor
    logs()
    {
        username="";
        task="";
        year=0;
    }
    //parametrized constructor
    logs(String name,String task, int year)
    {
        username=name;
        this.task=task;
        this.year=year;
    }
}

