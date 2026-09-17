package android.support.wearable.watchface.decomposition;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseDrawnComponent extends BaseComponent implements WatchFaceDecomposition.DrawnComponent {

    abstract class BaseDrawnBuilder extends BaseComponent.BaseBuilder {
    }

    public BaseDrawnComponent(Bundle bundle) {
        super(bundle);
    }
}
