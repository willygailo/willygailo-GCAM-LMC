package defpackage;

import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class osp extends osj implements Queue {
    private static final long serialVersionUID = 0;

    public osp(Queue queue) {
        super(queue, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.osj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Queue a() {
        return (Queue) super.a();
    }

    @Override // java.util.Queue
    public final Object element() {
        Object objElement;
        synchronized (this.h) {
            objElement = a().element();
        }
        return objElement;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean zOffer;
        synchronized (this.h) {
            zOffer = a().offer(obj);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object objPeek;
        synchronized (this.h) {
            objPeek = a().peek();
        }
        return objPeek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object objPoll;
        synchronized (this.h) {
            objPoll = a().poll();
        }
        return objPoll;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objRemove;
        synchronized (this.h) {
            objRemove = a().remove();
        }
        return objRemove;
    }
}
