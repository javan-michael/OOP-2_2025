public class Main {

    public interface Operation {
        void execute();
    }


    public abstract static class Account {
        protected int id;
        protected String name;

        public Account(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void perform(Operation op) {
            System.out.print(name + " (" + id + ") -> ");
            op.execute();
        }
    }

    
    public static class Admin extends Account {
        public Admin(int id, String name) {
            super(id, name);
        }
    }

    public static class User extends Account {
        public User(int id, String name) {
            super(id, name);
        }
    }


    public static class ViewOperation implements Operation {
        @Override
        public void execute() {
            System.out.println("Viewing data.");
        }
    }

    public static class DeleteOperation implements Operation {
        @Override
        public void execute() {
            System.out.println("Deleting data.");
        }
    }


    public static void main(String[] args) {
        Admin admin = new Admin(1, "Alice");
        User  user  = new User(2, "Bob");

        admin.perform(new DeleteOperation());
        user.perform(new ViewOperation());
    }
}
