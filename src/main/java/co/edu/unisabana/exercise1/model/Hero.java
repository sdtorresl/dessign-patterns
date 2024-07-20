package co.edu.unisabana.exercise1.model;

import java.util.List;

public abstract class Hero {

    private List<String> attacks;
    private List<String> defenses;
    private List<String> magicalSkills;

    private String name;
    private String visualAspect;
    private int experience;
    private int skillPoints;

    public Hero(int skillPoints, int experience, String visualAspect, String name, List<String> magicalSkills, List<String> defenses, List<String> attacks) {
        this.skillPoints = skillPoints;
        this.experience = experience;
        this.visualAspect = visualAspect;
        this.name = name;
        this.magicalSkills = magicalSkills;
        this.defenses = defenses;
        this.attacks = attacks;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public List<String> getDefenses() {
        return defenses;
    }

    public void setDefenses(List<String> defenses) {
        this.defenses = defenses;
    }

    public List<String> getMagicalSkills() {
        return magicalSkills;
    }

    public void setMagicalSkills(List<String> magicalSkills) {
        this.magicalSkills = magicalSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVisualAspect() {
        return visualAspect;
    }

    public void setVisualAspect(String visualAspect) {
        this.visualAspect = visualAspect;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public abstract Hero clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return experience == hero.experience && skillPoints == hero.skillPoints && name.equals(hero.name) && visualAspect.equals(hero.visualAspect) && attacks.equals(hero.attacks) && defenses.equals(hero.defenses) && magicalSkills.equals(hero.magicalSkills);
    }
}
