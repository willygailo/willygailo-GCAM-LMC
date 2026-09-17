package android.support.v8.renderscript;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ScriptGroup extends BaseObj {
    private static final int MIN_API_VERSION = 23;
    private static final String TAG = "ScriptGroup";
    private List mClosures;
    IO[] mInputs;
    private List mInputs2;
    private String mName;
    private ArrayList mNodes;
    IO[] mOutputs;
    private Future[] mOutputs2;
    private boolean mUseIncSupp;

    public final class Binding {
        private final Script.FieldID mField;
        private final Object mValue;

        public Binding(Script.FieldID fieldID, Object obj) {
            this.mField = fieldID;
            this.mValue = obj;
        }

        public Script.FieldID getField() {
            return this.mField;
        }

        public Object getValue() {
            return this.mValue;
        }
    }

    @Deprecated
    public final class Builder {
        private int mKernelCount;
        private RenderScript mRS;
        private ArrayList mNodes = new ArrayList();
        private ArrayList mLines = new ArrayList();
        private boolean mUseIncSupp = false;

        public Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }

        private boolean calcOrder() {
            ArrayList arrayList = this.mNodes;
            int size = arrayList.size();
            boolean zCalcOrderRecurse = true;
            for (int i = 0; i < size; i++) {
                Node node = (Node) arrayList.get(i);
                if (node.mInputs.size() == 0) {
                    ArrayList arrayList2 = this.mNodes;
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((Node) arrayList2.get(i2)).mSeen = false;
                    }
                    zCalcOrderRecurse &= calcOrderRecurse(node, 1);
                }
            }
            Collections.sort(this.mNodes, new Comparator() { // from class: android.support.v8.renderscript.ScriptGroup.Builder.1
                @Override // java.util.Comparator
                public int compare(Node node2, Node node3) {
                    return node2.mOrder - node3.mOrder;
                }
            });
            return zCalcOrderRecurse;
        }

        private boolean calcOrderRecurse(Node node, int i) {
            node.mSeen = true;
            if (node.mOrder < i) {
                node.mOrder = i;
            }
            ArrayList arrayList = node.mOutputs;
            int size = arrayList.size();
            boolean zCalcOrderRecurse = true;
            for (int i2 = 0; i2 < size; i2++) {
                ConnectLine connectLine = (ConnectLine) arrayList.get(i2);
                Script.FieldID fieldID = connectLine.mToF;
                Node nodeFindNode = fieldID != null ? findNode(fieldID.mScript) : findNode(connectLine.mToK.mScript);
                if (nodeFindNode.mSeen) {
                    return false;
                }
                zCalcOrderRecurse &= calcOrderRecurse(nodeFindNode, node.mOrder + 1);
            }
            return zCalcOrderRecurse;
        }

        private Node findNode(Script.KernelID kernelID) {
            for (int i = 0; i < this.mNodes.size(); i++) {
                Node node = (Node) this.mNodes.get(i);
                for (int i2 = 0; i2 < node.mKernels.size(); i2++) {
                    if (kernelID == node.mKernels.get(i2)) {
                        return node;
                    }
                }
            }
            return null;
        }

        private Node findNode(Script script) {
            for (int i = 0; i < this.mNodes.size(); i++) {
                if (script == ((Node) this.mNodes.get(i)).mScript) {
                    return (Node) this.mNodes.get(i);
                }
            }
            return null;
        }

        private void mergeDAGs(int i, int i2) {
            for (int i3 = 0; i3 < this.mNodes.size(); i3++) {
                if (((Node) this.mNodes.get(i3)).dagNumber == i2) {
                    ((Node) this.mNodes.get(i3)).dagNumber = i;
                }
            }
        }

        private void validateCycle(Node node, Node node2) {
            for (int i = 0; i < node.mOutputs.size(); i++) {
                ConnectLine connectLine = (ConnectLine) node.mOutputs.get(i);
                Script.KernelID kernelID = connectLine.mToK;
                if (kernelID != null) {
                    Node nodeFindNode = findNode(kernelID.mScript);
                    if (nodeFindNode.equals(node2)) {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                    validateCycle(nodeFindNode, node2);
                }
                Script.FieldID fieldID = connectLine.mToF;
                if (fieldID != null) {
                    Node nodeFindNode2 = findNode(fieldID.mScript);
                    if (nodeFindNode2.equals(node2)) {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                    validateCycle(nodeFindNode2, node2);
                }
            }
        }

        private void validateDAG() {
            for (int i = 0; i < this.mNodes.size(); i++) {
                Node node = (Node) this.mNodes.get(i);
                if (node.mInputs.size() == 0) {
                    if (node.mOutputs.size() == 0 && this.mNodes.size() > 1) {
                        throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
                    }
                    validateDAGRecurse(node, i + 1);
                }
            }
            int i2 = ((Node) this.mNodes.get(0)).dagNumber;
            for (int i3 = 0; i3 < this.mNodes.size(); i3++) {
                if (((Node) this.mNodes.get(i3)).dagNumber != i2) {
                    throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
                }
            }
        }

        private void validateDAGRecurse(Node node, int i) {
            int i2 = node.dagNumber;
            if (i2 != 0 && i2 != i) {
                mergeDAGs(i2, i);
                return;
            }
            node.dagNumber = i;
            for (int i3 = 0; i3 < node.mOutputs.size(); i3++) {
                ConnectLine connectLine = (ConnectLine) node.mOutputs.get(i3);
                Script.KernelID kernelID = connectLine.mToK;
                if (kernelID != null) {
                    validateDAGRecurse(findNode(kernelID.mScript), i);
                }
                Script.FieldID fieldID = connectLine.mToF;
                if (fieldID != null) {
                    validateDAGRecurse(findNode(fieldID.mScript), i);
                }
            }
        }

        public Builder addConnection(Type type, Script.KernelID kernelID, Script.FieldID fieldID) {
            Node nodeFindNode = findNode(kernelID);
            if (nodeFindNode == null) {
                throw new RSInvalidStateException("From script not found.");
            }
            Node nodeFindNode2 = findNode(fieldID.mScript);
            if (nodeFindNode2 == null) {
                throw new RSInvalidStateException("To script not found.");
            }
            ConnectLine connectLine = new ConnectLine(type, kernelID, fieldID);
            this.mLines.add(new ConnectLine(type, kernelID, fieldID));
            nodeFindNode.mOutputs.add(connectLine);
            nodeFindNode2.mInputs.add(connectLine);
            validateCycle(nodeFindNode, nodeFindNode);
            return this;
        }

        public Builder addConnection(Type type, Script.KernelID kernelID, Script.KernelID kernelID2) {
            Node nodeFindNode = findNode(kernelID);
            if (nodeFindNode == null) {
                throw new RSInvalidStateException("From script not found.");
            }
            Node nodeFindNode2 = findNode(kernelID2);
            if (nodeFindNode2 == null) {
                throw new RSInvalidStateException("To script not found.");
            }
            ConnectLine connectLine = new ConnectLine(type, kernelID, kernelID2);
            this.mLines.add(new ConnectLine(type, kernelID, kernelID2));
            nodeFindNode.mOutputs.add(connectLine);
            nodeFindNode2.mInputs.add(connectLine);
            validateCycle(nodeFindNode, nodeFindNode);
            return this;
        }

        public Builder addKernel(Script.KernelID kernelID) {
            if (this.mLines.size() != 0) {
                throw new RSInvalidStateException("Kernels may not be added once connections exist.");
            }
            if (kernelID.mScript.isIncSupp()) {
                this.mUseIncSupp = true;
            }
            if (findNode(kernelID) != null) {
                return this;
            }
            this.mKernelCount++;
            Node nodeFindNode = findNode(kernelID.mScript);
            if (nodeFindNode == null) {
                nodeFindNode = new Node(kernelID.mScript);
                this.mNodes.add(nodeFindNode);
            }
            nodeFindNode.mKernels.add(kernelID);
            return this;
        }

        public ScriptGroup create() {
            if (this.mNodes.size() == 0) {
                throw new RSInvalidStateException("Empty script groups are not allowed");
            }
            for (int i = 0; i < this.mNodes.size(); i++) {
                ((Node) this.mNodes.get(i)).dagNumber = 0;
            }
            validateDAG();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long[] jArr = new long[this.mKernelCount];
            int i2 = 0;
            for (int i3 = 0; i3 < this.mNodes.size(); i3++) {
                Node node = (Node) this.mNodes.get(i3);
                int i4 = 0;
                while (i4 < node.mKernels.size()) {
                    Script.KernelID kernelID = (Script.KernelID) node.mKernels.get(i4);
                    int i5 = i2 + 1;
                    jArr[i2] = kernelID.getID(this.mRS);
                    boolean z = false;
                    for (int i6 = 0; i6 < node.mInputs.size(); i6++) {
                        z |= !(((ConnectLine) node.mInputs.get(i6)).mToK != kernelID);
                    }
                    boolean z2 = false;
                    for (int i7 = 0; i7 < node.mOutputs.size(); i7++) {
                        z2 |= !(((ConnectLine) node.mOutputs.get(i7)).mFrom != kernelID);
                    }
                    if (!z) {
                        arrayList.add(new IO(kernelID));
                    }
                    if (!z2) {
                        arrayList2.add(new IO(kernelID));
                    }
                    i4++;
                    i2 = i5;
                }
            }
            if (i2 != this.mKernelCount) {
                throw new RSRuntimeException("Count mismatch, should not happen.");
            }
            long j = 0;
            if (this.mUseIncSupp) {
                calcOrder();
            } else {
                long[] jArr2 = new long[this.mLines.size()];
                long[] jArr3 = new long[this.mLines.size()];
                long[] jArr4 = new long[this.mLines.size()];
                long[] jArr5 = new long[this.mLines.size()];
                for (int i8 = 0; i8 < this.mLines.size(); i8++) {
                    ConnectLine connectLine = (ConnectLine) this.mLines.get(i8);
                    jArr2[i8] = connectLine.mFrom.getID(this.mRS);
                    Script.KernelID kernelID2 = connectLine.mToK;
                    if (kernelID2 != null) {
                        jArr3[i8] = kernelID2.getID(this.mRS);
                    }
                    Script.FieldID fieldID = connectLine.mToF;
                    if (fieldID != null) {
                        jArr4[i8] = fieldID.getID(this.mRS);
                    }
                    jArr5[i8] = connectLine.mAllocationType.getID(this.mRS);
                }
                long jNScriptGroupCreate = this.mRS.nScriptGroupCreate(jArr, jArr2, jArr3, jArr4, jArr5);
                if (jNScriptGroupCreate == 0) {
                    throw new RSRuntimeException("Object creation error, should not happen.");
                }
                j = jNScriptGroupCreate;
            }
            ScriptGroup scriptGroup = new ScriptGroup(j, this.mRS);
            scriptGroup.mOutputs = new IO[arrayList2.size()];
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                scriptGroup.mOutputs[i9] = (IO) arrayList2.get(i9);
            }
            scriptGroup.mInputs = new IO[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                scriptGroup.mInputs[i10] = (IO) arrayList.get(i10);
            }
            scriptGroup.mNodes = this.mNodes;
            scriptGroup.mUseIncSupp = this.mUseIncSupp;
            return scriptGroup;
        }
    }

    public final class Builder2 {
        private static final String TAG = "ScriptGroup.Builder2";
        List mClosures = new ArrayList();
        List mInputs = new ArrayList();
        RenderScript mRS;

        public Builder2(RenderScript renderScript) {
            this.mRS = renderScript;
        }

        private Closure addInvokeInternal(Script.InvokeID invokeID, Object[] objArr, Map map) {
            Closure closure = new Closure(this.mRS, invokeID, objArr, map);
            this.mClosures.add(closure);
            return closure;
        }

        private Closure addKernelInternal(Script.KernelID kernelID, Type type, Object[] objArr, Map map) {
            Closure closure = new Closure(this.mRS, kernelID, type, objArr, map);
            this.mClosures.add(closure);
            return closure;
        }

        private boolean seperateArgsAndBindings(Object[] objArr, ArrayList arrayList, Map map) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                if (obj instanceof Binding) {
                    break;
                }
                arrayList.add(obj);
                i++;
            }
            while (i < objArr.length) {
                Object obj2 = objArr[i];
                if (!(obj2 instanceof Binding)) {
                    return false;
                }
                Binding binding = (Binding) obj2;
                map.put(binding.getField(), binding.getValue());
                i++;
            }
            return true;
        }

        public Input addInput() {
            Input input = new Input();
            this.mInputs.add(input);
            return input;
        }

        public Closure addInvoke(Script.InvokeID invokeID, Object... objArr) {
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            if (seperateArgsAndBindings(objArr, arrayList, map)) {
                return addInvokeInternal(invokeID, arrayList.toArray(), map);
            }
            return null;
        }

        public Closure addKernel(Script.KernelID kernelID, Type type, Object... objArr) {
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            if (seperateArgsAndBindings(objArr, arrayList, map)) {
                return addKernelInternal(kernelID, type, arrayList.toArray(), map);
            }
            return null;
        }

        public ScriptGroup create(String str, Future... futureArr) {
            if (str == null || str.isEmpty() || str.length() > 100 || !str.equals(str.replaceAll("[^a-zA-Z0-9-]", "_"))) {
                throw new RSIllegalArgumentException("invalid script group name");
            }
            return new ScriptGroup(this.mRS, str, this.mClosures, this.mInputs, futureArr);
        }
    }

    public final class Closure extends BaseObj {
        private static final String TAG = "Closure";
        private Object[] mArgs;
        private Map mBindings;
        private FieldPacker mFP;
        private Map mGlobalFuture;
        private Future mReturnFuture;
        private Allocation mReturnValue;

        final class ValueAndSize {
            public int size;
            public long value;

            public ValueAndSize(RenderScript renderScript, Object obj) {
                if (obj instanceof Allocation) {
                    this.value = ((Allocation) obj).getID(renderScript);
                    this.size = -1;
                    return;
                }
                if (obj instanceof Boolean) {
                    this.value = true != ((Boolean) obj).booleanValue() ? 0L : 1L;
                    this.size = 4;
                    return;
                }
                if (obj instanceof Integer) {
                    this.value = ((Integer) obj).longValue();
                    this.size = 4;
                    return;
                }
                if (obj instanceof Long) {
                    this.value = ((Long) obj).longValue();
                    this.size = 8;
                } else if (obj instanceof Float) {
                    this.value = Float.floatToRawIntBits(((Float) obj).floatValue());
                    this.size = 4;
                } else if (obj instanceof Double) {
                    this.value = Double.doubleToRawLongBits(((Double) obj).doubleValue());
                    this.size = 8;
                }
            }
        }

        public Closure(long j, RenderScript renderScript) {
            super(j, renderScript);
        }

        public Closure(RenderScript renderScript, Script.InvokeID invokeID, Object[] objArr, Map map) {
            super(0L, renderScript);
            this.mFP = FieldPacker.createFromArray(objArr);
            this.mArgs = objArr;
            this.mBindings = map;
            this.mGlobalFuture = new HashMap();
            int size = map.size();
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            int[] iArr = new int[size];
            long[] jArr3 = new long[size];
            long[] jArr4 = new long[size];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                Script.FieldID fieldID = (Script.FieldID) entry.getKey();
                jArr[i] = fieldID.getID(renderScript);
                retrieveValueAndDependenceInfo(renderScript, i, fieldID, value, jArr2, iArr, jArr3, jArr4);
                i++;
            }
            setID(renderScript.nInvokeClosureCreate(invokeID.getID(renderScript), this.mFP.getData(), jArr, jArr2, iArr));
        }

        public Closure(RenderScript renderScript, Script.KernelID kernelID, Type type, Object[] objArr, Map map) {
            super(0L, renderScript);
            this.mArgs = objArr;
            this.mReturnValue = Allocation.createTyped(renderScript, type);
            this.mBindings = map;
            this.mGlobalFuture = new HashMap();
            int length = objArr.length + map.size();
            long[] jArr = new long[length];
            long[] jArr2 = new long[length];
            int[] iArr = new int[length];
            long[] jArr3 = new long[length];
            long[] jArr4 = new long[length];
            int i = 0;
            while (i < objArr.length) {
                jArr[i] = 0;
                long[] jArr5 = jArr4;
                long[] jArr6 = jArr3;
                retrieveValueAndDependenceInfo(renderScript, i, null, objArr[i], jArr2, iArr, jArr6, jArr5);
                i++;
                jArr2 = jArr2;
                jArr3 = jArr6;
                jArr4 = jArr5;
                iArr = iArr;
            }
            int i2 = i;
            long[] jArr7 = jArr4;
            long[] jArr8 = jArr3;
            int[] iArr2 = iArr;
            long[] jArr9 = jArr2;
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                Script.FieldID fieldID = (Script.FieldID) entry.getKey();
                jArr[i2] = fieldID.getID(renderScript);
                retrieveValueAndDependenceInfo(renderScript, i2, fieldID, value, jArr9, iArr2, jArr8, jArr7);
                i2++;
            }
            setID(renderScript.nClosureCreate(kernelID.getID(renderScript), this.mReturnValue.getID(renderScript), jArr, jArr9, iArr2, jArr8, jArr7));
        }

        private void retrieveValueAndDependenceInfo(RenderScript renderScript, int i, Script.FieldID fieldID, Object obj, long[] jArr, int[] iArr, long[] jArr2, long[] jArr3) {
            if (obj instanceof Future) {
                Future future = (Future) obj;
                Object value = future.getValue();
                jArr2[i] = future.getClosure().getID(renderScript);
                Script.FieldID fieldID2 = future.getFieldID();
                jArr3[i] = fieldID2 != null ? fieldID2.getID(renderScript) : 0L;
                obj = value;
            } else {
                jArr2[i] = 0;
                jArr3[i] = 0;
            }
            if (!(obj instanceof Input)) {
                ValueAndSize valueAndSize = new ValueAndSize(renderScript, obj);
                jArr[i] = valueAndSize.value;
                iArr[i] = valueAndSize.size;
            } else {
                Input input = (Input) obj;
                if (i < this.mArgs.length) {
                    input.addReference(this, i);
                } else {
                    input.addReference(this, fieldID);
                }
                jArr[i] = 0;
                iArr[i] = 0;
            }
        }

        public Future getGlobal(Script.FieldID fieldID) {
            Future future = (Future) this.mGlobalFuture.get(fieldID);
            if (future != null) {
                return future;
            }
            Object value = this.mBindings.get(fieldID);
            if (value instanceof Future) {
                value = ((Future) value).getValue();
            }
            Future future2 = new Future(this, fieldID, value);
            this.mGlobalFuture.put(fieldID, future2);
            return future2;
        }

        public Future getReturn() {
            if (this.mReturnFuture == null) {
                this.mReturnFuture = new Future(this, null, this.mReturnValue);
            }
            return this.mReturnFuture;
        }

        public void setArg(int i, Object obj) {
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            this.mArgs[i] = obj;
            ValueAndSize valueAndSize = new ValueAndSize(this.mRS, obj);
            RenderScript renderScript = this.mRS;
            renderScript.nClosureSetArg(getID(renderScript), i, valueAndSize.value, valueAndSize.size);
        }

        public void setGlobal(Script.FieldID fieldID, Object obj) {
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            this.mBindings.put(fieldID, obj);
            ValueAndSize valueAndSize = new ValueAndSize(this.mRS, obj);
            RenderScript renderScript = this.mRS;
            renderScript.nClosureSetGlobal(getID(renderScript), fieldID.getID(this.mRS), valueAndSize.value, valueAndSize.size);
        }
    }

    class ConnectLine {
        Allocation mAllocation;
        Type mAllocationType;
        Script.KernelID mFrom;
        Script.FieldID mToF;
        Script.KernelID mToK;

        public ConnectLine(Type type, Script.KernelID kernelID, Script.FieldID fieldID) {
            this.mFrom = kernelID;
            this.mToF = fieldID;
            this.mAllocationType = type;
        }

        public ConnectLine(Type type, Script.KernelID kernelID, Script.KernelID kernelID2) {
            this.mFrom = kernelID;
            this.mToK = kernelID2;
            this.mAllocationType = type;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class Future {
        Closure mClosure;
        Script.FieldID mFieldID;
        Object mValue;

        public Future(Closure closure, Script.FieldID fieldID, Object obj) {
            this.mClosure = closure;
            this.mFieldID = fieldID;
            this.mValue = obj;
        }

        public Closure getClosure() {
            return this.mClosure;
        }

        public Script.FieldID getFieldID() {
            return this.mFieldID;
        }

        public Object getValue() {
            return this.mValue;
        }
    }

    class IO {
        Allocation mAllocation;
        Script.KernelID mKID;

        public IO(Script.KernelID kernelID) {
            this.mKID = kernelID;
        }
    }

    public final class Input {
        Object mValue;
        List mFieldID = new ArrayList();
        List mArgIndex = new ArrayList();

        public void addReference(Closure closure, int i) {
            this.mArgIndex.add(Pair.create(closure, Integer.valueOf(i)));
        }

        public void addReference(Closure closure, Script.FieldID fieldID) {
            this.mFieldID.add(Pair.create(closure, fieldID));
        }

        public Object get() {
            return this.mValue;
        }

        public void set(Object obj) {
            this.mValue = obj;
            for (Pair pair : this.mArgIndex) {
                ((Closure) pair.first).setArg(((Integer) pair.second).intValue(), obj);
            }
            for (Pair pair2 : this.mFieldID) {
                ((Closure) pair2.first).setGlobal((Script.FieldID) pair2.second, obj);
            }
        }
    }

    class Node {
        int dagNumber;
        Node mNext;
        int mOrder;
        Script mScript;
        boolean mSeen;
        ArrayList mKernels = new ArrayList();
        ArrayList mInputs = new ArrayList();
        ArrayList mOutputs = new ArrayList();

        public Node(Script script) {
            this.mScript = script;
        }
    }

    public ScriptGroup(long j, RenderScript renderScript) {
        super(j, renderScript);
        this.mUseIncSupp = false;
        this.mNodes = new ArrayList();
    }

    public ScriptGroup(RenderScript renderScript, String str, List list, List list2, Future[] futureArr) {
        super(0L, renderScript);
        this.mUseIncSupp = false;
        this.mNodes = new ArrayList();
        this.mName = str;
        this.mClosures = list;
        this.mInputs2 = list2;
        this.mOutputs2 = futureArr;
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Closure) list.get(i)).getID(renderScript);
        }
        setID(renderScript.nScriptGroup2Create(str, renderScript.getApplicationContext().getCacheDir().toString(), jArr));
    }

    @Deprecated
    public void execute() {
        int i;
        if (!this.mUseIncSupp) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptGroupExecute(getID(renderScript));
            return;
        }
        for (int i2 = 0; i2 < this.mNodes.size(); i2++) {
            Node node = (Node) this.mNodes.get(i2);
            for (int i3 = 0; i3 < node.mOutputs.size(); i3++) {
                ConnectLine connectLine = (ConnectLine) node.mOutputs.get(i3);
                if (connectLine.mAllocation == null) {
                    Allocation allocationCreateTyped = Allocation.createTyped(this.mRS, connectLine.mAllocationType, Allocation.MipmapControl.MIPMAP_NONE, 1);
                    connectLine.mAllocation = allocationCreateTyped;
                    for (int i4 = i3 + 1; i4 < node.mOutputs.size(); i4++) {
                        if (((ConnectLine) node.mOutputs.get(i4)).mFrom == connectLine.mFrom) {
                            ((ConnectLine) node.mOutputs.get(i4)).mAllocation = allocationCreateTyped;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = this.mNodes;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Node node2 = (Node) arrayList.get(i5);
            ArrayList arrayList2 = node2.mKernels;
            int size2 = arrayList2.size();
            int i6 = 0;
            while (true) {
                i = i5 + 1;
                if (i6 < size2) {
                    Script.KernelID kernelID = (Script.KernelID) arrayList2.get(i6);
                    ArrayList arrayList3 = node2.mInputs;
                    int size3 = arrayList3.size();
                    Allocation allocation = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        ConnectLine connectLine2 = (ConnectLine) arrayList3.get(i7);
                        if (connectLine2.mToK == kernelID) {
                            allocation = connectLine2.mAllocation;
                        }
                    }
                    for (IO io : this.mInputs) {
                        if (io.mKID == kernelID) {
                            allocation = io.mAllocation;
                        }
                    }
                    ArrayList arrayList4 = node2.mOutputs;
                    int size4 = arrayList4.size();
                    Allocation allocation2 = null;
                    for (int i8 = 0; i8 < size4; i8++) {
                        ConnectLine connectLine3 = (ConnectLine) arrayList4.get(i8);
                        if (connectLine3.mFrom == kernelID) {
                            allocation2 = connectLine3.mAllocation;
                        }
                    }
                    for (IO io2 : this.mOutputs) {
                        if (io2.mKID == kernelID) {
                            allocation2 = io2.mAllocation;
                        }
                    }
                    kernelID.mScript.forEach(kernelID.mSlot, allocation, allocation2, (FieldPacker) null);
                    i6++;
                }
            }
            i5 = i;
        }
    }

    public Object[] execute(Object... objArr) {
        int i;
        int length = objArr.length;
        if (length < this.mInputs2.size()) {
            Log.e(TAG, toString() + " receives " + length + " inputs, less than expected " + this.mInputs2.size());
            return null;
        }
        int i2 = 0;
        if (length > this.mInputs2.size()) {
            toString();
            this.mInputs2.size();
            i = 0;
        } else {
            i = 0;
        }
        while (i < this.mInputs2.size()) {
            Object obj = objArr[i];
            if ((obj instanceof Future) || (obj instanceof Input)) {
                Log.e(TAG, toString() + ": input " + i + " is a future or unbound value");
                return null;
            }
            ((Input) this.mInputs2.get(i)).set(obj);
            i++;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptGroup2Execute(getID(renderScript));
        Future[] futureArr = this.mOutputs2;
        int length2 = futureArr.length;
        Object[] objArr2 = new Object[length2];
        int i3 = 0;
        while (i2 < length2) {
            Object value = futureArr[i2].getValue();
            if (value instanceof Input) {
                value = ((Input) value).get();
            }
            objArr2[i3] = value;
            i2++;
            i3++;
        }
        return objArr2;
    }

    @Deprecated
    public void setInput(Script.KernelID kernelID, Allocation allocation) {
        int i = 0;
        while (true) {
            IO[] ioArr = this.mInputs;
            if (i >= ioArr.length) {
                throw new RSIllegalArgumentException("Script not found");
            }
            IO io = ioArr[i];
            if (io.mKID == kernelID) {
                io.mAllocation = allocation;
                if (this.mUseIncSupp) {
                    return;
                }
                RenderScript renderScript = this.mRS;
                renderScript.nScriptGroupSetInput(getID(renderScript), kernelID.getID(this.mRS), this.mRS.safeID(allocation));
                return;
            }
            i++;
        }
    }

    @Deprecated
    public void setOutput(Script.KernelID kernelID, Allocation allocation) {
        int i = 0;
        while (true) {
            IO[] ioArr = this.mOutputs;
            if (i >= ioArr.length) {
                throw new RSIllegalArgumentException("Script not found");
            }
            IO io = ioArr[i];
            if (io.mKID == kernelID) {
                io.mAllocation = allocation;
                if (this.mUseIncSupp) {
                    return;
                }
                RenderScript renderScript = this.mRS;
                renderScript.nScriptGroupSetOutput(getID(renderScript), kernelID.getID(this.mRS), this.mRS.safeID(allocation));
                return;
            }
            i++;
        }
    }
}
