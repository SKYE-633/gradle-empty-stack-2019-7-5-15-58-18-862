public class Person {

    private String name;

    public void naming(Mobile mobile,String message,int messagelength){
        if(message.length()>messagelength) {
            mobile.call("<iPhone> Message cannot be sent");
        }
            else{
            mobile.call("<Andriod> Message cannot be sent") ;
        }
    }
}
