package patterns.behavioral.command;

class Drill {
    private Executor executor;

    void setExecutor(Executor executor) { this.executor = executor; }

    int execute() { return executor != null ? executor.drill() : 1; }
}