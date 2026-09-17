package androidx.window.java.layout;

import androidx.window.layout.WindowInfoRepository;
import defpackage.fb;
import defpackage.qmd;
import defpackage.qnm;
import defpackage.qno;
import defpackage.qrg;
import defpackage.qtr;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInfoRepositoryCallbackAdapter implements WindowInfoRepository {
    private final Map consumerToJobMap;
    private final ReentrantLock lock;
    private final WindowInfoRepository repository;

    public WindowInfoRepositoryCallbackAdapter(WindowInfoRepository windowInfoRepository) {
        windowInfoRepository.getClass();
        this.repository = windowInfoRepository;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final void addListener(Executor executor, fb fbVar, qtr qtrVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(fbVar) == null) {
                this.consumerToJobMap.put(fbVar, qmd.l(qnm.j(qno.C(executor)), null, new WindowInfoRepositoryCallbackAdapter$addListener$1$1(qtrVar, fbVar, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(fb fbVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            qrg qrgVar = (qrg) this.consumerToJobMap.get(fbVar);
            if (qrgVar != null) {
                qrgVar.q(null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addCurrentWindowMetricsListener(Executor executor, fb fbVar) {
        executor.getClass();
        fbVar.getClass();
        addListener(executor, fbVar, this.repository.getCurrentWindowMetrics());
    }

    public final void addWindowLayoutInfoListener(Executor executor, fb fbVar) {
        executor.getClass();
        fbVar.getClass();
        addListener(executor, fbVar, this.repository.getWindowLayoutInfo());
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public qtr getCurrentWindowMetrics() {
        return this.repository.getCurrentWindowMetrics();
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public qtr getWindowLayoutInfo() {
        return this.repository.getWindowLayoutInfo();
    }

    public final void removeCurrentWindowMetricsListener(fb fbVar) {
        fbVar.getClass();
        removeListener(fbVar);
    }

    public final void removeWindowLayoutInfoListener(fb fbVar) {
        fbVar.getClass();
        removeListener(fbVar);
    }
}
