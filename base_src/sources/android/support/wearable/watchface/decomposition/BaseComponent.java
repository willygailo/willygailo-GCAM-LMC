package android.support.wearable.watchface.decomposition;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseComponent implements WatchFaceDecomposition.Component {
    protected final Bundle a;

    /* JADX INFO: loaded from: classes2.dex */
    abstract class BaseBuilder {
        public BaseBuilder() {
            new Bundle();
        }
    }

    interface ComponentFactory {
    }

    public BaseComponent(Bundle bundle) {
        this.a = bundle;
    }
}
