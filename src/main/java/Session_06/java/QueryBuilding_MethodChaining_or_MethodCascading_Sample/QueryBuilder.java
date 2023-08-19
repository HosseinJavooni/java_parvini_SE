package Session_06.java.QueryBuilding_MethodChaining_or_MethodCascading_Sample;

public class QueryBuilder {
    String query;
    String items;
    String table;

    public QueryBuilder select(String Items){
        query ="SELECT " + Items;
        return this;
    }
    public QueryBuilder from(String table){
        query = query + " FROM " + table;
        return this;
    }
    public QueryBuilder where(String conditions){
        query = query + " WHERE " + conditions;
        return this;
    }
    public void print(){
        System.out.println(query);
    }
}
