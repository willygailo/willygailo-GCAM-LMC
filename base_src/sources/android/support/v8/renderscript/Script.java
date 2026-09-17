package android.support.v8.renderscript;

import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class Script extends BaseObj {
    private final SparseArray mFIDs;
    private final SparseArray mIIDs;
    private final SparseArray mKIDs;
    private boolean mUseIncSupp;

    public class Builder {
        RenderScript mRS;

        Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }
    }

    public class FieldBase {
        protected Allocation mAllocation;
        protected Element mElement;

        protected FieldBase() {
        }

        public Allocation getAllocation() {
            return this.mAllocation;
        }

        public Element getElement() {
            return this.mElement;
        }

        public Type getType() {
            return this.mAllocation.getType();
        }

        protected void init(RenderScript renderScript, int i) {
            this.mAllocation = Allocation.createSized(renderScript, this.mElement, i, 1);
        }

        protected void init(RenderScript renderScript, int i, int i2) {
            this.mAllocation = Allocation.createSized(renderScript, this.mElement, i, i2 | 1);
        }

        public void updateAllocation() {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class FieldID extends BaseObj {
        android.renderscript.Script.FieldID mN;
        Script mScript;
        int mSlot;

        public FieldID(long j, RenderScript renderScript, Script script, int i) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
        }
    }

    public final class InvokeID extends BaseObj {
        Script mScript;
        int mSlot;

        public InvokeID(long j, RenderScript renderScript, Script script, int i) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class KernelID extends BaseObj {
        android.renderscript.Script.KernelID mN;
        Script mScript;
        int mSig;
        int mSlot;

        public KernelID(long j, RenderScript renderScript, Script script, int i, int i2) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
            this.mSig = i2;
        }
    }

    public final class LaunchOptions {
        private int strategy;
        private int xstart = 0;
        private int ystart = 0;
        private int xend = 0;
        private int yend = 0;
        private int zstart = 0;
        private int zend = 0;

        public int getXEnd() {
            return this.xend;
        }

        public int getXStart() {
            return this.xstart;
        }

        public int getYEnd() {
            return this.yend;
        }

        public int getYStart() {
            return this.ystart;
        }

        public int getZEnd() {
            return this.zend;
        }

        public int getZStart() {
            return this.zstart;
        }

        public LaunchOptions setX(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.xstart = i;
            this.xend = i2;
            return this;
        }

        public LaunchOptions setY(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.ystart = i;
            this.yend = i2;
            return this;
        }

        public LaunchOptions setZ(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.zstart = i;
            this.zend = i2;
            return this;
        }
    }

    public Script(long j, RenderScript renderScript) {
        super(j, renderScript);
        this.mKIDs = new SparseArray();
        this.mIIDs = new SparseArray();
        this.mFIDs = new SparseArray();
        this.mUseIncSupp = false;
    }

    public void bindAllocation(Allocation allocation, int i) {
        this.mRS.validate();
        if (allocation != null) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptBindAllocation(getID(renderScript), allocation.getID(this.mRS), i, this.mUseIncSupp);
        } else {
            RenderScript renderScript2 = this.mRS;
            renderScript2.nScriptBindAllocation(getID(renderScript2), 0L, i, this.mUseIncSupp);
        }
    }

    protected FieldID createFieldID(int i, Element element) {
        FieldID fieldID = (FieldID) this.mFIDs.get(i);
        if (fieldID != null) {
            return fieldID;
        }
        RenderScript renderScript = this.mRS;
        long jNScriptFieldIDCreate = renderScript.nScriptFieldIDCreate(getID(renderScript), i, this.mUseIncSupp);
        if (jNScriptFieldIDCreate == 0) {
            throw new RSDriverException("Failed to create FieldID");
        }
        FieldID fieldID2 = new FieldID(jNScriptFieldIDCreate, this.mRS, this, i);
        this.mFIDs.put(i, fieldID2);
        return fieldID2;
    }

    protected InvokeID createInvokeID(int i) {
        InvokeID invokeID = (InvokeID) this.mIIDs.get(i);
        if (invokeID != null) {
            return invokeID;
        }
        RenderScript renderScript = this.mRS;
        long jNScriptInvokeIDCreate = renderScript.nScriptInvokeIDCreate(getID(renderScript), i);
        if (jNScriptInvokeIDCreate == 0) {
            throw new RSDriverException("Failed to create KernelID");
        }
        InvokeID invokeID2 = new InvokeID(jNScriptInvokeIDCreate, this.mRS, this, i);
        this.mIIDs.put(i, invokeID2);
        return invokeID2;
    }

    protected KernelID createKernelID(int i, int i2, Element element, Element element2) {
        KernelID kernelID = (KernelID) this.mKIDs.get(i);
        if (kernelID != null) {
            return kernelID;
        }
        RenderScript renderScript = this.mRS;
        long jNScriptKernelIDCreate = renderScript.nScriptKernelIDCreate(getID(renderScript), i, i2, this.mUseIncSupp);
        if (jNScriptKernelIDCreate == 0) {
            throw new RSDriverException("Failed to create KernelID");
        }
        KernelID kernelID2 = new KernelID(jNScriptKernelIDCreate, this.mRS, this, i, i2);
        this.mKIDs.put(i, kernelID2);
        return kernelID2;
    }

    protected void forEach(int i, Allocation allocation, Allocation allocation2, FieldPacker fieldPacker) {
        if (allocation == null && allocation2 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        long id = allocation != null ? allocation.getID(this.mRS) : 0L;
        long id2 = allocation2 != null ? allocation2.getID(this.mRS) : 0L;
        byte[] data = fieldPacker != null ? fieldPacker.getData() : null;
        if (!this.mUseIncSupp) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptForEach(getID(renderScript), i, id, id2, data, this.mUseIncSupp);
        } else {
            long dummyAlloc = getDummyAlloc(allocation);
            long dummyAlloc2 = getDummyAlloc(allocation2);
            RenderScript renderScript2 = this.mRS;
            renderScript2.nScriptForEach(getID(renderScript2), i, dummyAlloc, dummyAlloc2, data, this.mUseIncSupp);
        }
    }

    protected void forEach(int i, Allocation allocation, Allocation allocation2, FieldPacker fieldPacker, LaunchOptions launchOptions) throws Throwable {
        if (allocation == null && allocation2 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        if (launchOptions == null) {
            forEach(i, allocation, allocation2, fieldPacker);
            return;
        }
        long id = allocation != null ? allocation.getID(this.mRS) : 0L;
        long id2 = allocation2 != null ? allocation2.getID(this.mRS) : 0L;
        byte[] data = fieldPacker != null ? fieldPacker.getData() : null;
        if (!this.mUseIncSupp) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptForEachClipped(getID(renderScript), i, id, id2, data, launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend, this.mUseIncSupp);
        } else {
            long dummyAlloc = getDummyAlloc(allocation);
            long dummyAlloc2 = getDummyAlloc(allocation2);
            RenderScript renderScript2 = this.mRS;
            renderScript2.nScriptForEachClipped(getID(renderScript2), i, dummyAlloc, dummyAlloc2, data, launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend, this.mUseIncSupp);
        }
    }

    protected void forEach(int i, Allocation[] allocationArr, Allocation allocation, FieldPacker fieldPacker) {
        forEach(i, allocationArr, allocation, fieldPacker, (LaunchOptions) null);
    }

    protected void forEach(int i, Allocation[] allocationArr, Allocation allocation, FieldPacker fieldPacker, LaunchOptions launchOptions) {
        long[] jArr;
        this.mRS.validate();
        if (allocationArr != null) {
            for (Allocation allocation2 : allocationArr) {
                this.mRS.validateObject(allocation2);
            }
        }
        this.mRS.validateObject(allocation);
        if (allocationArr == null && allocation == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        if (allocationArr != null) {
            long[] jArr2 = new long[allocationArr.length];
            for (int i2 = 0; i2 < allocationArr.length; i2++) {
                jArr2[i2] = allocationArr[i2].getID(this.mRS);
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        long id = allocation != null ? allocation.getID(this.mRS) : 0L;
        byte[] data = fieldPacker != null ? fieldPacker.getData() : null;
        int[] iArr = launchOptions != null ? new int[]{launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend} : null;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptForEach(getID(renderScript), i, jArr, id, data, iArr);
    }

    public long getDummyAlloc(Allocation allocation) {
        if (allocation == null) {
            return 0L;
        }
        Type type = allocation.getType();
        long dummyType = type.getDummyType(this.mRS, type.getElement().getDummyElement(this.mRS));
        int x = type.getX();
        int bytesSize = type.getElement().getBytesSize();
        RenderScript renderScript = this.mRS;
        long jNIncAllocationCreateTyped = renderScript.nIncAllocationCreateTyped(allocation.getID(renderScript), dummyType, x * bytesSize);
        allocation.setIncAllocID(jNIncAllocationCreateTyped);
        return jNIncAllocationCreateTyped;
    }

    protected void invoke(int i) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptInvoke(getID(renderScript), i, this.mUseIncSupp);
    }

    protected void invoke(int i, FieldPacker fieldPacker) {
        if (fieldPacker != null) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptInvokeV(getID(renderScript), i, fieldPacker.getData(), this.mUseIncSupp);
        } else {
            RenderScript renderScript2 = this.mRS;
            renderScript2.nScriptInvoke(getID(renderScript2), i, this.mUseIncSupp);
        }
    }

    protected boolean isIncSupp() {
        return this.mUseIncSupp;
    }

    protected void reduce(int i, Allocation[] allocationArr, Allocation allocation, LaunchOptions launchOptions) {
        this.mRS.validate();
        if (allocationArr == null || (allocationArr.length) <= 0) {
            throw new RSIllegalArgumentException("At least one input is required.");
        }
        if (allocation == null) {
            throw new RSIllegalArgumentException("aout is required to be non-null.");
        }
        for (Allocation allocation2 : allocationArr) {
            this.mRS.validateObject(allocation2);
        }
        long[] jArr = new long[allocationArr.length];
        for (int i2 = 0; i2 < allocationArr.length; i2++) {
            jArr[i2] = allocationArr[i2].getID(this.mRS);
        }
        long id = allocation.getID(this.mRS);
        int[] iArr = launchOptions != null ? new int[]{launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend} : null;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptReduce(getID(renderScript), i, jArr, id, iArr);
    }

    protected void setIncSupp(boolean z) {
        this.mUseIncSupp = z;
    }

    public void setTimeZone(String str) {
        this.mRS.validate();
        try {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetTimeZone(getID(renderScript), str.getBytes("UTF-8"), this.mUseIncSupp);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public void setVar(int i, double d) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarD(getID(renderScript), i, d, this.mUseIncSupp);
    }

    public void setVar(int i, float f) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarF(getID(renderScript), i, f, this.mUseIncSupp);
    }

    public void setVar(int i, int i2) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarI(getID(renderScript), i, i2, this.mUseIncSupp);
    }

    public void setVar(int i, long j) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarJ(getID(renderScript), i, j, this.mUseIncSupp);
    }

    public void setVar(int i, BaseObj baseObj) {
        if (!this.mUseIncSupp) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetVarObj(getID(renderScript), i, baseObj != null ? baseObj.getID(this.mRS) : 0L, this.mUseIncSupp);
        } else {
            long dummyAlloc = getDummyAlloc((Allocation) baseObj);
            RenderScript renderScript2 = this.mRS;
            renderScript2.nScriptSetVarObj(getID(renderScript2), i, baseObj == null ? 0L : dummyAlloc, this.mUseIncSupp);
        }
    }

    public void setVar(int i, FieldPacker fieldPacker) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarV(getID(renderScript), i, fieldPacker.getData(), this.mUseIncSupp);
    }

    public void setVar(int i, FieldPacker fieldPacker, Element element, int[] iArr) {
        if (!this.mUseIncSupp) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetVarVE(getID(renderScript), i, fieldPacker.getData(), element.getID(this.mRS), iArr, this.mUseIncSupp);
        } else {
            long dummyElement = element.getDummyElement(this.mRS);
            RenderScript renderScript2 = this.mRS;
            renderScript2.nScriptSetVarVE(getID(renderScript2), i, fieldPacker.getData(), dummyElement, iArr, this.mUseIncSupp);
        }
    }

    public void setVar(int i, boolean z) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarI(getID(renderScript), i, z ? 1 : 0, this.mUseIncSupp);
    }
}
