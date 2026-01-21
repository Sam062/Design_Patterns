package base.designPatterns;

public class BuilderPattern {
    private final int id;
    private final String name;

    private BuilderPattern(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        private int id;
        private String name;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    public static void main(String[] args) {
        BuilderPattern sam = BuilderPattern.builder()
                .id(101)
                .name("SAM")
                .build();
        System.out.println(sam);
        int id1 = sam.getId();
        String name1 = sam.getName();
        System.out.println(id1 + ", " + name1);
    }
}
