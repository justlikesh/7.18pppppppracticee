public class Member {
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    public Member(Integer id, String name, Integer age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return  "id = "    + id     + "\n" +
                "name = "  + name   + "\n" +
                "age = "   + age    + "\n" +
                "email = " + email ;
    }

}
