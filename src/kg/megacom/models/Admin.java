package kg.megacom.models;

public class Admin extends Person {


    private String login;
    private String password;

    public Admin(String name, String login, String password) {
        super(name);
        setLogin(login);
        setPassword(password);
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login.length() > 5)
            this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() > 5)
            this.password = password;
    }

    @Override
    public void work() {
        System.out.println("managing");
    }
}
