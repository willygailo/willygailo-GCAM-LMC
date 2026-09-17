package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum adz {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static adz a(aea aeaVar) {
        aea aeaVar2 = aea.DESTROYED;
        switch (aeaVar.ordinal()) {
            case 2:
                return ON_DESTROY;
            case 3:
                return ON_STOP;
            case 4:
                return ON_PAUSE;
            default:
                return null;
        }
    }

    public static adz b(aea aeaVar) {
        aea aeaVar2 = aea.DESTROYED;
        switch (aeaVar.ordinal()) {
            case 1:
                return ON_CREATE;
            case 2:
                return ON_START;
            case 3:
                return ON_RESUME;
            default:
                return null;
        }
    }

    public final aea c() {
        aea aeaVar = aea.DESTROYED;
        switch (this) {
            case ON_CREATE:
            case ON_STOP:
                return aea.CREATED;
            case ON_START:
            case ON_PAUSE:
                return aea.STARTED;
            case ON_RESUME:
                return aea.RESUMED;
            case ON_DESTROY:
                return aea.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
