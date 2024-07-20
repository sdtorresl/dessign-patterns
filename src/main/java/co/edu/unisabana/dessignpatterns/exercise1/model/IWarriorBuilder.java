package co.edu.unisabana.dessignpatterns.exercise1.model;

public interface IWarriorBuilder extends IHeroBuilder {
   WarriorBuilder weapon(String weapon);

    @Override
    Warrior build();
}
