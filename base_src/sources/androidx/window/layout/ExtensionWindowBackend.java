package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.core.Version;
import defpackage.fb;
import defpackage.qkx;
import defpackage.qnm;
import defpackage.qno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class ExtensionWindowBackend implements WindowBackend {
    public static final boolean DEBUG = false;
    private static final String TAG = "WindowServer";
    private static volatile ExtensionWindowBackend globalInstance;
    private ExtensionInterfaceCompat windowExtension;
    private final CopyOnWriteArrayList windowLayoutChangeCallbacks;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qnm qnmVar) {
            this();
        }

        public final ExtensionWindowBackend getInstance(Context context) {
            context.getClass();
            if (ExtensionWindowBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionWindowBackend.globalInstance == null) {
                        ExtensionWindowBackend.globalInstance = new ExtensionWindowBackend(ExtensionWindowBackend.Companion.initAndVerifyExtension(context));
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            ExtensionWindowBackend extensionWindowBackend = ExtensionWindowBackend.globalInstance;
            extensionWindowBackend.getClass();
            return extensionWindowBackend;
        }

        public final ExtensionInterfaceCompat initAndVerifyExtension(Context context) {
            context.getClass();
            try {
                if (!isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.validateExtensionInterface()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable th) {
                return null;
            }
        }

        public final boolean isSidecarVersionSupported(Version version) {
            return version != null && version.compareTo(Version.Companion.getVERSION_0_1()) >= 0;
        }

        public final void resetInstance() {
            ExtensionWindowBackend.globalInstance = null;
        }
    }

    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        final /* synthetic */ ExtensionWindowBackend this$0;

        public ExtensionListenerImpl(ExtensionWindowBackend extensionWindowBackend) {
            extensionWindowBackend.getClass();
            this.this$0 = extensionWindowBackend;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            activity.getClass();
            windowLayoutInfo.getClass();
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : this.this$0.getWindowLayoutChangeCallbacks()) {
                if (qno.c(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
        }
    }

    public final class WindowLayoutChangeCallbackWrapper {
        private final Activity activity;
        private final fb callback;
        private final Executor executor;
        private WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(Activity activity, Executor executor, fb fbVar) {
            activity.getClass();
            executor.getClass();
            fbVar.getClass();
            this.activity = activity;
            this.executor = executor;
            this.callback = fbVar;
        }

        public final void accept(final WindowLayoutInfo windowLayoutInfo) {
            windowLayoutInfo.getClass();
            this.lastInfo = windowLayoutInfo;
            this.executor.execute(new Runnable() { // from class: androidx.window.layout.ExtensionWindowBackend$WindowLayoutChangeCallbackWrapper$accept$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.getCallback().accept(windowLayoutInfo);
                }
            });
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final fb getCallback() {
            return this.callback;
        }

        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }
    }

    public ExtensionWindowBackend(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        if (extensionInterfaceCompat != null) {
            extensionInterfaceCompat.setExtensionCallback(new ExtensionListenerImpl(this));
        }
        this.windowLayoutChangeCallbacks = new CopyOnWriteArrayList();
    }

    private final void callbackRemovedForActivity(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (qno.c(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                    return;
                }
            }
        }
        ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
        if (extensionInterfaceCompat == null) {
            return;
        }
        extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
    }

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (qno.c(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final CopyOnWriteArrayList getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, fb fbVar) {
        WindowLayoutInfo lastInfo;
        Object next;
        activity.getClass();
        executor.getClass();
        fbVar.getClass();
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                fbVar.accept(new WindowLayoutInfo(qkx.a));
                return;
            }
            boolean zIsActivityRegistered = isActivityRegistered(activity);
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, fbVar);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (zIsActivityRegistered) {
                Iterator it = getWindowLayoutChangeCallbacks().iterator();
                do {
                    lastInfo = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!qno.c(activity, ((WindowLayoutChangeCallbackWrapper) next).getActivity()));
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) next;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    lastInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (lastInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(lastInfo);
                }
            } else {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setWindowExtension(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(fb fbVar) {
        fbVar.getClass();
        synchronized (globalLock) {
            if (getWindowExtension() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : getWindowLayoutChangeCallbacks()) {
                if (windowLayoutChangeCallbackWrapper.getCallback() == fbVar) {
                    windowLayoutChangeCallbackWrapper.getClass();
                    arrayList.add(windowLayoutChangeCallbackWrapper);
                }
            }
            getWindowLayoutChangeCallbacks().removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                callbackRemovedForActivity(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity());
            }
        }
    }
}
