public class CompositePattern {
    public static void main(String[] args) {
        
        Employee dev1 = new Developer("Maria", "Frontend Developer");
        Employee dev2 = new Developer("João", "Backend Developer");

        Manager manager1 = new Manager("Ana", "Development");
        manager1.addSubordinate(dev1);
        manager1.addSubordinate(dev2);

        Manager generalManager = new Manager("Diana", "Head of Tech");
        generalManager.addSubordinate(manager1);

        // Mostrar detalhes
        generalManager.showDetails();
    }
}
