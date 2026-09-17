package android.support.v8.renderscript;

/* JADX INFO: loaded from: classes.dex */
public class ScriptIntrinsicResize extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 21;
    private Allocation mInput;

    public ScriptIntrinsicResize(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicResize create(RenderScript renderScript) {
        renderScript.isUseNative();
        ScriptIntrinsicResize scriptIntrinsicResize = new ScriptIntrinsicResize(renderScript.nScriptIntrinsicCreate(12, 0L, false), renderScript);
        scriptIntrinsicResize.setIncSupp(false);
        return scriptIntrinsicResize;
    }

    public void forEach_bicubic(Allocation allocation) throws Throwable {
        if (allocation == this.mInput) {
            throw new RSIllegalArgumentException("Output cannot be same as Input.");
        }
        forEach_bicubic(allocation, null);
    }

    public void forEach_bicubic(Allocation allocation, Script.LaunchOptions launchOptions) throws Throwable {
        forEach(0, (Allocation) null, allocation, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID getFieldID_Input() {
        return createFieldID(0, null);
    }

    public Script.KernelID getKernelID_bicubic() {
        return createKernelID(0, 2, null, null);
    }

    public void setInput(Allocation allocation) {
        Element element = allocation.getElement();
        if (!element.isCompatible(Element.U8(this.mRS)) && !element.isCompatible(Element.U8_2(this.mRS)) && !element.isCompatible(Element.U8_3(this.mRS)) && !element.isCompatible(Element.U8_4(this.mRS)) && !element.isCompatible(Element.F32(this.mRS)) && !element.isCompatible(Element.F32_2(this.mRS)) && !element.isCompatible(Element.F32_3(this.mRS)) && !element.isCompatible(Element.F32_4(this.mRS))) {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
        this.mInput = allocation;
        setVar(0, allocation);
    }
}
