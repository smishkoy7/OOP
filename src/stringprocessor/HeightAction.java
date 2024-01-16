package stringprocessor;

import task.Human;
import task.HumanAction;

public class HeightAction implements HumanAction {

    @Override
    public void action(Human human) {
        human.setHeight(178);
    }
}
