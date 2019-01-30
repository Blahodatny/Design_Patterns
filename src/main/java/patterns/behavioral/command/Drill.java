package patterns.behavioral.command;

class Drill {
    private Executor executor;

    void setExecutor(Executor executor) {
        this.executor = executor;
    }

    int execute() {
        if (executor != null)
            return executor.drill();
        else
            return 1;
    }
}