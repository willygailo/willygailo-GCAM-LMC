.class Lcom/custom/ButtonTF$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/custom/ButtonTF;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/custom/ButtonTF;


# direct methods
.method constructor <init>(Lcom/custom/ButtonTF;)V
    .locals 0

    iput-object p1, p0, Lcom/custom/ButtonTF$2;->this$1:Lcom/custom/ButtonTF;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    invoke-static {}, Lcom/Helper;->onRestart()V

    return-void
.end method
