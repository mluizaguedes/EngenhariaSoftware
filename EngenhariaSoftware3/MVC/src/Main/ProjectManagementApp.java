package EngenhariaSoftware3.MVC.src.Main;

import EngenhariaSoftware3.MVC.src.Strategy.EmailNotification;
import EngenhariaSoftware3.MVC.src.Strategy.Notification;
import EngenhariaSoftware3.MVC.src.Strategy.SMSNotification;
import EngenhariaSoftware3.MVC.src.Observer.TeamMember;
import EngenhariaSoftware3.MVC.src.Observer.User;
import EngenhariaSoftware3.MVC.src.Composite.Project;
import EngenhariaSoftware3.MVC.src.Composite.Task;

public class ProjectManagementApp {
    public static void main(String[] args) {
        // Estratégias de notificação
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        // Usuários (Observadores)
        User alice = new TeamMember("Alice", email);
        User bob = new TeamMember("Bob", sms);

        // Criando Projeto e Tarefas
        Project mainProject = new Project("Projeto Principal");
        Task task1 = new Task("Tarefa 1");
        Task task2 = new Task("Tarefa 2");

        // Estrutura Composite
        mainProject.add(task1);
        mainProject.add(task2);

        // Observadores se inscrevendo
        mainProject.attachObserver(alice);
        task1.attachObserver(bob);

        // Notificações
        mainProject.notifyObservers("Atualização no projeto principal!");
        task1.notifyObservers("Tarefa 1 foi concluída!");
    }
}
