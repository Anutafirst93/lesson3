package Req;

/**
 * Created by IT_School on 20.11.2015.
 */
public class Request {
    //private int paramCnt=0; //нельзя!!!
    private Query q;
    static class Query {
        public Query (String [] s){
            //paramCnt = s.length; //вложенные
        }
    }
    public Query getQuery(){
        return this.q;
    }
}
