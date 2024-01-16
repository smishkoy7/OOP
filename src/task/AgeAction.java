package task;

public class AgeAction implements HumanAction {

    @Override
    public void action(Human human) {
        human.setAge(20);
    }
}
