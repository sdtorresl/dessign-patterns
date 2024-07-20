package co.edu.unisabana.dessignpatterns.exercise1.model;

import java.util.List;

public class Wizard extends Hero {
    private String wand;

    protected Wizard(int skillPoints, int experience, String visualAspect, String name, List<String> magicalSkills, List<String> defenses, List<String> attacks, String wand) {
        super(skillPoints, experience, visualAspect, name, magicalSkills, defenses, attacks);
        this.wand = wand;
    }

    public String getWand() {
        return wand;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }

    public void castSpell(String spell) {
        System.out.println(this.getName() + " casts " + spell);
    }

    @Override
    public Hero clone() {
        return new Wizard(this.getSkillPoints(), this.getExperience(), this.getVisualAspect(), this.getName(), this.getMagicalSkills(), super.getDefenses(), super.getAttacks(), this.getWand());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wizard hero = (Wizard) o;
        return getExperience() == hero.getExperience() && getSkillPoints() == hero.getSkillPoints() && getName().equals(hero.getName()) && getVisualAspect().equals(hero.getVisualAspect()) && getAttacks().equals(hero.getAttacks()) && getDefenses().equals(hero.getDefenses()) && getMagicalSkills().equals(hero.getMagicalSkills());
    }
}
