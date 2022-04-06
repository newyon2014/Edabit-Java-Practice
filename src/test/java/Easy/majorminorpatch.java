package Easy;

public class majorminorpatch {
    public static String retrieveMajor(String semver) {
        return semver.split("\\.")[0];
    }

    public static String retrieveMinor(String semver) {
        return semver.split("\\.")[1];
    }

    public static String retrievePatch(String semver) {
        return semver.split("\\.")[2];
    }

    public static void main(String[] args) {

        System.out.println(retrieveMajor("6.1.9"));
        System.out.println(retrieveMinor("6.1.9"));
        System.out.println(retrievePatch("6.1.9"));

    }
}
