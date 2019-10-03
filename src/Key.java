public class Key {
   final String name;
   final String password;

    public Key(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getType() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
