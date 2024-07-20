package co.edu.unisabana.exercise1.model;

import java.util.*;

public abstract class HeroBuilder implements IHeroBuilder {

    private int skillPoints;
    private int experience;
    private String visualAspect;
    private String name;
    private final List<String> magicalSkills = new ArrayList<>();
    private final List<String> defenses = new ArrayList<>();
    private final List<String> attacks = new ArrayList<>();

    @Override
    public int getSkillPoints() {
        return skillPoints;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public String getVisualAspect() {
        return visualAspect;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getMagicalSkills() {
        return magicalSkills;
    }

    @Override
    public List<String> getDefenses() {
        return defenses;
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public HeroBuilder skillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
        return this;
    }

    @Override
    public HeroBuilder experience(int experience) {
        this.experience = experience;
        return this;
    }

    @Override
    public HeroBuilder visualAspect(String visualAspect) {
        this.visualAspect = visualAspect;
        return this;
    }

    @Override
    public HeroBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public HeroBuilder addMagicalSkill(String magicalSkill) {
        this.magicalSkills.add(magicalSkill);
        return this;
    }

    @Override
    public HeroBuilder addDefense(String defense) {
        this.defenses.add(defense);
        return this;
    }

    @Override
    public HeroBuilder addAttack(String attack) {
        this.attacks.add(attack);
        return this;
    }

}

