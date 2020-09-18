package com.kino;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

public class ArchUnitTest {

    @Test
    void hierachicalAccessBetweenModules() {
        JavaClasses classes = new ClassFileImporter().importPackages("com.kino");

        ArchRule rule = classes()
                .that().resideInAPackage("..reservierung..")
                .should().onlyBeAccessed().byAnyPackage("..export..", "..ui..", "..reservierung..");
        rule.check(classes);
    }

    @Test
    void modulesAreFreeOfCycles() {
        ArchRule rule = slices().matching("..kino.(*)..").should().beFreeOfCycles();
        JavaClasses classes = new ClassFileImporter().importPackages("com.kino");
        rule.check(classes);
    }

    @Test
    void topLevelModulesAreNeverAccessedByOtherModules() {
        JavaClasses classes = new ClassFileImporter().importPackages("com.kino");

        ArchRule rule = classes()
                .that().resideInAPackage("..export..")
                .should().onlyBeAccessed().byAnyPackage("..export..");

        rule.check(classes);
    }
}
