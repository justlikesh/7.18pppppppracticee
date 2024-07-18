public interface Repository {
    public abstract void create(String name, Integer age, String email);
    public abstract void read(Integer id);
    public abstract void update();
    public abstract void delete();
}
