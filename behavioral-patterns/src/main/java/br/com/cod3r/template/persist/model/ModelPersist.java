package br.com.cod3r.template.persist.model;

public abstract class ModelPersist {

    public final ModelPersist save() {
        preSave();
        prePersist();
        System.out.printf("Saving %s in database%n", this.getClass().getSimpleName());
        postSave();
        return this;
    }

    public final ModelPersist update() {
        preUpdate();
        prePersist();
        System.out.printf("Updating %s in database%n", this.getClass().getSimpleName());
        postUpdate();
        return this;
    }

    public final void delete() {
        preDelete();
        System.out.printf("Removing %s in database%n", this.getClass().getSimpleName());
        postDelete();
    }

    protected abstract void preSave();

    protected void postSave() {
        // Override this method if you want to add a new behavior
    }

    protected void prePersist() {
        // Override this method if you want to add a new behavior
    }

    protected void preUpdate() {
        // Override this method if you want to add a new behavior
    }

    protected void postUpdate() {
        // Override this method if you want to add a new behavior
    }

    protected void preDelete() {
        // Override this method if you want to add a new behavior
    }

    protected void postDelete() {
        // Override this method if you want to add a new behavior
    }
}
