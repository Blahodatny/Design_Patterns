package patterns.behavioral.command;

class Drill {
    private IExecutor executor;

    void setExecutor(IExecutor executor) {
        this.executor = executor;
    }

    int execute() {
        if (executor != null)
            return executor.drill();
        else
            return 1;
    }
}