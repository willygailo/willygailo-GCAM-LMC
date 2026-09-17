package android.support.v8.renderscript;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class RenderScript {
    private static final String CACHE_PATH = "com.android.renderscript.cache";
    public static final int CREATE_FLAG_NONE = 0;
    static final boolean DEBUG = false;
    static final boolean LOG_ENABLED = false;
    static final String LOG_TAG = "RenderScript_jni";
    static final int SUPPORT_LIB_API = 23;
    static final int SUPPORT_LIB_VERSION = 2301;
    static String mCachePath;
    static Method registerNativeAllocation;
    static Method registerNativeFree;
    static boolean sInitialized;
    static int sPointerSize;
    static Object sRuntime;
    static boolean sUseGCHooks;
    private static boolean useNative;
    private Context mApplicationContext;
    long mContext;
    Element mElement_ALLOCATION;
    Element mElement_A_8;
    Element mElement_BOOLEAN;
    Element mElement_CHAR_2;
    Element mElement_CHAR_3;
    Element mElement_CHAR_4;
    Element mElement_DOUBLE_2;
    Element mElement_DOUBLE_3;
    Element mElement_DOUBLE_4;
    Element mElement_ELEMENT;
    Element mElement_F32;
    Element mElement_F64;
    Element mElement_FLOAT_2;
    Element mElement_FLOAT_3;
    Element mElement_FLOAT_4;
    Element mElement_I16;
    Element mElement_I32;
    Element mElement_I64;
    Element mElement_I8;
    Element mElement_INT_2;
    Element mElement_INT_3;
    Element mElement_INT_4;
    Element mElement_LONG_2;
    Element mElement_LONG_3;
    Element mElement_LONG_4;
    Element mElement_MATRIX_2X2;
    Element mElement_MATRIX_3X3;
    Element mElement_MATRIX_4X4;
    Element mElement_RGBA_4444;
    Element mElement_RGBA_5551;
    Element mElement_RGBA_8888;
    Element mElement_RGB_565;
    Element mElement_RGB_888;
    Element mElement_SAMPLER;
    Element mElement_SCRIPT;
    Element mElement_SHORT_2;
    Element mElement_SHORT_3;
    Element mElement_SHORT_4;
    Element mElement_TYPE;
    Element mElement_U16;
    Element mElement_U32;
    Element mElement_U64;
    Element mElement_U8;
    Element mElement_UCHAR_2;
    Element mElement_UCHAR_3;
    Element mElement_UCHAR_4;
    Element mElement_UINT_2;
    Element mElement_UINT_3;
    Element mElement_UINT_4;
    Element mElement_ULONG_2;
    Element mElement_ULONG_3;
    Element mElement_ULONG_4;
    Element mElement_USHORT_2;
    Element mElement_USHORT_3;
    Element mElement_USHORT_4;
    long mIncCon;
    boolean mIncLoaded;
    MessageThread mMessageThread;
    private String mNativeLibDir;
    ReentrantReadWriteLock mRWLock;
    Sampler mSampler_CLAMP_LINEAR;
    Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
    Sampler mSampler_CLAMP_NEAREST;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_NEAREST;
    Sampler mSampler_WRAP_LINEAR;
    Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
    Sampler mSampler_WRAP_NEAREST;
    private static ArrayList mProcessContextList = new ArrayList();
    private static String mBlackList = "";
    static Object lock = new Object();
    private static int sNative = -1;
    private static int sSdkVersion = -1;
    private static boolean useIOlib = false;
    private boolean mIsProcessContext = false;
    private boolean mEnableMultiInput = false;
    private int mDispatchAPILevel = 0;
    private int mContextFlags = 0;
    private int mContextSdkVersion = 0;
    private boolean mDestroyed = false;
    RSMessageHandler mMessageCallback = null;
    RSErrorHandler mErrorCallback = null;
    ContextType mContextType = ContextType.NORMAL;

    public enum ContextType {
        NORMAL(0),
        DEBUG(1),
        PROFILE(2);

        int mID;

        ContextType(int i) {
            this.mID = i;
        }
    }

    class MessageThread extends Thread {
        static final int RS_ERROR_FATAL_UNKNOWN = 4096;
        static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
        static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
        static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
        static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
        static final int RS_MESSAGE_TO_CLIENT_USER = 4;
        int[] mAuxData;
        RenderScript mRS;
        boolean mRun;

        public MessageThread(RenderScript renderScript) {
            super("RSMessageThread");
            this.mRun = true;
            this.mAuxData = new int[2];
            this.mRS = renderScript;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int[] iArr = new int[16];
            RenderScript renderScript = this.mRS;
            renderScript.nContextInitToClient(renderScript.mContext);
            while (this.mRun) {
                iArr[0] = 0;
                RenderScript renderScript2 = this.mRS;
                int iNContextPeekMessage = renderScript2.nContextPeekMessage(renderScript2.mContext, this.mAuxData);
                int[] iArr2 = this.mAuxData;
                int i = iArr2[1];
                int i2 = iArr2[0];
                if (iNContextPeekMessage == 4) {
                    if ((i >> 2) >= iArr.length) {
                        iArr = new int[(i + 3) >> 2];
                    }
                    RenderScript renderScript3 = this.mRS;
                    if (renderScript3.nContextGetUserMessage(renderScript3.mContext, iArr) != 4) {
                        throw new RSDriverException("Error processing message from RenderScript.");
                    }
                    RSMessageHandler rSMessageHandler = this.mRS.mMessageCallback;
                    if (rSMessageHandler == null) {
                        throw new RSInvalidStateException("Received a message from the script with no message handler installed.");
                    }
                    rSMessageHandler.mData = iArr;
                    rSMessageHandler.mID = i2;
                    rSMessageHandler.mLength = i;
                    rSMessageHandler.run();
                } else if (iNContextPeekMessage == 3) {
                    RenderScript renderScript4 = this.mRS;
                    String strNContextGetErrorMessage = renderScript4.nContextGetErrorMessage(renderScript4.mContext);
                    if (i2 >= 4096) {
                        throw new RSRuntimeException("Fatal error " + i2 + ", details: " + strNContextGetErrorMessage);
                    }
                    RSErrorHandler rSErrorHandler = this.mRS.mErrorCallback;
                    if (rSErrorHandler != null) {
                        rSErrorHandler.mErrorMessage = strNContextGetErrorMessage;
                        rSErrorHandler.mErrorNum = i2;
                        rSErrorHandler.run();
                    } else {
                        Log.e(RenderScript.LOG_TAG, "non fatal RS error, " + strNContextGetErrorMessage);
                    }
                } else {
                    try {
                        sleep(1L, 0);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public enum Priority {
        LOW(15),
        NORMAL(-4);

        int mID;

        Priority(int i) {
            this.mID = i;
        }
    }

    public class RSErrorHandler implements Runnable {
        protected String mErrorMessage;
        protected int mErrorNum;

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class RSMessageHandler implements Runnable {
        protected int[] mData;
        protected int mID;
        protected int mLength;

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public RenderScript(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.mApplicationContext = applicationContext;
            this.mNativeLibDir = applicationContext.getApplicationInfo().nativeLibraryDir;
        }
        this.mIncCon = 0L;
        this.mIncLoaded = false;
        this.mRWLock = new ReentrantReadWriteLock();
    }

    public static RenderScript create(Context context) {
        return create(context, ContextType.NORMAL);
    }

    public static RenderScript create(Context context, int i) {
        return create(context, i, ContextType.NORMAL, 0);
    }

    public static RenderScript create(Context context, int i, ContextType contextType) {
        return create(context, i, contextType, 0);
    }

    public static RenderScript create(Context context, int i, ContextType contextType, int i2) {
        synchronized (mProcessContextList) {
            for (RenderScript renderScript : mProcessContextList) {
                if (renderScript.mContextType == contextType && renderScript.mContextFlags == i2 && renderScript.mContextSdkVersion == i) {
                    return renderScript;
                }
            }
            RenderScript renderScriptInternalCreate = internalCreate(context, i, contextType, i2);
            renderScriptInternalCreate.mIsProcessContext = true;
            mProcessContextList.add(renderScriptInternalCreate);
            return renderScriptInternalCreate;
        }
    }

    public static RenderScript create(Context context, ContextType contextType) {
        return create(context, contextType, 0);
    }

    public static RenderScript create(Context context, ContextType contextType, int i) {
        return create(context, context.getApplicationInfo().targetSdkVersion, contextType, i);
    }

    public static RenderScript createMultiContext(Context context, ContextType contextType, int i, int i2) {
        return internalCreate(context, i2, contextType, i);
    }

    public static void forceCompat() {
        sNative = 0;
    }

    private void helpDestroy() {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = false;
            if (this.mDestroyed) {
                z2 = false;
            } else {
                this.mDestroyed = true;
                z2 = true;
            }
        }
        if (z2) {
            nContextFinish();
            if (this.mIncCon != 0) {
                nIncContextFinish();
                nIncContextDestroy();
                this.mIncCon = 0L;
            }
            nContextDeinitToClient(this.mContext);
            MessageThread messageThread = this.mMessageThread;
            messageThread.mRun = false;
            messageThread.interrupt();
            boolean z3 = false;
            while (!z) {
                try {
                    this.mMessageThread.join();
                    z = true;
                } catch (InterruptedException e) {
                    z3 = true;
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            nContextDestroy();
        }
    }

    private static RenderScript internalCreate(Context context, int i, ContextType contextType, int i2) {
        RenderScript renderScript = new RenderScript(context);
        int i3 = sSdkVersion;
        if (i3 == -1) {
            sSdkVersion = i;
        } else if (i3 != i) {
            throw new RSRuntimeException("Can't have two contexts with different SDK versions in support lib");
        }
        useNative = setupNative(sSdkVersion, context);
        synchronized (lock) {
            if (!sInitialized) {
                try {
                    Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                    sRuntime = cls.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                    registerNativeAllocation = cls.getDeclaredMethod("registerNativeAllocation", Integer.TYPE);
                    registerNativeFree = cls.getDeclaredMethod("registerNativeFree", Integer.TYPE);
                    sUseGCHooks = true;
                } catch (Exception e) {
                    Log.e(LOG_TAG, "No GC methods");
                    sUseGCHooks = false;
                }
                try {
                    System.loadLibrary("rsjni");
                    sInitialized = true;
                    sPointerSize = rsnSystemGetPointerSize();
                } catch (UnsatisfiedLinkError e2) {
                    Log.e(LOG_TAG, "Error loading RS jni library: " + e2);
                    throw new RSRuntimeException("Error loading RS jni library: " + e2 + " Support lib API: " + SUPPORT_LIB_VERSION);
                }
            }
        }
        useIOlib = true;
        int i4 = i < Build.VERSION.SDK_INT ? Build.VERSION.SDK_INT : i;
        if (!renderScript.nLoadSO(useNative, i4, null)) {
            if (useNative) {
                useNative = false;
            }
            try {
                System.loadLibrary("RSSupport");
                if (!renderScript.nLoadSO(false, i4, null)) {
                    Log.e(LOG_TAG, "Error loading RS Compat library: nLoadSO() failed; Support lib version: 2301");
                    throw new RSRuntimeException("Error loading libRSSupport library, Support lib version: 2301");
                }
            } catch (UnsatisfiedLinkError e3) {
                Log.e(LOG_TAG, "Error loading RS Compat library: " + e3 + " Support lib version: 2301");
                throw new RSRuntimeException("Error loading RS Compat library: " + e3 + " Support lib version: 2301");
            }
        }
        if (useIOlib) {
            try {
                System.loadLibrary("RSSupportIO");
            } catch (UnsatisfiedLinkError e4) {
                useIOlib = false;
            }
            if (!useIOlib || !renderScript.nLoadIOSO()) {
                useIOlib = false;
            }
        }
        if (i4 >= 23) {
            renderScript.mEnableMultiInput = true;
            try {
                System.loadLibrary("blasV8");
            } catch (UnsatisfiedLinkError e5) {
                String str = "Unable to load BLAS lib, ONLY BNNM will be supported: " + e5;
            }
        }
        long jNContextCreate = renderScript.nContextCreate(renderScript.nDeviceCreate(), 0, i, contextType.mID, renderScript.mNativeLibDir);
        renderScript.mContext = jNContextCreate;
        renderScript.mContextType = contextType;
        renderScript.mContextFlags = i2;
        renderScript.mContextSdkVersion = i;
        renderScript.mDispatchAPILevel = i4;
        if (jNContextCreate == 0) {
            throw new RSDriverException("Failed to create RS context.");
        }
        MessageThread messageThread = new MessageThread(renderScript);
        renderScript.mMessageThread = messageThread;
        messageThread.start();
        return renderScript;
    }

    public static void releaseAllContexts() {
        ArrayList arrayList;
        synchronized (mProcessContextList) {
            arrayList = mProcessContextList;
            mProcessContextList = new ArrayList();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RenderScript renderScript = (RenderScript) arrayList.get(i);
            renderScript.mIsProcessContext = false;
            renderScript.destroy();
        }
        arrayList.clear();
    }

    static native int rsnSystemGetPointerSize();

    public static void setBlackList(String str) {
        if (str != null) {
            mBlackList = str;
        }
    }

    public static void setupDiskCache(File file) {
        File file2 = new File(file, CACHE_PATH);
        mCachePath = file2.getAbsolutePath();
        file2.mkdirs();
    }

    private static boolean setupNative(int i, Context context) {
        long jLongValue;
        if (sNative == -1) {
            try {
                if (((Integer) Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(null, "debug.rs.forcecompat", new Integer(0))).intValue() == 0) {
                    sNative = 1;
                } else {
                    sNative = 0;
                }
            } catch (Exception e) {
            }
            if (sNative == 1) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    try {
                        jLongValue = ((Long) Class.forName("android.renderscript.RenderScript").getDeclaredMethod("getMinorID", new Class[0]).invoke(null, new Object[0])).longValue();
                    } catch (Exception e2) {
                        jLongValue = 0;
                    }
                    if (applicationInfo.metaData != null) {
                        if (applicationInfo.metaData.getBoolean("com.android.support.v8.renderscript.EnableAsyncTeardown") && jLongValue == 0) {
                            sNative = 0;
                        }
                        applicationInfo.metaData.getBoolean("com.android.support.v8.renderscript.EnableBlurWorkaround");
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    return true;
                }
            }
        }
        if (sNative != 1) {
            return false;
        }
        if (mBlackList.length() > 0) {
            if (mBlackList.contains('(' + Build.MANUFACTURER + ':' + Build.PRODUCT + ':' + Build.MODEL + ')')) {
                sNative = 0;
                return false;
            }
        }
        return true;
    }

    public void contextDump() {
        validate();
        nContextDump(0);
    }

    public void destroy() {
        if (this.mIsProcessContext) {
            return;
        }
        validate();
        helpDestroy();
    }

    protected void finalize() throws Throwable {
        helpDestroy();
        super.finalize();
    }

    public void finish() {
        nContextFinish();
    }

    public final Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public int getDispatchAPILevel() {
        return this.mDispatchAPILevel;
    }

    public RSErrorHandler getErrorHandler() {
        return this.mErrorCallback;
    }

    public RSMessageHandler getMessageHandler() {
        return this.mMessageCallback;
    }

    public boolean isAlive() {
        return this.mContext != 0;
    }

    public boolean isUseNative() {
        return useNative;
    }

    public synchronized void nAllocationCopyFromBitmap(long j, Bitmap bitmap) {
        validate();
        rsnAllocationCopyFromBitmap(this.mContext, j, bitmap);
    }

    public synchronized void nAllocationCopyToBitmap(long j, Bitmap bitmap) {
        validate();
        rsnAllocationCopyToBitmap(this.mContext, j, bitmap);
    }

    public synchronized long nAllocationCreateBitmapBackedAllocation(long j, int i, Bitmap bitmap, int i2) {
        validate();
        return rsnAllocationCreateBitmapBackedAllocation(this.mContext, j, i, bitmap, i2);
    }

    synchronized long nAllocationCreateBitmapRef(long j, Bitmap bitmap) {
        validate();
        return rsnAllocationCreateBitmapRef(this.mContext, j, bitmap);
    }

    synchronized long nAllocationCreateFromAssetStream(int i, int i2, int i3) {
        validate();
        return rsnAllocationCreateFromAssetStream(this.mContext, i, i2, i3);
    }

    public synchronized long nAllocationCreateFromBitmap(long j, int i, Bitmap bitmap, int i2) {
        validate();
        return rsnAllocationCreateFromBitmap(this.mContext, j, i, bitmap, i2);
    }

    public synchronized long nAllocationCreateTyped(long j, int i, int i2, long j2) {
        validate();
        return rsnAllocationCreateTyped(this.mContext, j, i, i2, j2);
    }

    public synchronized long nAllocationCubeCreateFromBitmap(long j, int i, Bitmap bitmap, int i2) {
        validate();
        return rsnAllocationCubeCreateFromBitmap(this.mContext, j, i, bitmap, i2);
    }

    public synchronized void nAllocationData1D(long j, int i, int i2, int i3, Object obj, int i4, Element.DataType dataType, int i5, boolean z) {
        validate();
        rsnAllocationData1D(this.mContext, j, i, i2, i3, obj, i4, dataType.mID, i5, z);
    }

    public synchronized void nAllocationData2D(long j, int i, int i2, int i3, int i4, int i5, int i6, long j2, int i7, int i8, int i9, int i10) {
        validate();
        rsnAllocationData2D(this.mContext, j, i, i2, i3, i4, i5, i6, j2, i7, i8, i9, i10);
    }

    public synchronized void nAllocationData2D(long j, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, Element.DataType dataType, int i8, boolean z) {
        validate();
        rsnAllocationData2D(this.mContext, j, i, i2, i3, i4, i5, i6, obj, i7, dataType.mID, i8, z);
    }

    public synchronized void nAllocationData2D(long j, int i, int i2, int i3, int i4, Bitmap bitmap) {
        validate();
        rsnAllocationData2D(this.mContext, j, i, i2, i3, i4, bitmap);
    }

    public synchronized void nAllocationData3D(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, int i9, int i10, int i11) {
        validate();
        rsnAllocationData3D(this.mContext, j, i, i2, i3, i4, i5, i6, i7, j2, i8, i9, i10, i11);
    }

    public synchronized void nAllocationData3D(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, Element.DataType dataType, int i9, boolean z) {
        validate();
        rsnAllocationData3D(this.mContext, j, i, i2, i3, i4, i5, i6, i7, obj, i8, dataType.mID, i9, z);
    }

    public synchronized void nAllocationElementData1D(long j, int i, int i2, int i3, byte[] bArr, int i4) {
        validate();
        rsnAllocationElementData1D(this.mContext, j, i, i2, i3, bArr, i4);
    }

    public synchronized void nAllocationGenerateMipmaps(long j) {
        validate();
        rsnAllocationGenerateMipmaps(this.mContext, j);
    }

    public synchronized ByteBuffer nAllocationGetByteBuffer(long j, int i, int i2, int i3) {
        validate();
        return rsnAllocationGetByteBuffer(this.mContext, j, i, i2, i3);
    }

    public synchronized long nAllocationGetStride(long j) {
        validate();
        return rsnAllocationGetStride(this.mContext, j);
    }

    synchronized long nAllocationGetType(long j) {
        validate();
        return rsnAllocationGetType(this.mContext, j);
    }

    public synchronized void nAllocationIoReceive(long j) {
        validate();
        rsnAllocationIoReceive(this.mContext, j);
    }

    public synchronized void nAllocationIoSend(long j) {
        validate();
        rsnAllocationIoSend(this.mContext, j);
    }

    public synchronized void nAllocationRead(long j, Object obj, Element.DataType dataType, int i, boolean z) {
        validate();
        rsnAllocationRead(this.mContext, j, obj, dataType.mID, i, z);
    }

    public synchronized void nAllocationRead1D(long j, int i, int i2, int i3, Object obj, int i4, Element.DataType dataType, int i5, boolean z) {
        validate();
        rsnAllocationRead1D(this.mContext, j, i, i2, i3, obj, i4, dataType.mID, i5, z);
    }

    public synchronized void nAllocationRead2D(long j, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, Element.DataType dataType, int i8, boolean z) {
        validate();
        rsnAllocationRead2D(this.mContext, j, i, i2, i3, i4, i5, i6, obj, i7, dataType.mID, i8, z);
    }

    synchronized void nAllocationResize1D(long j, int i) {
        validate();
        rsnAllocationResize1D(this.mContext, j, i);
    }

    synchronized void nAllocationResize2D(long j, int i, int i2) {
        validate();
        rsnAllocationResize2D(this.mContext, j, i, i2);
    }

    public synchronized void nAllocationSetSurface(long j, Surface surface) {
        validate();
        rsnAllocationSetSurface(this.mContext, j, surface);
    }

    public synchronized void nAllocationSyncAll(long j, int i) {
        validate();
        rsnAllocationSyncAll(this.mContext, j, i);
    }

    public synchronized long nClosureCreate(long j, long j2, long[] jArr, long[] jArr2, int[] iArr, long[] jArr3, long[] jArr4) {
        long jRsnClosureCreate;
        validate();
        jRsnClosureCreate = rsnClosureCreate(this.mContext, j, j2, jArr, jArr2, iArr, jArr3, jArr4);
        if (jRsnClosureCreate == 0) {
            throw new RSRuntimeException("Failed creating closure.");
        }
        return jRsnClosureCreate;
    }

    public synchronized void nClosureSetArg(long j, int i, long j2, int i2) {
        validate();
        rsnClosureSetArg(this.mContext, j, i, j2, i2);
    }

    public synchronized void nClosureSetGlobal(long j, long j2, long j3, int i) {
        validate();
        rsnClosureSetGlobal(this.mContext, j, j2, j3, i);
    }

    public synchronized long nContextCreate(long j, int i, int i2, int i3, String str) {
        return rsnContextCreate(j, i, i2, i3, str);
    }

    public native void nContextDeinitToClient(long j);

    public synchronized void nContextDestroy() {
        validate();
        ReentrantReadWriteLock.WriteLock writeLock = this.mRWLock.writeLock();
        writeLock.lock();
        long j = this.mContext;
        this.mContext = 0L;
        writeLock.unlock();
        rsnContextDestroy(j);
    }

    public synchronized void nContextDump(int i) {
        validate();
        rsnContextDump(this.mContext, i);
    }

    public synchronized void nContextFinish() {
        validate();
        rsnContextFinish(this.mContext);
    }

    public native String nContextGetErrorMessage(long j);

    public native int nContextGetUserMessage(long j, int[] iArr);

    public native void nContextInitToClient(long j);

    public native int nContextPeekMessage(long j, int[] iArr);

    public synchronized void nContextSendMessage(int i, int[] iArr) {
        validate();
        rsnContextSendMessage(this.mContext, i, iArr);
    }

    public synchronized void nContextSetPriority(int i) {
        validate();
        rsnContextSetPriority(this.mContext, i);
    }

    public native long nDeviceCreate();

    native void nDeviceDestroy(long j);

    native void nDeviceSetConfig(long j, int i, int i2);

    public synchronized long nElementCreate(long j, int i, boolean z, int i2) {
        validate();
        return rsnElementCreate(this.mContext, j, i, z, i2);
    }

    public synchronized long nElementCreate2(long[] jArr, String[] strArr, int[] iArr) {
        validate();
        return rsnElementCreate2(this.mContext, jArr, strArr, iArr);
    }

    synchronized void nElementGetNativeData(long j, int[] iArr) {
        validate();
        rsnElementGetNativeData(this.mContext, j, iArr);
    }

    synchronized void nElementGetSubElements(long j, long[] jArr, String[] strArr, int[] iArr) {
        validate();
        rsnElementGetSubElements(this.mContext, j, jArr, strArr, iArr);
    }

    public synchronized long nIncAllocationCreateTyped(long j, long j2, int i) {
        validate();
        return rsnIncAllocationCreateTyped(this.mContext, this.mIncCon, j, j2, i);
    }

    public synchronized long nIncContextCreate(long j, int i, int i2, int i3) {
        return rsnIncContextCreate(j, i, i2, i3);
    }

    public synchronized void nIncContextDestroy() {
        validate();
        ReentrantReadWriteLock.WriteLock writeLock = this.mRWLock.writeLock();
        writeLock.lock();
        long j = this.mIncCon;
        this.mIncCon = 0L;
        writeLock.unlock();
        rsnIncContextDestroy(j);
    }

    public synchronized void nIncContextFinish() {
        validate();
        rsnIncContextFinish(this.mIncCon);
    }

    public native long nIncDeviceCreate();

    native void nIncDeviceDestroy(long j);

    public synchronized long nIncElementCreate(long j, int i, boolean z, int i2) {
        validate();
        return rsnIncElementCreate(this.mIncCon, j, i, z, i2);
    }

    public native boolean nIncLoadSO(int i, String str);

    public void nIncObjDestroy(long j) {
        long j2 = this.mIncCon;
        if (j2 != 0) {
            rsnIncObjDestroy(j2, j);
        }
    }

    public synchronized long nIncTypeCreate(long j, int i, int i2, int i3, boolean z, boolean z2, int i4) {
        validate();
        return rsnIncTypeCreate(this.mIncCon, j, i, i2, i3, z, z2, i4);
    }

    public synchronized long nInvokeClosureCreate(long j, byte[] bArr, long[] jArr, long[] jArr2, int[] iArr) {
        long jRsnInvokeClosureCreate;
        validate();
        jRsnInvokeClosureCreate = rsnInvokeClosureCreate(this.mContext, j, bArr, jArr, jArr2, iArr);
        if (jRsnInvokeClosureCreate == 0) {
            throw new RSRuntimeException("Failed creating closure.");
        }
        return jRsnInvokeClosureCreate;
    }

    public native boolean nLoadIOSO();

    public native boolean nLoadSO(boolean z, int i, String str);

    public void nObjDestroy(long j) {
        long j2 = this.mContext;
        if (j2 != 0) {
            rsnObjDestroy(j2, j);
        }
    }

    public synchronized long nSamplerCreate(int i, int i2, int i3, int i4, int i5, float f) {
        validate();
        return rsnSamplerCreate(this.mContext, i, i2, i3, i4, i5, f);
    }

    public synchronized void nScriptBindAllocation(long j, long j2, int i, boolean z) {
        validate();
        rsnScriptBindAllocation(z ? this.mIncCon : this.mContext, j, j2, i, z);
    }

    public synchronized long nScriptCCreate(String str, String str2, byte[] bArr, int i) {
        validate();
        return rsnScriptCCreate(this.mContext, str, str2, bArr, i);
    }

    public synchronized long nScriptFieldIDCreate(long j, int i, boolean z) {
        validate();
        return rsnScriptFieldIDCreate(z ? this.mIncCon : this.mContext, j, i, z);
    }

    public synchronized void nScriptForEach(long j, int i, long j2, long j3, byte[] bArr, boolean z) {
        validate();
        if (bArr == null) {
            rsnScriptForEach(this.mContext, this.mIncCon, j, i, j2, j3, z);
        } else {
            rsnScriptForEach(this.mContext, this.mIncCon, j, i, j2, j3, bArr, z);
        }
    }

    public synchronized void nScriptForEach(long j, int i, long[] jArr, long j2, byte[] bArr, int[] iArr) {
        if (!this.mEnableMultiInput) {
            Log.e(LOG_TAG, "Multi-input kernels are not supported, please change targetSdkVersion to >= 23");
            throw new RSRuntimeException("Multi-input kernels are not supported before API 23)");
        }
        validate();
        rsnScriptForEach(this.mContext, j, i, jArr, j2, bArr, iArr);
    }

    public synchronized void nScriptForEachClipped(long j, int i, long j2, long j3, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) throws Throwable {
        try {
            validate();
            if (bArr != null) {
                rsnScriptForEachClipped(this.mContext, this.mIncCon, j, i, j2, j3, bArr, i2, i3, i4, i5, i6, i7, z);
                return;
            }
            try {
                rsnScriptForEachClipped(this.mContext, this.mIncCon, j, i, j2, j3, i2, i3, i4, i5, i6, i7, z);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized long nScriptGroup2Create(String str, String str2, long[] jArr) {
        validate();
        return rsnScriptGroup2Create(this.mContext, str, str2, jArr);
    }

    public synchronized void nScriptGroup2Execute(long j) {
        validate();
        rsnScriptGroup2Execute(this.mContext, j);
    }

    public synchronized long nScriptGroupCreate(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5) {
        validate();
        return rsnScriptGroupCreate(this.mContext, jArr, jArr2, jArr3, jArr4, jArr5);
    }

    public synchronized void nScriptGroupExecute(long j) {
        validate();
        rsnScriptGroupExecute(this.mContext, j);
    }

    public synchronized void nScriptGroupSetInput(long j, long j2, long j3) {
        validate();
        rsnScriptGroupSetInput(this.mContext, j, j2, j3);
    }

    public synchronized void nScriptGroupSetOutput(long j, long j2, long j3) {
        validate();
        rsnScriptGroupSetOutput(this.mContext, j, j2, j3);
    }

    public synchronized void nScriptIntrinsicBLAS_BNNM(long j, int i, int i2, int i3, long j2, int i4, long j3, int i5, long j4, int i6, int i7, boolean z) {
        validate();
        rsnScriptIntrinsicBLAS_BNNM(this.mContext, this.mIncCon, j, i, i2, i3, j2, i4, j3, i5, j4, i6, i7, z);
    }

    public synchronized void nScriptIntrinsicBLAS_Complex(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, float f2, long j2, long j3, float f3, float f4, long j4, int i10, int i11, int i12, int i13, boolean z) {
        validate();
        rsnScriptIntrinsicBLAS_Complex(this.mContext, this.mIncCon, j, i, i2, i3, i4, i5, i6, i7, i8, i9, f, f2, j2, j3, f3, f4, j4, i10, i11, i12, i13, z);
    }

    public synchronized void nScriptIntrinsicBLAS_Double(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, long j2, long j3, double d2, long j4, int i10, int i11, int i12, int i13, boolean z) {
        validate();
        rsnScriptIntrinsicBLAS_Double(this.mContext, this.mIncCon, j, i, i2, i3, i4, i5, i6, i7, i8, i9, d, j2, j3, d2, j4, i10, i11, i12, i13, z);
    }

    public synchronized void nScriptIntrinsicBLAS_Single(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, long j2, long j3, float f2, long j4, int i10, int i11, int i12, int i13, boolean z) {
        validate();
        rsnScriptIntrinsicBLAS_Single(this.mContext, this.mIncCon, j, i, i2, i3, i4, i5, i6, i7, i8, i9, f, j2, j3, f2, j4, i10, i11, i12, i13, z);
    }

    public synchronized void nScriptIntrinsicBLAS_Z(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, double d2, long j2, long j3, double d3, double d4, long j4, int i10, int i11, int i12, int i13, boolean z) {
        validate();
        rsnScriptIntrinsicBLAS_Z(this.mContext, this.mIncCon, j, i, i2, i3, i4, i5, i6, i7, i8, i9, d, d2, j2, j3, d3, d4, j4, i10, i11, i12, i13, z);
    }

    public synchronized long nScriptIntrinsicCreate(int i, long j, boolean z) {
        long j2;
        validate();
        if (!z) {
            return rsnScriptIntrinsicCreate(this.mContext, i, j, false);
        }
        if (!this.mIncLoaded) {
            try {
                System.loadLibrary("RSSupport");
                if (!nIncLoadSO(23, this.mNativeLibDir + "/libRSSupport.so")) {
                    throw new RSRuntimeException("Error loading libRSSupport library for Incremental Intrinsic Support");
                }
                this.mIncLoaded = true;
            } catch (UnsatisfiedLinkError e) {
                Log.e(LOG_TAG, "Error loading RS Compat library for Incremental Intrinsic Support: " + e);
                throw new RSRuntimeException("Error loading RS Compat library for Incremental Intrinsic Support: " + e);
            }
        }
        long j3 = this.mIncCon;
        if (j3 == 0) {
            long jNIncContextCreate = nIncContextCreate(nIncDeviceCreate(), 0, 0, 0);
            this.mIncCon = jNIncContextCreate;
            j2 = jNIncContextCreate;
        } else {
            j2 = j3;
        }
        return rsnScriptIntrinsicCreate(j2, i, j, true);
    }

    public synchronized void nScriptInvoke(long j, int i, boolean z) {
        validate();
        rsnScriptInvoke(z ? this.mIncCon : this.mContext, j, i, z);
    }

    public synchronized long nScriptInvokeIDCreate(long j, int i) {
        validate();
        return rsnScriptInvokeIDCreate(this.mContext, j, i);
    }

    public synchronized void nScriptInvokeV(long j, int i, byte[] bArr, boolean z) {
        validate();
        rsnScriptInvokeV(z ? this.mIncCon : this.mContext, j, i, bArr, z);
    }

    public synchronized long nScriptKernelIDCreate(long j, int i, int i2, boolean z) {
        validate();
        return rsnScriptKernelIDCreate(z ? this.mIncCon : this.mContext, j, i, i2, z);
    }

    public synchronized void nScriptReduce(long j, int i, long[] jArr, long j2, int[] iArr) {
        validate();
        rsnScriptReduce(this.mContext, j, i, jArr, j2, iArr);
    }

    public synchronized void nScriptSetTimeZone(long j, byte[] bArr, boolean z) {
        validate();
        rsnScriptSetTimeZone(z ? this.mIncCon : this.mContext, j, bArr, z);
    }

    public synchronized void nScriptSetVarD(long j, int i, double d, boolean z) {
        validate();
        rsnScriptSetVarD(z ? this.mIncCon : this.mContext, j, i, d, z);
    }

    public synchronized void nScriptSetVarF(long j, int i, float f, boolean z) {
        validate();
        rsnScriptSetVarF(z ? this.mIncCon : this.mContext, j, i, f, z);
    }

    public synchronized void nScriptSetVarI(long j, int i, int i2, boolean z) {
        validate();
        rsnScriptSetVarI(z ? this.mIncCon : this.mContext, j, i, i2, z);
    }

    public synchronized void nScriptSetVarJ(long j, int i, long j2, boolean z) {
        validate();
        rsnScriptSetVarJ(z ? this.mIncCon : this.mContext, j, i, j2, z);
    }

    public synchronized void nScriptSetVarObj(long j, int i, long j2, boolean z) {
        validate();
        rsnScriptSetVarObj(z ? this.mIncCon : this.mContext, j, i, j2, z);
    }

    public synchronized void nScriptSetVarV(long j, int i, byte[] bArr, boolean z) {
        validate();
        rsnScriptSetVarV(z ? this.mIncCon : this.mContext, j, i, bArr, z);
    }

    public synchronized void nScriptSetVarVE(long j, int i, byte[] bArr, long j2, int[] iArr, boolean z) {
        validate();
        rsnScriptSetVarVE(z ? this.mIncCon : this.mContext, j, i, bArr, j2, iArr, z);
    }

    public synchronized long nTypeCreate(long j, int i, int i2, int i3, boolean z, boolean z2, int i4) {
        validate();
        return rsnTypeCreate(this.mContext, j, i, i2, i3, z, z2, i4);
    }

    synchronized void nTypeGetNativeData(long j, long[] jArr) {
        validate();
        rsnTypeGetNativeData(this.mContext, j, jArr);
    }

    public native void rsnAllocationCopyFromBitmap(long j, long j2, Bitmap bitmap);

    public native void rsnAllocationCopyToBitmap(long j, long j2, Bitmap bitmap);

    public native long rsnAllocationCreateBitmapBackedAllocation(long j, long j2, int i, Bitmap bitmap, int i2);

    public native long rsnAllocationCreateBitmapRef(long j, long j2, Bitmap bitmap);

    public native long rsnAllocationCreateFromAssetStream(long j, int i, int i2, int i3);

    public native long rsnAllocationCreateFromBitmap(long j, long j2, int i, Bitmap bitmap, int i2);

    public native long rsnAllocationCreateTyped(long j, long j2, int i, int i2, long j3);

    public native long rsnAllocationCubeCreateFromBitmap(long j, long j2, int i, Bitmap bitmap, int i2);

    public native void rsnAllocationData1D(long j, long j2, int i, int i2, int i3, Object obj, int i4, int i5, int i6, boolean z);

    public native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, long j3, int i7, int i8, int i9, int i10);

    public native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, int i9, boolean z);

    public native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, Bitmap bitmap);

    public native void rsnAllocationData3D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j3, int i8, int i9, int i10, int i11);

    public native void rsnAllocationData3D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, int i9, int i10, boolean z);

    public native void rsnAllocationElementData1D(long j, long j2, int i, int i2, int i3, byte[] bArr, int i4);

    public native void rsnAllocationGenerateMipmaps(long j, long j2);

    public native ByteBuffer rsnAllocationGetByteBuffer(long j, long j2, int i, int i2, int i3);

    public native long rsnAllocationGetStride(long j, long j2);

    public native long rsnAllocationGetType(long j, long j2);

    public native void rsnAllocationIoReceive(long j, long j2);

    public native void rsnAllocationIoSend(long j, long j2);

    public native void rsnAllocationRead(long j, long j2, Object obj, int i, int i2, boolean z);

    public native void rsnAllocationRead1D(long j, long j2, int i, int i2, int i3, Object obj, int i4, int i5, int i6, boolean z);

    public native void rsnAllocationRead2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, int i9, boolean z);

    public native void rsnAllocationResize1D(long j, long j2, int i);

    public native void rsnAllocationResize2D(long j, long j2, int i, int i2);

    public native void rsnAllocationSetSurface(long j, long j2, Surface surface);

    public native void rsnAllocationSyncAll(long j, long j2, int i);

    public native long rsnClosureCreate(long j, long j2, long j3, long[] jArr, long[] jArr2, int[] iArr, long[] jArr3, long[] jArr4);

    public native void rsnClosureSetArg(long j, long j2, int i, long j3, int i2);

    public native void rsnClosureSetGlobal(long j, long j2, long j3, long j4, int i);

    public native long rsnContextCreate(long j, int i, int i2, int i3, String str);

    public native void rsnContextDestroy(long j);

    public native void rsnContextDump(long j, int i);

    public native void rsnContextFinish(long j);

    public native void rsnContextSendMessage(long j, int i, int[] iArr);

    public native void rsnContextSetPriority(long j, int i);

    public native long rsnElementCreate(long j, long j2, int i, boolean z, int i2);

    public native long rsnElementCreate2(long j, long[] jArr, String[] strArr, int[] iArr);

    public native void rsnElementGetNativeData(long j, long j2, int[] iArr);

    public native void rsnElementGetSubElements(long j, long j2, long[] jArr, String[] strArr, int[] iArr);

    public native long rsnIncAllocationCreateTyped(long j, long j2, long j3, long j4, int i);

    public native long rsnIncContextCreate(long j, int i, int i2, int i3);

    public native void rsnIncContextDestroy(long j);

    public native void rsnIncContextFinish(long j);

    public native long rsnIncElementCreate(long j, long j2, int i, boolean z, int i2);

    public native void rsnIncObjDestroy(long j, long j2);

    public native long rsnIncTypeCreate(long j, long j2, int i, int i2, int i3, boolean z, boolean z2, int i4);

    public native long rsnInvokeClosureCreate(long j, long j2, byte[] bArr, long[] jArr, long[] jArr2, int[] iArr);

    public native void rsnObjDestroy(long j, long j2);

    public native long rsnSamplerCreate(long j, int i, int i2, int i3, int i4, int i5, float f);

    public native void rsnScriptBindAllocation(long j, long j2, long j3, int i, boolean z);

    public native long rsnScriptCCreate(long j, String str, String str2, byte[] bArr, int i);

    public native long rsnScriptFieldIDCreate(long j, long j2, int i, boolean z);

    public native void rsnScriptForEach(long j, long j2, int i, long[] jArr, long j3, byte[] bArr, int[] iArr);

    public native void rsnScriptForEach(long j, long j2, long j3, int i, long j4, long j5, boolean z);

    public native void rsnScriptForEach(long j, long j2, long j3, int i, long j4, long j5, byte[] bArr, boolean z);

    public native void rsnScriptForEachClipped(long j, long j2, long j3, int i, long j4, long j5, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    public native void rsnScriptForEachClipped(long j, long j2, long j3, int i, long j4, long j5, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    public native long rsnScriptGroup2Create(long j, String str, String str2, long[] jArr);

    public native void rsnScriptGroup2Execute(long j, long j2);

    public native long rsnScriptGroupCreate(long j, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5);

    public native void rsnScriptGroupExecute(long j, long j2);

    public native void rsnScriptGroupSetInput(long j, long j2, long j3, long j4);

    public native void rsnScriptGroupSetOutput(long j, long j2, long j3, long j4);

    public native void rsnScriptIntrinsicBLAS_BNNM(long j, long j2, long j3, int i, int i2, int i3, long j4, int i4, long j5, int i5, long j6, int i6, int i7, boolean z);

    public native void rsnScriptIntrinsicBLAS_Complex(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, float f2, long j4, long j5, float f3, float f4, long j6, int i10, int i11, int i12, int i13, boolean z);

    public native void rsnScriptIntrinsicBLAS_Double(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, long j4, long j5, double d2, long j6, int i10, int i11, int i12, int i13, boolean z);

    public native void rsnScriptIntrinsicBLAS_Single(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, long j4, long j5, float f2, long j6, int i10, int i11, int i12, int i13, boolean z);

    public native void rsnScriptIntrinsicBLAS_Z(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, double d2, long j4, long j5, double d3, double d4, long j6, int i10, int i11, int i12, int i13, boolean z);

    public native long rsnScriptIntrinsicCreate(long j, int i, long j2, boolean z);

    public native void rsnScriptInvoke(long j, long j2, int i, boolean z);

    public native long rsnScriptInvokeIDCreate(long j, long j2, int i);

    public native void rsnScriptInvokeV(long j, long j2, int i, byte[] bArr, boolean z);

    public native long rsnScriptKernelIDCreate(long j, long j2, int i, int i2, boolean z);

    public native void rsnScriptReduce(long j, long j2, int i, long[] jArr, long j3, int[] iArr);

    public native void rsnScriptSetTimeZone(long j, long j2, byte[] bArr, boolean z);

    public native void rsnScriptSetVarD(long j, long j2, int i, double d, boolean z);

    public native void rsnScriptSetVarF(long j, long j2, int i, float f, boolean z);

    public native void rsnScriptSetVarI(long j, long j2, int i, int i2, boolean z);

    public native void rsnScriptSetVarJ(long j, long j2, int i, long j3, boolean z);

    public native void rsnScriptSetVarObj(long j, long j2, int i, long j3, boolean z);

    public native void rsnScriptSetVarV(long j, long j2, int i, byte[] bArr, boolean z);

    public native void rsnScriptSetVarVE(long j, long j2, int i, byte[] bArr, long j3, int[] iArr, boolean z);

    public native long rsnTypeCreate(long j, long j2, int i, int i2, int i3, boolean z, boolean z2, int i4);

    public native void rsnTypeGetNativeData(long j, long j2, long[] jArr);

    public long safeID(BaseObj baseObj) {
        if (baseObj != null) {
            return baseObj.getID(this);
        }
        return 0L;
    }

    public void sendMessage(int i, int[] iArr) {
        nContextSendMessage(i, iArr);
    }

    public void setErrorHandler(RSErrorHandler rSErrorHandler) {
        this.mErrorCallback = rSErrorHandler;
    }

    public void setMessageHandler(RSMessageHandler rSMessageHandler) {
        this.mMessageCallback = rSMessageHandler;
    }

    public void setPriority(Priority priority) {
        validate();
        nContextSetPriority(priority.mID);
    }

    public boolean usingIO() {
        return useIOlib;
    }

    public void validate() {
        if (this.mContext == 0) {
            throw new RSInvalidStateException("Calling RS with no Context active.");
        }
    }

    public void validateObject(BaseObj baseObj) {
        if (baseObj != null && baseObj.mRS != this) {
            throw new RSIllegalArgumentException("Attempting to use an object across contexts.");
        }
    }
}
