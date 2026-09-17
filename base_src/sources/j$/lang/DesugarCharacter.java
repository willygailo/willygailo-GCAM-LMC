package j$.lang;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class DesugarCharacter {
    public static char highSurrogate(int i) {
        return (char) ((i >>> 10) + 55232);
    }

    public static boolean isSurrogate(char c) {
        return c >= 55296 && c < 57344;
    }

    public static char lowSurrogate(int i) {
        return (char) ((i & 1023) + 56320);
    }
}
