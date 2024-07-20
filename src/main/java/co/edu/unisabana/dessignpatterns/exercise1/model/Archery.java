package co.edu.unisabana.dessignpatterns.exercise1.model;

import java.util.List;

public class Archery extends Hero {
    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    private int arrows;

    protected Archery(int skillPoints, int experience, String visualAspect, String name, List<String> magicalSkills, List<String> defenses, List<String> attacks, int arrows) {
        super(skillPoints, experience, visualAspect, name, magicalSkills, defenses, attacks);
        this.arrows = arrows;
    }

    public void shootArrow() {
        if (arrows > 0) {
            System.out.println(this.getName() + " shoot 1 arrow");
            arrows--;
        }
    }

    @Override
    public Hero clone() {
        return null;
    }
}
