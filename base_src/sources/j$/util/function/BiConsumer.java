package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface BiConsumer {

    /* JADX INFO: renamed from: j$.util.function.BiConsumer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static BiConsumer $default$andThen(final BiConsumer biConsumer, final BiConsumer biConsumer2) {
            biConsumer2.getClass();
            return new BiConsumer() { // from class: j$.util.function.BiConsumer$$ExternalSyntheticLambda0
                @Override // j$.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    BiConsumer.CC.lambda$andThen$0(biConsumer, biConsumer2, obj, obj2);
                }

                @Override // j$.util.function.BiConsumer
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer3) {
                    return BiConsumer.CC.$default$andThen(this, biConsumer3);
                }
            };
        }

        public static /* synthetic */ void lambda$andThen$0(BiConsumer biConsumer, BiConsumer biConsumer2, Object obj, Object obj2) {
            biConsumer.accept(obj, obj2);
            biConsumer2.accept(obj, obj2);
        }
    }

    void accept(Object obj, Object obj2);

    BiConsumer andThen(BiConsumer biConsumer);
}
