package co.edu.unisabana.dessignpatterns.exercise1.model;

import java.util.List;

public interface IHeroBuilder {
    int getSkillPoints();

    int getExperience();

    String getVisualAspect();

    String getName();

    List<String> getMagicalSkills();

    List<String> getDefenses();

    List<String> getAttacks();

    HeroBuilder skillPoints(int skillPoints);

    HeroBuilder experience(int experience);

    HeroBuilder visualAspect(String visualAspect);

    HeroBuilder name(String name);

    HeroBuilder addMagicalSkill(String magicalSkill);

    HeroBuilder addDefense(String defense);

    HeroBuilder addAttack(String attack);

    Hero build();
}
