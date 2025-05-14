public class Main {
    // Abstraction: any action on an Account
    public interface Operation {
        void execute();
    }

    // Base class with shared fields and a polymorphic hook
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

    // Two concrete account types
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

    // Two operations demonstrating polymorphism
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

    // Entry point
    public static void main(String[] args) {
        Admin admin = new Admin(1, "Alice");
        User  user  = new User(2, "Bob");

        admin.perform(new DeleteOperation());
        user.perform(new ViewOperation());
    }
}
