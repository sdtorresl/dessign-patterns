package co.edu.unisabana.dessignpatterns.exercise1.model;

public class WizardBuilder extends HeroBuilder implements IWizardBuilder {

    private String wand;

    public WizardBuilder() {}

    @Override
    public WizardBuilder wand(String wand) {
        this.wand = wand;
        return this;
    }

    @Override
    public Wizard build() {
        return new Wizard(super.getSkillPoints(), super.getExperience(), super.getVisualAspect(), super.getName(), super.getMagicalSkills(), super.getDefenses(), super.getAttacks(), this.wand);
    }
}