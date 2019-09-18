package prak_2;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String GetName(){
        return this.name;
    }
    public String GetEmail(){
        return this.email;
    }
    public char GetGender(){
        return this.gender;
    }
    public void SetName(String name){
        this.name=name;
    }
    public void SetEmail(String email){
        this.email=email;
    }
    public void SetGender(char gender){
        this.gender=gender;
    }
    public String toString(){
        return "author "+name+"("+gender+") at"+email;
    }
}
