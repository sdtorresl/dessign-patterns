package co.edu.unisabana.dessignpatterns.exercise1.model;

import java.util.List;

public class Warrior extends Hero {

    private String weapon;

    protected Warrior(int skillPoints, int experience, String visualAspect, String name, List<String> magicalSkills, List<String> defenses, List<String> attacks, String weapon) {
        super(skillPoints, experience, visualAspect, name, magicalSkills, defenses, attacks);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public Warrior clone() {
        return new Warrior(this.getSkillPoints(), this.getExperience(), this.getVisualAspect(), this.getName(), super.getMagicalSkills(), super.getDefenses(), super.getAttacks(), this.getWeapon());
    }
}
