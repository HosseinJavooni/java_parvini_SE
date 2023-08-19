package Session_06.java.QueryBuilding_MethodChaining_or_MethodCascading_Sample;

public class MainOfQueryBuilder {
    public static void main(String[] args){
        QueryBuilder query = new QueryBuilder();
        query
                .select("id, first_name, last_name")
                .from("Customer")
                .where("age <= 25")
                .print();
    }
}
