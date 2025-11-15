class Inspection {
    private int id;
    private String description;
    private boolean isResolved;

    public Inspection(int id, String description) {
        this.id = id;
        this.description = description;
        this.isResolved = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void resolve() {
        this.isResolved = true;
    }

    @Override
    public String toString() {
        return "Inspection{ID=" + id + ", Description='" + description + "', Resolved=" + isResolved + "}";
    }
}