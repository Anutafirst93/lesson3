package Requ;

/**
 * Created by IT_School on 20.11.2015.
 */
public class Request {
    private int paramCnt=0;
    private Query q;
    class Query {
        public Query (String [] s){
            paramCnt = s.length;
        }
    }
        public Query getQuery(){
            return this.q;
    }
}
