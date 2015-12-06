package org.sopt.patterns.impl.template;

public class TaskImpl extends Task<String, String> {

    private String message;
    public TaskImpl(String message) { this.message = message; }

    @Override
    public String onPreExecute() {

        super.onPreExecute();
        return message.toUpperCase();
    }

    @Override
    public String doInBackground(String str) {

        String result = str.split(", ")[0];

        System.out.println("2 - a. TaskImpl.doInBackground(String str) called after TaskImpl.onPreExecute().");
        System.out.println("2 - b. From TaskImpl.onPreExecute() : " + str);

        return result;
    }

    @Override
    public void onPostExecute(String result) {

        super.onPostExecute(result);
        System.out.println("4. Result for TaskImpl.doInBackground() : " + result);
    }
}
