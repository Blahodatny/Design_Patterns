package patterns.behavioral.command;

class Worker {
    void setExecutor(Drill drill, Executor executor) {
        drill.setExecutor(executor);
    }

    void executeDrillByHimself(Drill drill) { drill.execute(); }
}