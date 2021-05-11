package design.bridge.way2;

/**
 * TODO
 *
 * @author fab
 * @date 2021/5/11
 */
public class NormalNotification extends Notification
{
    public NormalNotification(MsgSender msgSender)
    {
        super(msgSender);
    }

    @Override
    public void notify(String message)
    {
        super.msgSender.send(message);
    }
}
