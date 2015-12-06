package org.sopt.patterns.impl.template;

public abstract class Task<T, U> {

    public void execute() {

        T t = onPreExecute();
        U u = doInBackground(t);

        onPostExecute(u);
    }

    public abstract U doInBackground(T t);

    public T onPreExecute() {

        System.out.println("1. Task.onPreExecuted() called.");
        return null;
    }

    public void onPostExecute(U result) {

        System.out.println("3. Task.onPostExecuted(U result) called.");
    }
}
