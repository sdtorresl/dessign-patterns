package co.edu.unisabana.exercise1.model;

public interface IWizardBuilder extends IHeroBuilder {
    WizardBuilder wand(String wand);

    @Override
    Wizard build();
}
