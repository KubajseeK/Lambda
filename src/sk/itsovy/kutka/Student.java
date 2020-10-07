package sk.itsovy.kutka;

public class Student {

    String doSomething(String something, Activity activity) {
        return activity.activityMethod(something );
    }


    interface Activity {
        String activityMethod(String something);
    }
}