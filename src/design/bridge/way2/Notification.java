package design.bridge.way2;

/**
 * TODO
 *
 * @author fab
 * @date 2021/5/10
 */
public abstract class Notification
{
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender)
    {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
