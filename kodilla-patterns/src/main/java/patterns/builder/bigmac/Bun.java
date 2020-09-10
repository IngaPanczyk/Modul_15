package patterns.builder.bigmac;

public class Bun {
    public static final String WITH_SESAME = "with sesame";
    public static final String NORMAL = "normal";
    final private String type;


    public Bun(String type) {
        if (type.equals(WITH_SESAME) || type.equals(NORMAL)) {
            this.type = type;
        } else {
            throw new IllegalStateException("Bun is normal or with sesame ");
        }
    }

    public String getType() {
        return type;
    }

}
