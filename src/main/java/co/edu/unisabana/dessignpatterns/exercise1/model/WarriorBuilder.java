package co.edu.unisabana.dessignpatterns.exercise1.model;

public class WarriorBuilder extends HeroBuilder implements IWarriorBuilder {

    private String weapon;

    public WarriorBuilder() {
    }

    @Override
    public WarriorBuilder weapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public Warrior build() {
        return new Warrior(super.getSkillPoints(), super.getExperience(), super.getVisualAspect(), super.getName(), super.getMagicalSkills(), super.getDefenses(), super.getAttacks(), this.weapon);
    }
}
