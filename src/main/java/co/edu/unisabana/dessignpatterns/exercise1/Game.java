package co.edu.unisabana.dessignpatterns.exercise1;

import co.edu.unisabana.dessignpatterns.exercise1.model.Warrior;
import co.edu.unisabana.dessignpatterns.exercise1.model.WarriorBuilder;
import co.edu.unisabana.dessignpatterns.exercise1.model.Wizard;
import co.edu.unisabana.dessignpatterns.exercise1.model.WizardBuilder;

public class Game {
    public static void main(String[] args) {
        Wizard wizard = (Wizard) new WizardBuilder()
                .wand("Elder Wand")
                .skillPoints(20)
                .experience(100)
                .visualAspect("Robed")
                .name("Gandalf")
                .addMagicalSkill("Fireball")
                .addDefense("Mana Shield")
                .addAttack("Staff Strike")
                .build();

        Wizard copyOfMyWizard = (Wizard) wizard.clone();
        System.out.println(wizard.getName());
        System.out.println(copyOfMyWizard.getName());

        Warrior theWarrior = (Warrior) new WarriorBuilder()
                .weapon("Mjolnir")
                .skillPoints(15)
                .experience(70)
                .visualAspect("Armored")
                .name("Thor")
                .addAttack("Axe Swing")
                .addDefense("Shield Bash")
                .addMagicalSkill("Lightning Strike")
                .build();

        theWarrior.setWeapon("Sword");
        Warrior warrior2 = theWarrior.clone();
        System.out.println(warrior2.getWeapon());
    }
}
